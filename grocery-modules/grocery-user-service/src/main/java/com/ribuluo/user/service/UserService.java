package com.ribuluo.user.service;


import com.alibaba.fastjson.JSONObject;

/**
 * 
 * <p>Title: UserService</p>  
 * Description: 用户管理 
 * @author saury  
 * @date 2020年1月10日
 */
public interface UserService {

	
	/**
	* Description:查询用户信息
	* @Author saury
	* @date 2020年1月10日 
	* @param userId
	* @return
	 */
	JSONObject findByUserId( String userId);
}
