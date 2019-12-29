package com.ribuluo.admin.common.constant;

public interface ExpiredType {

    /**
     * 退款
     */
    String REFUNDS = "REFUNDS:"; //退款
    /**
     * 完成
     */
    String COMPLETE = "COMPLETE:"; //完成
    /**
     * 申述
     */
    String COMPLAINT = "COMPLAINT:"; //申述

    Integer REFUNDS_TIME = 7*24*60*60; //自动退款到期时间

    Integer COMPLETE_TIME = 3*24*60*60; //自动完成到期时间

    Integer RETRY_TIME = 1*24*60*60; //自动完成到期时间
  
    /**
     * 禁言   key:  FORBIDDEN_WORDS:#{userid}
     */
    public static String FORBIDDEN_WORDS = "FORBIDDEN_WORDS:"; //禁言
    /**
     * 封号  key:  CLOSEA_CCOUNT:#{userid}
     */
    public static String CLOSEA_CCOUNT = "CLOSEA_CCOUNT:"; //封号

    String PUBLISH = "PUBLISH:"; //匠学发布

    String TOP_CANCEL = "TOP_CANCEL:"; //置顶解除

    String  PUBLISH_MAP = "publishResultMap";

    String TOP_MAP = "topCancelResultMap";
    
}
