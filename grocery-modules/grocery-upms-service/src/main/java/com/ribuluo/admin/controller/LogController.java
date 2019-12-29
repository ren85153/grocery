package com.ribuluo.admin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ribuluo.admin.service.SysLogService;
import com.ribuluo.common.constant.CommonConstant;
import com.ribuluo.common.util.Query;
import com.ribuluo.common.util.R;
import com.ribuluo.common.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author
 */
@RestController
@RequestMapping("/log")
@Api(tags="日志服务",description = "用户登录和注册相关接口")
public class LogController extends BaseController {

    @Autowired
    private SysLogService sysLogService;

    /**
     * 分页查询日志信息
     * @param params 分页对象
     * @return 分页对象
     */
    @GetMapping("/logPage")
    @ApiOperation(value = "分页获取片区管理信息", notes = "分页获取片区管理信息列表", response = R.class)
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(name = "page", value = "分页参数：第几页", required = true, paramType = "query", dataType = "int"),
                    @ApiImplicitParam(name = "limit", value = "分页参数：每页数量", required = true, paramType = "query", dataType = "int"),
                    @ApiImplicitParam(name = "orderByField", value = "排序字段", required = false, paramType = "query", dataType = "string"),
            }
    )
    public Page logPage(@ApiIgnore @RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return sysLogService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 根据ID
     *
     * @param id ID
     * @return success/false
     */
    @ApiOperation(value = "根据ID删除", notes = "根据ID删除日志", response = R.class)
    @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "path")
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable Long id) {
        return new R<>(sysLogService.updateByLogId(id));
    }
}
