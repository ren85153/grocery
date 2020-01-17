package com.ribuluo.user.model.entity;


import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

@Data
@TableName("gro_user_c")
public class GroUserC  extends Model<GroUserC>{
	/** 
	 * serialVersionUID
	 */  
	private static final long serialVersionUID = -5267952513343999876L;
	
	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

	/**
	 * 用户ID
	 */
	@TableField(value = "user_id")
    private String userId;
 
	
	/**
	 * 微信昵称
	 */
    @TableField("nick_name")
    private String nickName;
	 
	/**
	 * 头像地址
	 */
    @TableField("head_image_url")
    private String headImageUrl;
    
	/**
	 * 性别 0：未知、1：男、2：女
	 */
    @TableField("sex")
    private String sex;
    
	/**
	 * 手机号
	 */
    @TableField("cell_phone")
    private String cellPhone;
       

	/**
	 * 生日
	 */
    @TableField("birthday")
    private String birthday;
    
	/**
	 * 常住地 手机号归属地
	 */
    @TableField("address")
    private String address;
    
	/**
	 * 备注
	 */
    @TableField("remark")
    private String remark;
    
	/**
	 * 创建时间
	 */
    @TableField("create_time")
    private String createTime;
    

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
