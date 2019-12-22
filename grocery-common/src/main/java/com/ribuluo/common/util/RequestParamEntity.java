package com.ribuluo.common.util;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Map;

/**
 * @author wyz
 * @create
 * @desc 请求接口的封装
 **/
public class RequestParamEntity implements Serializable {
    Header header;
    Map<String, String> body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Map<String, String> getBody() {
        return body;
    }
    public void setBody(Map<String, String> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public String getParam(String key) {
        return body.get(key);
    }

    public Integer pageNum() {
        return Integer.valueOf(body.get("pageNum"));
    }

    public Integer pageSize() {
        return Integer.valueOf(body.get("pageSize"));
    }

    public Integer getInt(String key) {
        return Integer.valueOf(body.get(key));
    }
}
