package com.ribuluo.admin.common.util.aliPayUtil;

public class LoginUtil {
    public static Integer getVerCode(){
        return (int)((Math.random()*9+1)*100000);
    }
}
