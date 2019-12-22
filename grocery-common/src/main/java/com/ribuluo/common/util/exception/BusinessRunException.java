package com.ribuluo.common.util.exception;/**

/**
 * @description: 业务运行抛出的异常
 * @date: 2019/9/2 
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
public class BusinessRunException extends  RuntimeException {

    public BusinessRunException(String message) {
        super(message);
    }

}
