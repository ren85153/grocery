package com.ribuluo.admin.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 我的信息页面DTO
 */
@Data
@ApiModel(description = "个人主页资料信息实体类")
public class MyViewDto implements Serializable{

    @ApiModelProperty(value = "格言")
    private String  aphorism;//格言

    @ApiModelProperty(value = "匠学ID号")
    private String  jxId;//匠学ID号

    @ApiModelProperty(value = "账户余额")
    private double accountNum;//账户余额

    @ApiModelProperty(value = "鲜花数量")
    private int flowerNum;

    @ApiModelProperty(value = "积分")
    private int integral;//积分

    @ApiModelProperty(value = "当前用户发布的问题数量")
    private int questionNum;//当前用户发布的问题数量

    @ApiModelProperty(value = "当前用户关注了多少人")
    private int focusNum;//当前用户关注了多少人

    @ApiModelProperty(value = "当前用户的粉丝数量")
    private int fansNum;//当前用户的粉丝数量

    @ApiModelProperty(value = "当前用户的回答量")
    private int answerNum;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;//用户昵称

    @ApiModelProperty(value = "缩略图图片路径")
    private String imgPathX;//缩略图图片路径

    @ApiModelProperty(value = "真实图片路径")
    private String imgPath;//真实图片路径

    @ApiModelProperty(value = "用户userid")
    private String  userId;//用户id

    @ApiModelProperty(value = "是否签到")
    private String isSign;//是否签到

}
