package com.ribuluo.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ribuluo.user.model.entity.GroUserC;

@Mapper
public interface GroUserMapper  extends BaseMapper<GroUserC>{
	
	/**
	 * Description:查看用户
	 * @Author saury
	 * @date 2020年1月15日 
	 * @param userId
	 * @return
	 */
	GroUserC findByUserId(@Param("userId") String userId);

}
