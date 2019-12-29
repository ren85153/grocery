package com.ribuluo.admin.common.util;

import java.math.BigDecimal;

public class NumberUtil {

    public static String generate8number(){
        return String.valueOf((int)(((Math.random()*9)+1)*10000000));
    }
    public static Double getRewardReal(Double d){
        if(d != null){
            d = d* 0.7;
            BigDecimal bg = new BigDecimal(d);
            return  bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        }
        return null;
    }
}
