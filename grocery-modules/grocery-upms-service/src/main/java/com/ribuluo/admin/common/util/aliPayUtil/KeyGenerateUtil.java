package com.ribuluo.admin.common.util.aliPayUtil;

import java.util.UUID;

public class KeyGenerateUtil {
    //生成16位的数字订单编号
    public static String getOrderId(){
        int random = (int)(Math.random()*9+1);
        String valueOf = String.valueOf(random);
        //生成UUID的hashCode值
        int hashCode = UUID.randomUUID().toString().hashCode();
        if(hashCode < 0 ){
            hashCode = - hashCode;
        }
        return (valueOf+String.format("%015d",hashCode));
    }
}
