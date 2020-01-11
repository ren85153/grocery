package com.ribuluo.order.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSONObject;

/**
 * 
* <p>Title: OrderService</p>  
* Description:订单服务
* @author saury  
* @date 2020年1月10日
 */
public interface OrderService {
	
	/**
	 * Description:通过用户查询订单信息
	 * @Author saury
	 * @date 2020年1月10日 
	 * @param userId
	 * @return
	 */
	JSONObject  findOrderByUserId(String  userId);

}
