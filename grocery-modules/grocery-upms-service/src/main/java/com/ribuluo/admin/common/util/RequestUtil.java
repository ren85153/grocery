package com.ribuluo.admin.common.util;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

/**
 * Created by 刘元凡 on 2017/6/8.
 */
@Component
public class RequestUtil {

    public static String method(String url,String method,Map<String ,Object> hashMap){
        if("get".equals(method)){
            return methodGet(url, hashMap);
        }else if("delete".equals(method)){
            return methodDelete(url, hashMap);
        }else if("post".equals(method)){
            return methodPost(url,hashMap);
        }else{
            return methodPut(url,hashMap);
        }
    }

    //get
    public static String methodGet(String url,Map<String ,Object> hashMap){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> httpEntity = new HttpEntity<Object>(hashMap,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> test = restTemplate.exchange(url, HttpMethod.GET,httpEntity,String.class,hashMap);
        return test.getBody();
    }

    //delete
    public static String methodDelete(String url,Map<String ,Object> hashMap){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> httpEntity = new HttpEntity<Object>(hashMap,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> test = restTemplate.exchange(url, HttpMethod.DELETE,httpEntity,String.class,hashMap);
        return test.getBody();
    }

    //post
    public static String methodPost(String url, Map<String, Object> reqJsonStr){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> httpEntity = new HttpEntity<Object>(reqJsonStr,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> test = restTemplate.exchange(url, HttpMethod.POST,httpEntity,String.class);
        return test.getBody();
    }
    //put
    public static String methodPut(String url,Map<String ,Object> reqJsonStr){
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/json");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> httpEntity = new HttpEntity<Object>(reqJsonStr,requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> test = restTemplate.exchange(url, HttpMethod.PUT,httpEntity,String.class);
        return test.getBody();
    }
}
