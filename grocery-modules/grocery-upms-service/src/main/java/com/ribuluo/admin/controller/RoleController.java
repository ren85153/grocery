package com.ribuluo.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ribuluo.admin.model.dto.RoleDTO;
import com.ribuluo.admin.model.entity.SysRole;
import com.ribuluo.admin.service.SysRoleMenuService;
import com.ribuluo.admin.service.SysRoleService;
import com.ribuluo.common.constant.CommonConstant;
import com.ribuluo.common.util.Query;
import com.ribuluo.common.util.R;
import com.ribuluo.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Map;

/**
 * @author
 */

@ApiIgnore
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 通过ID查询角色信息
     * @param id ID
     * @return 角色信息
     */
    @GetMapping("/{id}")
    public SysRole role(@PathVariable Integer id) {
        return sysRoleService.selectById(id);
    }

    /**
     * 添加角色
     *
     * @param roleDto 角色信息
     * @return success、false
     */
    @PostMapping
    public R<Boolean> role(@RequestBody RoleDTO roleDto) {
        return new R<>(sysRoleService.insertRole(roleDto));
    }

    /**
     * 修改角色
     *
     * @param roleDto 角色信息
     * @return success/false
     */
    @PutMapping
    public R<Boolean> roleUpdate(@RequestBody RoleDTO roleDto) {
        return new R<>(sysRoleService.updateRoleById(roleDto));
    }

    @DeleteMapping("/{id}")
    public R<Boolean> roleDel(@PathVariable Integer id) {
        SysRole sysRole = sysRoleService.selectById(id);
        sysRole.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(sysRoleService.updateById(sysRole));
    }

    /**
     * 获取角色列表
     *
     * @param deptId 部门ID
     * @return 角色列表
     */
    @GetMapping("/roleList/{deptId}")
    public List<SysRole> roleList(@PathVariable Integer deptId) {
        return sysRoleService.selectListByDeptId(deptId);

    }

    /**
     * 分页查询角色信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @RequestMapping("/rolePage")
    public Page rolePage(@RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return sysRoleService.selectwithDeptPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 更新角色菜单
     *
     * @param roleId  角色ID
     * @param menuIds 菜单结合
     * @return success、false
     */
    @PutMapping("/roleMenuUpd")
    public R<Boolean> roleMenuUpd(Integer roleId, @RequestParam(value = "menuIds", required = false) String menuIds) {
        SysRole sysRole = sysRoleService.selectById(roleId);
        return new R<>(sysRoleMenuService.insertRoleMenus(sysRole.getRoleCode(), roleId, menuIds));
    }
}
