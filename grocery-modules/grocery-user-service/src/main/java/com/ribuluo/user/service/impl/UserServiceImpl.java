package com.ribuluo.user.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.ribuluo.user.fegin.OrderFeginService;
import com.ribuluo.user.mapper.GroUserMapper;
import com.ribuluo.user.model.entity.GroUserC;
import com.ribuluo.user.service.UserService;

/**
 * <p>Title: UserServiceImpl</p>  
 * Description:用户service
 * @author saury  
 * @date 2020年1月10日
 */
@Service
public class UserServiceImpl  implements UserService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
   private  GroUserMapper groUserMapper; 
	
	@Autowired
	private  OrderFeginService orderFeginService;

	@Override
	@Cacheable(value = "user",key = "'user:'+#id", unless="#result == null")
	public GroUserC findByUserId(String id) {
		GroUserC  groUserC =groUserMapper.selectById(id);
		JSONObject resultOrder=orderFeginService.findByUserId(id);
		System.err.println(resultOrder.toJSONString());
		return groUserC;
	}
	
	@Cacheable(value = "user-all", unless = "#result.size() == 0")
    public List<GroUserC> getAllUsers() {
        logger.info("获取所有用户列表");
        return groUserMapper.selectList(null);
    }

	@Override
    @Caching(evict = {@CacheEvict(value = "user-all", allEntries = true),
    		     @CacheEvict(value = "user",key = "'user:'+#user.id")})
	public GroUserC updateUser(GroUserC user) {
		groUserMapper.updateById(user);
		return user;
	}

	@Override
	@Caching(evict = {@CacheEvict(value = "user-all", allEntries = true),
		     @CacheEvict(value = "user",key = "'user:'+#user.id")})
	public void deleteById(String userId) {
		groUserMapper.deleteById(userId);
	}

	 @Override
	 @Caching(put = {@CachePut(value = "user", key = "#user.id.toString()")},
	          evict = {@CacheEvict(value = "user-all", allEntries = true)})
	public GroUserC saveUser(GroUserC user) {
		 groUserMapper.insert(user);
		 return  user;
		 
	}
}
