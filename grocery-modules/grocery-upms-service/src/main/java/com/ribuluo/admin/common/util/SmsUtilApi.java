/**
 * Copyright (C),
 * FileName: SmsUtilApi
 * Author:   weiyz
 * Date:     2019/1/15 17:37
 * Description: 云片网短信发送工具
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.admin.common.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.yunpian.sdk.util.HttpUtil.post;

/**
 * 〈云片网短信发送工具API〉
 *
 * @author weiyz
 * @create 2019/1/15
 * @since 1.0.0
 */
public class SmsUtilApi {

    /**
     * 服务http地址
     */
    private static String BASE_URI = "https://sms.yunpian.com";
    /**
     * 服务版本号
     */
    private static String VERSION = "v2";
    /**
     * 编码格式
     */
    private static String ENCODING = "UTF-8";
    /**
     * 查账户信息的http地址
     */
    private static String URI_GET_USER_INFO = BASE_URI + "/" + VERSION + "/user/get.json";
    /**
     * 通用发送接口的http地址
     */
    private static String URI_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/single_send.json";
    /**
     * 模板发送接口的http地址
     */
    private static String URI_TPL_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/tpl_send.json";

    /**
     * 模板id
     */
    private static long TPL_ID = 2162264;

    private static String APIKEY = "d58572b356b567753d882340206fa45e";

    /**
     * 取账户信息
     *
     * @return json格式字符串
     * @throws IOException
     */
    public static String getUserInfo(String apikey) throws IOException {
        HttpClient client = new HttpClient();
        HttpMethod method = new GetMethod(URI_GET_USER_INFO + "?apikey=" + apikey);
        HttpMethodParams param = method.getParams();
        param.setContentCharset(ENCODING);
        client.executeMethod(method);
        return method.getResponseBodyAsString();
    }

    /**
     * 发短信
     *
     * @param apikey apikey
     * @param text   　短信内容
     * @param mobile 　接受的手机号
     * @return json格式字符串
     * @throws IOException
     */
    public static String sendSms(String apikey, String text, String mobile) throws IOException {
        HttpClient client = new HttpClient();
        NameValuePair[] nameValuePairs = new NameValuePair[3];
        nameValuePairs[0] = new NameValuePair("apikey", apikey);
        nameValuePairs[1] = new NameValuePair("text", text);
        nameValuePairs[2] = new NameValuePair("mobile", mobile);
        PostMethod method = new PostMethod(URI_SEND_SMS);
        method.setRequestBody(nameValuePairs);
        HttpMethodParams param = method.getParams();
        param.setContentCharset(ENCODING);
        client.executeMethod(method);
        return method.getResponseBodyAsString();
    }

    /**
     * 通过模板发送短信
     *
     * @param mobile 　接收的手机号
     * @return json格式字符串
     * @throws IOException
     */
//     @param apikey    apikey
//     @param tpl_id    　模板id
//     @param tpl_value 　模板变量值
    public static String tplSendSms(String mobile) throws IOException {
        HttpClient client = new HttpClient();
        NameValuePair[] nameValuePairs = new NameValuePair[4];
        nameValuePairs[0] = new NameValuePair("apikey", APIKEY);
        nameValuePairs[1] = new NameValuePair("tpl_id", String.valueOf(TPL_ID));
        nameValuePairs[2] = new NameValuePair("tpl_value", randomStr());
        nameValuePairs[3] = new NameValuePair("mobile", mobile);
        PostMethod method = new PostMethod(URI_TPL_SEND_SMS);
        method.setRequestBody(nameValuePairs);
        HttpMethodParams param = method.getParams();
        param.setContentCharset(ENCODING);
        client.executeMethod(method);
        return method.getResponseBodyAsString();
    }

    /**
     * 随机六位数
     *
     * @return String
     */
    private static String randomStr() {
        int i = (int) ((Math.random() * 9 + 1) * 100000);
        return String.valueOf(i);
    }

    public static String smsSend() {
        String str = null;
        try {

            Map<String, String> params = new HashMap<String, String>();//请求参数集合
            params.put("apikey", "d58572b356b567753d882340206fa45e");
            params.put("text", "【匠学网】您正在找回密码,验证码：" + randomStr() + "（15分钟内有效，如非本人操作，请忽略）。");
            params.put("mobile", "15195967241");
            str = post("https://sms.yunpian.com/v2/sms/single_send.json", params);
            System.out.print("返回结果是：" + str);
            return str;//请自行使用post方式请求,可使用Apache HttpClient
        } catch (Exception e) {
            System.out.println("短信发送失败");
            return str;
        }
    }

    //修改为您的apikey
//            String apikey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    //修改为您要发送的手机号
//            String mobile = "188xxxxxxxx";

    /**************** 查账户信息调用示例 *****************/
//            System.out.println(SmsUtilApi.getUserInfo(apikey));

    /**************** 使用通用接口发短信 *****************/
    //设置您要发送的内容
//            String text = "您的验证码是1234【云片网】";
    //发短信调用示例
//            System.out.println(SmsUtilApi.sendSms(apikey, text, mobile));

    /**************** 使用模板接口发短信 *****************/
    //设置模板ID，如使用1号模板:您的验证码是#code#【#company#】
//            long tpl_id=2162264;
    //设置对应的模板变量值
//            String tpl_value="#code#=";
    //模板发送的调用示例
//            System.out.println(SmsUtilApi.tplSendSms(apikey,mobile));

}
