package com.ribuluo.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.ribuluo.common.entity.SysZuulRoute;

/**
 * <p>
 * 动态路由配置表 服务类
 * </p>
 * @author
 */
public interface SysZuulRouteService extends IService<SysZuulRoute> {

    /**
     * 立即生效配置
     * @return
     */
    Boolean applyZuulRoute();

}
