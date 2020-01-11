package com.ribuluo.order.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.order.service.OrderService;

/**
 * 
* <p>Title: OrderServiceImpl</p>  
* Description:订单服务
* @author saury  
* @date 2020年1月10日
 */

@Service
public class OrderServiceImpl implements  OrderService{

	/**
	 * Description:通过用户查询订单信息
	 * @Author saury
	 * @date 2020年1月10日 
	 * @param userId
	 * @return
	 */
	@Override
	public JSONObject findOrderByUserId(String userId) {
		JSONObject result= new  JSONObject();
		result.put("orderMessage","订单系统调用成功="+userId);
		return result;
	}

}
