package com.ribuluo.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ribuluo.admin.common.util.TreeUtil;
import com.ribuluo.admin.model.dto.MenuTree;
import com.ribuluo.admin.model.entity.SysMenu;
import com.ribuluo.admin.service.SysMenuService;
import com.ribuluo.common.constant.CommonConstant;
import com.ribuluo.common.util.R;
import com.ribuluo.common.vo.MenuVO;
import com.ribuluo.common.web.BaseController;
import com.xiaoleilu.hutool.collection.CollUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

/**
 * @author
 */

@ApiIgnore
@RestController
@RequestMapping("/menu")
public class MenuController extends BaseController {

    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 通过角色名称查询用户菜单
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping("/findMenuByRole/{role}")
    public List<MenuVO> findMenuByRole(@PathVariable String role) {
        return sysMenuService.findMenuByRoleName(role);
    }

    /**
     * 返回当前用户的树形菜单集合
     *
     * @return 当前用户的树形菜单
     */
    @GetMapping(value = "/userMenu")
    public List<MenuTree> userMenu() {
        // 获取符合条件得菜单
        Set<MenuVO> all = new HashSet<>();
        getRole().forEach(roleName -> all.addAll(sysMenuService.findMenuByRoleName(roleName)));
        List<MenuTree> menuTreeList = new ArrayList<>();
        all.forEach(menuVo -> {
            if (CommonConstant.MENU.equals(menuVo.getType())) {
                menuTreeList.add(new MenuTree(menuVo));
            }
        });
        CollUtil.sort(menuTreeList, Comparator.comparingInt(MenuTree::getSort));
        return TreeUtil.bulid(menuTreeList, -1);
    }

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/allTree")
    public List<MenuTree> getTree() {
        SysMenu condition = new SysMenu();
        condition.setDelFlag(CommonConstant.STATUS_NORMAL);
        return TreeUtil.bulidTree(sysMenuService.selectList(new EntityWrapper<>(condition)), -1);
    }
    
    /**
     * 返回角色的菜单集合
     *
     * @param roleName 角色名称
     * @return 属性集合
     */
    @GetMapping("/roleTree/{roleName}")
    public List<Integer> roleTree(@PathVariable String roleName) {
        List<MenuVO> menus = sysMenuService.findMenuByRoleName(roleName);
        List<Integer> menuList = new ArrayList<>();
        for (MenuVO menuVo : menus) {
            menuList.add(menuVo.getMenuId());
        }
        return menuList;
    }

    /**
     * 通过ID查询菜单的详细信息
     *
     * @param id 菜单ID
     * @return 菜单详细信息
     */
    @GetMapping("/{id}")
    public SysMenu menu(@PathVariable Integer id) {
        return sysMenuService.selectById(id);
    }

    /**
     * 新增菜单
     *
     * @param sysMenu 菜单信息
     * @return success/false
     */
    @PostMapping
    public R<Boolean> menu(@RequestBody SysMenu sysMenu) {
        return new R<>(sysMenuService.insert(sysMenu));
    }

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return success/false
     * TODO  级联删除下级节点
     */
    @DeleteMapping("/{id}")
    public R<Boolean> menuDel(@PathVariable Integer id) {
        return new R<>(sysMenuService.deleteMenu(id));
    }

    @PutMapping
    public R<Boolean> menuUpdate(@RequestBody SysMenu sysMenu) {
        return new R<>(sysMenuService.updateMenuById(sysMenu));
    }

}
