package com.ribuluo.common.util;

/**
 * 统一结果返回封装
 *
 * @param <T>
 * @author
 */
public class RestResult<T> {
    private String result;
    private String reason;
    private T data;

    private RestResult() {
    }

    protected RestResult(String code, String reason, T result) {
        this.result = code;
        this.reason = reason;
        this.data = result;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
