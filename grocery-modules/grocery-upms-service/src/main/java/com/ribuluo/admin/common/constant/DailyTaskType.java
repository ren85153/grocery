package com.ribuluo.admin.common.constant;

public interface DailyTaskType {

    Integer FINISH = 1;

    Integer NOT_FINISH = 0;

    String PUBLISH_TYPE = "1"; //发布

    String ANSWER_TYPE = "2"; //回答

    String  VIEW_APP_TYPE = "3"; //查看问题详情APP

    String  VIEW_QQ_TYPE = "4"; //查看问题详情QQ

    String  VIEW_WECHAT_TYPE = "5"; //查看问题详情WECHAT

    String INVITE_TYPE = "6"; //邀请

    String DAILY_TASK_REDIS_KEY = "dailyTask";

    String PUBLISH_MAP_KEY = "publish";

    String ANSWER_MAP_KEY = "answer";




}
