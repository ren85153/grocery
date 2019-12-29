package com.ribuluo.admin.common.util;

import com.alibaba.fastjson.JSONObject;
import com.ribuluo.admin.common.util.wxPayUtil.WechatConfig;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

/**
 * 内容安全验证
 */
public class WeixinCheckUtil {
    //图片/音频验证
    static String mediaCheckUrl = "https://api.weixin.qq.com/wxa/media_check_async";
    //内容验证
    static  String msgSecCheckUrl = "https://api.weixin.qq.com/wxa/msg_sec_check";
    //获取token地址
    static String getAccesTokenUrl = "https://api.weixin.qq.com/cgi-bin/token";
    //获取token
     public static String getToken(){
        String url = getAccesTokenUrl + "?grant_type=client_credential&appid="+ WechatConfig.XCX_APP_ID+"&secret="+WechatConfig.XCX_APPSECRET;
        String result = RequestUtil.method(url,"get",new HashMap<>());
        JSONObject json = JSONObject.parseObject(result);
        String access_token = json.getString("access_token");
        return access_token;
    }
    //文字信息验证
    public static Boolean msgSecCheck(String content){
         String token = getToken();
        String url = msgSecCheckUrl + "?access_token=" +token;
        HashMap params = new HashMap<>();
        params.put("content",content);
        String result = RequestUtil.method(url,"post",params);
        JSONObject json = JSONObject.parseObject(result);
        //返回值为0表示验证通过
        String errcode = json.getString("errcode");
        if(errcode.equals("0")){
            return true;
        }else{
            return false;
        }
    }
    //音频图片验证，media_type：1:音频;2:图片
    public static Boolean mediaCheckUrl(String mediaUrl, int media_type){
        String token = getToken();
        String url = mediaCheckUrl + "?access_token=" +token;
        HashMap params = new HashMap<>();
        params.put("media_url",mediaUrl);
        params.put("media_type",media_type);
        String result = RequestUtil.method(url,"post",params);
        JSONObject json = JSONObject.parseObject(result);
        //返回值为0表示验证通过
        String errcode = json.getString("errcode");
        if(errcode.equals("0")){
            return true;
        }else{
            return false;
        }
    }
}
