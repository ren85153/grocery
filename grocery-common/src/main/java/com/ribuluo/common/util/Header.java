package com.ribuluo.common.util;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @author wyz
 * @create 2018-04-18 15:38
 * @desc 请求头
 **/
public class Header implements Serializable {
    String time_stamp;
    String token;
    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
