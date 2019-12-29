package com.ribuluo.admin.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class MyFocusListDto implements Serializable{
    private String focusUserId;//被关注人的UserID
    private String imgPathX;//缩略图图片路径
    private String imgPath;//真实图片路径
    private String nickname;//昵称
    private String aphorism;//格言
    private String fansUserId;//粉丝的UserId
    private Integer isFocus = 0;//是否关注,0已关注，1未关注，默认为0已关注
    private String friendUserId;//好友的UserId
    private String jxId;//匠学ID


}
