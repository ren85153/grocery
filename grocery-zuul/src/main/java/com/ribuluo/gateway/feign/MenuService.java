package com.ribuluo.gateway.feign;

import com.ribuluo.common.vo.MenuVO;
import com.ribuluo.gateway.feign.fallback.MenuServiceFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

/**
 * @author
 */
@FeignClient(name = "jx-upms-service", fallback = MenuServiceFallbackImpl.class)
public interface MenuService {

    /**
     * 通过角色名查询菜单
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping(value = "/menu/findMenuByRole/{role}")
    Set<MenuVO> findMenuByRole(@PathVariable("role") String role);
}
