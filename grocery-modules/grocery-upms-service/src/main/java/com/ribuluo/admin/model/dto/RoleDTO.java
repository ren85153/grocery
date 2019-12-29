package com.ribuluo.admin.model.dto;

import com.ribuluo.admin.model.entity.SysRole;
import lombok.Data;

/**
 * @author
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {

    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;

}
