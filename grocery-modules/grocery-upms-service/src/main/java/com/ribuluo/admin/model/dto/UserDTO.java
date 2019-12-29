package com.ribuluo.admin.model.dto;

import com.ribuluo.admin.model.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author
 */
@Data
public class UserDTO extends SysUser {

    /**
     * 角色ID
     */
    private List<Integer> role;

    private Integer deptId;

    /**
     * 新密码
     */
    private String newpassword1;
}

