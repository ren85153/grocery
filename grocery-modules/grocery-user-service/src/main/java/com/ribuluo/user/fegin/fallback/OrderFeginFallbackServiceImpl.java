package com.ribuluo.user.fegin.fallback;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.user.fegin.OrderFeginService;

/**
 * 
 * <p>Title: OrderFeginFallbackServiceImpl</p>  
 * Description:熔断订单系统
 * @author saury  
 * @date 2020年1月10日
 */
@Service
public class OrderFeginFallbackServiceImpl  implements OrderFeginService{

	@Override
	public JSONObject findByUserId(String userId) {
		JSONObject json= new JSONObject();
		json.put("orderMessage", userId+"=订单系统都鸡儿挂了，还调？");
		return json;
	}

}
