package com.ribuluo.admin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ribuluo.admin.model.dto.RoleDTO;
import com.ribuluo.admin.model.entity.SysDict;
import com.ribuluo.admin.service.SysDictService;
import com.ribuluo.common.constant.CommonConstant;
import com.ribuluo.common.util.Query;
import com.ribuluo.common.util.R;
import com.ribuluo.common.web.BaseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 *
 * @author
 */
@RestController
@RequestMapping("/dict")
@Api(tags="字典管理v2.0")
public class DictController extends BaseController {

    @Autowired
    private SysDictService sysDictService;

    /**
     * 通过ID查询字典信息
     * @param id ID
     * @return 字典信息
     */
    @GetMapping("/{id}")
    public SysDict dict(@PathVariable Integer id) {
        return sysDictService.selectById(id);
    }

    /**
     * 分页查询字典信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @RequestMapping("/dictPage")
    public Page dictPage(@RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return sysDictService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 通过字典类型查找字典
     *
     * @param type 类型
     * @return 同类型字典
     */
    @GetMapping("/type/{type}")
    @Cacheable(value = "dict_details", key = "#type")
    @ApiOperation(value="通过字典类型查找字典", notes="2.0 严杰")
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "{type}", value = "字典类型", required = true, paramType = "query", dataType = "String")
            }
    )
    public List<SysDict> findDictByType(@PathVariable String type) {
        SysDict condition = new SysDict();
        condition.setDelFlag(CommonConstant.STATUS_NORMAL);
        condition.setType(type);
        return sysDictService.selectList(new EntityWrapper<>(condition));
    }

    /**
     * 添加字典
     *
     * @param sysDict 字典信息
     * @return success、false
     */
    @PostMapping
    @CacheEvict(value = "dict_details", key = "#sysDict.type")
    public R<Boolean> dict(@RequestBody SysDict sysDict) {
        return new R<>(sysDictService.insert(sysDict));
    }

    /**
     * 删除字典，并且清除字典缓存
     *
     * @param id   ID
     * @param type 类型
     * @return R
     */
    @DeleteMapping("/{id}/{type}")
    @CacheEvict(value = "dict_details", key = "#type")
    public R<Boolean> deleteDict(@PathVariable Integer id, @PathVariable String type) {
        return new R<>(sysDictService.deleteById(id));
    }

    /**
     * 修改字典
     *
     * @param sysDict 字典信息
     * @return success/false
     */
    @PutMapping
    @CacheEvict(value = "dict_details", key = "#sysDict.type")
    public R<Boolean> editDict(@RequestBody SysDict sysDict) {
        return new R<>(sysDictService.updateById(sysDict));
    }
}
