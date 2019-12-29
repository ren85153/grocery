package com.ribuluo.admin.model.dto;

import com.ribuluo.admin.model.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * commit('SET_ROLES', data)
 * commit('SET_NAME', data)
 * commit('SET_AVATAR', data)
 * commit('SET_INTRODUCTION', data)
 * commit('SET_PERMISSIONS', data)
 */
@Data
public class UserInfo implements Serializable {

    /** 
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = 2215824045816285700L;
	/**
     * 用户基本信息
     */
    private SysUser sysUser;
    /**
     * 权限标识集合
     */
    private String[] permissions;

    /**
     * 角色集合
     */
    private String[] roles;
}
