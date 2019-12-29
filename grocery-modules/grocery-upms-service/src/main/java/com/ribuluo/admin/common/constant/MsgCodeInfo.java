package com.ribuluo.admin.common.constant;

import com.google.common.collect.Maps;

import java.util.Map;

public class MsgCodeInfo {

    public static final Map<Integer, String> MESSAGE_MAP = Maps.newHashMap();

    static {

        /**
         * 1xxx  1系统推送
         */
        MESSAGE_MAP.put(1001, "亲爱的 %s，提现 %s 元到账请查收");
        MESSAGE_MAP.put(1002, "亲爱的 %s ，购买 %s 鲜花成功请查收");

        /**
         * 2xxx  2产品推荐
         */
        MESSAGE_MAP.put(2001, "亲爱的同学早上好，打开匠学，发现更多有趣问题");
        MESSAGE_MAP.put(2002,"心中有疑惑？来匠学免费发布");
        MESSAGE_MAP.put(2003,"你的关注 %s 发布了一道问题，去查看");

        /**
         * 3xxx  3日常消息
         */
        MESSAGE_MAP.put(3001, "您有一条未读消息");
        MESSAGE_MAP.put(3002,"%s 回答了您的提问，去看看");
        MESSAGE_MAP.put(3003,"%s 认同你的提问");
        MESSAGE_MAP.put(3004, "%s 转发了你的提问");
        MESSAGE_MAP.put(3005,"%s 给您的回答赠送了 %s 朵鲜花，去查看");

        /**
         * 4xxx  4活动提醒
         */
        MESSAGE_MAP.put(4001,"您完成了邀请任务，恭喜您获得 %s 鲜花");
    }


}
