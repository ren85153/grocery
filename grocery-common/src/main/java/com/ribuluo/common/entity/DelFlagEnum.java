package com.ribuluo.common.entity;/**
 * DelFlagEnum
 *
 * @author liuqiang
 * @date 2019/8/31
 */

/**
 * @description: <br/>
 * @date: 2019/8/31 
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
public enum  DelFlagEnum {
    // 删除转态
    DELETED(1) ,
    // 未删除
    UN_DELETED(0);

    private int code;

    DelFlagEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
