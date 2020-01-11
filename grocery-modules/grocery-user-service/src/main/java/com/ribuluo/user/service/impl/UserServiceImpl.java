package com.ribuluo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.user.fegin.OrderFeginService;
import com.ribuluo.user.service.UserService;

/**
 * <p>Title: UserServiceImpl</p>  
 * Description:用户service
 * @author saury  
 * @date 2020年1月10日
 */
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private  OrderFeginService orderFeginService;

	@Override
	public JSONObject findByUserId(String userId) {
		JSONObject result= new  JSONObject();
		result.put("userMessage", "用户系统调用成功");
		JSONObject resultOrder=orderFeginService.findByUserId(userId);
		result.put("orderMessage", resultOrder.get("orderMessage"));
		result.put("userId", userId);
		return result;
	}

}
