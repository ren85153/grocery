package com.ribuluo.user.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.user.fegin.fallback.OrderFeginFallbackServiceImpl;


/**
 * 
* <p>Title: OrderFeginService</p>  
* Description:远程调用订单系统
* @author saury  
* @date 2020年1月10日
 */
@FeignClient(name = "grocery-order-service",path="/grocery-order", fallback = OrderFeginFallbackServiceImpl.class)
public interface OrderFeginService{
	
	@GetMapping("/order/findByUserId/{userId}")
    public JSONObject findByUserId(@PathVariable(value="userId") String userId);

}
