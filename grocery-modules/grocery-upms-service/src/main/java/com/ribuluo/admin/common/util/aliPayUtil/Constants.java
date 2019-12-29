package com.ribuluo.admin.common.util.aliPayUtil;

import io.swagger.models.auth.In;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static String apikey = "d58572b356b567753d882340206fa45e";
    public static String mobileModelStart = "【匠学网】您的验证码：";
    public static String mobileModelEnd = "（15分钟内有效，如非本人操作，请忽略）。";
    public static String yunpianUrl = "https://sms.yunpian.com/v2/sms/single_send.json";

    public static String findPawModelStart = "【匠学网】您正在找回密码,验证码：";
    public static String registModelStart="【匠学网】您正在进行注册，验证码：";

    /**
     * 保存手机获取验证码的次数
     */
    public static String mobileCount="verCode:mobileCount:";

    /**
     * 至第一次记录后获取次数后多久内可从新获取发送次数
     */
    public static Long duration= 60 * 60 * 24L;

    /**
     * 保存手机获取验证码的次数
     */
    public static String mobile="verCode:mobile:";

    /**
     * 手机获取验证码限制解除时间
     */
    public static Long baseExpired = 60L ;

    /**
     * 24小时内每个ip拦截次数
     */
    public static Integer ipCount = 100 ;


    /**
     * 手机获取验证码限制解除时间，
     * key 发送次数
     * value 受限时长
     * mobileExpired.size() 含义为，在duration 时长之内 最多发送的验证码次数
     */
    private static Map<Integer,Long> mobileExpired = new HashMap<>();

    /**
     *
     * @param count
     */
    public static Long getmobileExpiredByCount(Integer count){
        if(count == null){
            count = 1;
        }
        if( count >= Constants.mobileExpired.size()){
            count = Constants.mobileExpired.size();
        }
        return mobileExpired.get(count);
    }

    static {

        mobileExpired.put(1,baseExpired);
        mobileExpired.put(2,baseExpired);
        mobileExpired.put(3,baseExpired);
        mobileExpired.put(4,2*baseExpired);
        mobileExpired.put(5,2*baseExpired);
        mobileExpired.put(6,2*baseExpired);
        mobileExpired.put(7,3*baseExpired);
        mobileExpired.put(8,3*baseExpired);
        mobileExpired.put(9,3*baseExpired);
        mobileExpired.put(10,24*60*baseExpired);

    }

    /**
     * 保存获取验证码的值
     */
    public static String verCode="verCode:verCode:";

    /**
     * 保存获取验证码的值
     */
    public static Long verCodeExpired = 60 * 15L  ;
}
