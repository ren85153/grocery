package com.ribuluo.admin.model.mo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DailyTaskEntity implements Serializable {

    /** 
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = -8277191772725648015L;

	/**
     * 用户id
     */
    private String userId;

    /**
     * 任务类型 1 发布 2 回答 3 查看问题详情
     */
    private String taskType;

}
