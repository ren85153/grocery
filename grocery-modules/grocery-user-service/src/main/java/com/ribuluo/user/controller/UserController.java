package com.ribuluo.user.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ribuluo.user.model.entity.GroUserC;
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
	
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private   UserService userService;
	
	/**
	 * 获取用户信息 
	 * 如果缓存存在，从缓存中获取
	 * 如果缓存不存在，从 DB 中获取信息，然后插入缓存
	 * Description: 
	* @Author saury
	* @date 2020年1月16日 
	* @param userId
	* @return
	 */
    @GetMapping("/findByUserId/{userId}")
    public GroUserC findByUserId(@PathVariable String userId) {
          return  userService.findByUserId(userId);
    }
    
    @GetMapping("/getAllUsers")
    public  List<GroUserC> getAllUsers(){
    	return userService.getAllUsers();
    	
    }
    
    /**
     * 更新用户
     * 如果缓存存在，删除
     * 如果缓存不存在，不操作
     * Description:
     * @Author saury
     * @date 2020年1月16日 
     * @param user
     */
    @PostMapping("/updateUser")
    public void updateUser(@RequestBody  GroUserC user) {
    	userService.updateUser(user);
    }
    
    /**
     *  删除用户
     *  如果缓存中存在，删除
     * Description:
     * @Author saury
     * @date 2020年1月16日 
     * @param userId
     */
    @GetMapping("/deleteById/{userId}")
    public void deleteById(@PathVariable String userId) {
    	userService.deleteById(userId);
    }
    
    /**
     * 
     * Description: 共享 Session
     * @Author saury
     * @date 2020年1月16日 
     * @param session
     * @return
     */
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

}
