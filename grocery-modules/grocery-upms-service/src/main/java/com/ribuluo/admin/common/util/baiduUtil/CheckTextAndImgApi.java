package com.ribuluo.admin.common.util.baiduUtil;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import com.ribuluo.admin.common.util.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class CheckTextAndImgApi {
    private static final String URL = "https://aip.baidubce.com/rest/2.0/antispam/v2/spam";
    private static final String ImgURL = "https://aip.baidubce.com/rest/2.0/solution/v1/img_censor/user_defined";
    /**
     * @param content 需要审核的文本
     */
    public static String check(String content,RedisUtil redisUtil) {
        String access_token = "";
        List<Review> reviews = null;
        try{
            //获取access_token,从Redis中获取，如果没有获取到或者调用失败再重新生成token放入REDIS中
            access_token = (String) redisUtil.get(BaiduConstants.ACCESS_TOCKEN);
            if(StringUtils.isEmpty(access_token)){
                //如果REDIS中的Access_tocken是空的，需要去生成最新的ACcess_tocken放入redies的缓存中
                access_token = GetAccessTocken.getAuth();
                redisUtil.set(BaiduConstants.ACCESS_TOCKEN,access_token,30*24*60);
            }
            Map<String, String> parameters = new HashMap<>();
            //添加调用参数
            parameters.put("access_token", access_token);
            parameters.put("content", content);
            //调用文本审核接口
            String result = BaiduHttpUtil.doPost(URL, parameters);
            // JSON转换
            JSONObject jsonObj = JSONObject.parseObject(result);
            JSONObject resultJson = (JSONObject)jsonObj.get("result");
            String spam = resultJson.get("spam").toString();
            if("1".equals(spam)){
                //有违规字段
                JSONArray reject = resultJson.getJSONArray("reject");
                reviews= JSON.parseArray(reject.toJSONString(), Review.class);

            }else if("2".equals(spam)){
                JSONArray review = resultJson.getJSONArray("review");
                reviews = JSON.parseArray(review.toJSONString(), Review.class);
            }else if("0".equals(spam)){
                //检验通过
                return content;
            }
        }catch (Exception e){
            access_token = GetAccessTocken.getAuth();
            redisUtil.set(BaiduConstants.ACCESS_TOCKEN,access_token,30*24*60);
            return content;
        }
        return parseContent(content,reviews.get(0).getHit());
    }
    private static String parseContent(String content,String [] strs){
        String returnStr = content;
        if(strs != null && strs.length >0){
            for(String str : strs){
                returnStr = returnStr.replaceAll(str, "**");
            }
        }
        return returnStr;
    }
    public static Boolean checkImg(String imgUrl,RedisUtil redisUtil) {
        String access_token = "";
        List<Review> reviews = null;
        try{
            //获取access_token,从Redis中获取，如果没有获取到或者调用失败再重新生成token放入REDIS中
            access_token = (String) redisUtil.get(BaiduConstants.ACCESS_TOCKEN);
            if(StringUtils.isEmpty(access_token)){
                //如果REDIS中的Access_tocken是空的，需要去生成最新的ACcess_tocken放入redies的缓存中
                access_token = GetAccessTocken.getAuth();
                redisUtil.set(BaiduConstants.ACCESS_TOCKEN,access_token,30*24*60);
            }
            Map<String, String> parameters = new HashMap<>();
            //添加调用参数
            parameters.put("access_token", access_token);
            parameters.put("imgUrl", imgUrl);
            //调用文本审核接口
            String result = BaiduHttpUtil.doPost(ImgURL, parameters);
            // JSON转换
            JSONObject jsonObj = JSONObject.parseObject(result);
            String conclusion = (String)jsonObj.get("conclusion");
            if("不合规".equals(conclusion)){
                return false;
            }else{
                return true;
            }
        }catch (Exception e){
            access_token = GetAccessTocken.getAuth();
            redisUtil.set(BaiduConstants.ACCESS_TOCKEN,access_token,30*24*60);
            return true;
        }
    }

}
