package com.ribuluo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.ribuluo.user.service.UserService;

/**
 * <p>Title: UserController</p>  
 * Description: 用户模块
 * @author saury  
 * @date 2020年1月10日
 */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private   UserService userService;
	
    @GetMapping("/findByUserId/{userId}")
    public JSONObject findByUserId(@PathVariable String userId) {
        return userService.findByUserId(userId);
    }

}
