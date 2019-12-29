package com.ribuluo.admin.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDto  implements Serializable{
    private String  loginName;
    private String  loginType;
    private String  password;
    private String  verCode;
    private String  registType;
    private String  mobile;
    private String  mailbox;
    private String  ip;
    //登录源头，xcx是小程序
    private String source;
}
