package com.ribuluo.common.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 响应信息主体
 * @param <T>
 * @author
 */
@Setter
@Getter
@ToString
@ApiModel(description = "返回信息实体类")
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int NO_LOGIN = -2;

    public  static final String SUCCESS_MSG = "success";

    public static final int SUCCESS = 0;

    public static final int FAIL = -1;

    public static final int NO_PERMISSION = 2;

    private String msg = SUCCESS_MSG;

    private int code = SUCCESS;

    @ApiModelProperty(notes = "返回的数据")
    private T data;

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }
    public R(String msg,int code) {
        super();
        this.msg = msg;
        this.code = code;
    }
    public R(T data,String msg,int code) {
        super();
        this.data = data;
        this.msg = msg;
        this.code = code;
    }
    public R(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }
    public  static R success() {
        return  new R(SUCCESS,SUCCESS_MSG);
    }
    public static <T> R<T> success(T data) {
        return new R<T>(data);
    }
    public static <T> R<T> success(T data,String msg) {
        return new R<T>(data,msg);
    }
    public static <T> R<T> error(Throwable e) {
        return new R<T>(e);
    }
    public static <T> R<T> error(T data,String msg,int code) {
        return new R<T>(data,msg,code);
    }
    public static <T> R<T> error(String msg,int code) {
        return new R<T>(msg,code);
    }
    public static  <T>  R<T> error (String msg){
        return  error(msg,FAIL);
    }
}
