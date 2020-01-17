package com.ribuluo.user.service;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.ribuluo.user.model.entity.GroUserC;

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
	GroUserC findByUserId( String id);

	GroUserC  updateUser(GroUserC user);
	
	void deleteById(String userId);
	
	List<GroUserC> getAllUsers();
	
	GroUserC  saveUser(GroUserC user);
	
	
}
