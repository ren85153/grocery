package com.ribuluo.admin.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModelProperty;

@Data
public class QuestionListDto implements Serializable{

    private String  pageNum;//分页数
    private String  pageSize;//分页大小
    private String  userId;//当前登录人的ID
    private String  listType;//列表类型,0我的关注1榜单2全球
    private String focusUserId;//被关注人的UserID
    private String source;//问题创建人来源，微信、微博和QQ
    private String questionId;//被关注人的发布的问题的ID
    private String address;//地址信息
    private Timestamp createTime;//问题发布时间
    private String createTimeP;//问题发布时间参数
    private String content;//问题内容
    private String imgPathX;//缩略图图片路径
    private String imgPath;//真实图片路径
    private String questionRange;//问题范围
    private Double questionReward;//问题赏金
    private String questionType;//问题类型
    private int likeNum;//点赞数量
    private int replyNum;//评论数量
    private int collectNum;//收藏数量
    @ApiModelProperty(value="转发数量")
    private int forwardNum;//转发数量
    private int weight;//权重
    private String createUserHeadImgX;//问题发布人头像缩略图
    private String createUserHeadImg;//问题发布人头像真实路径
    private String nickname;//问题发布人昵称
    private int isCollect;//是否收藏了
    @ApiModelProperty(value="点赞状态|0:已点赞、1:未点赞")
    private int isLike;//是否点赞
    @ApiModelProperty(value="转发状态|0:已转发、1:未转发")
    private int isForward;
    @ApiModelProperty(value="评论状态|0:已评论、1:未评论")
    private int isReply;
    @ApiModelProperty(value="是否已经关注|0:关注、1:未关注")
    private int isFocus;
    private String rewardType;//赏金类型
    private String jxId;//匠学Id
    @ApiModelProperty(value="是否转发问题|0:原创、1:转发")
    private String ifForward;//是否转发问题|0:原创、1:转发
    @ApiModelProperty(value="被转发人用户id")
    private String forwardUserId;
    @ApiModelProperty(value="被转发人用户昵称")
    private String forwardUserName;
    @ApiModelProperty(value="被转发人id")
    private String forwardJxId;


}
