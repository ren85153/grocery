package com.ribuluo.admin.common.exception;

import java.util.HashMap;
import java.util.Map;

/**
 *  统一接口返回值
 */
public class Result<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private T data;

    /** 具体的内容. */
    private T msg;

    private Map<String,String> extras  = new HashMap<>();

    public Map<String, String> getExtras() {
        return extras;
    }

    public String getExtrasValue(String key) {
        return extras.get(key);
    }
    public void putExtras(String key,String value) {
        this.extras.put(key,value);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}