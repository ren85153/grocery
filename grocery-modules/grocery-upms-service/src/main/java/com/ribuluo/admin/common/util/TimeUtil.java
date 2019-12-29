package com.ribuluo.admin.common.util;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {
    //获取当天开始时间
    public static java.util.Date getStartTime() {
        SimpleDateFormat fmt= new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fmt2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fmt.format(System.currentTimeMillis()).trim();
        java.util.Date returnDate = null;
        try{
            //returnDate = fmt2.parse("2019-03-28 00:00:00");
            returnDate  = fmt2.parse(str + " 00:00:00");
        }catch (Exception e){
            throw  new  RuntimeException(e);
        }

        return returnDate;

    }
    public static java.util.Date getEndTime() {

        SimpleDateFormat fmt= new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fmt2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fmt.format(System.currentTimeMillis()).trim();
        java.util.Date returnDate = null;
        try{
            returnDate  = fmt2.parse(str + " 23:59:59");
        }catch (Exception e){
            throw  new  RuntimeException(e);
        }

        return returnDate;
    }
    public static  String TimeStampToString(Timestamp timestamp){
        String timeStr = "";
        if(timestamp != null){
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            timeStr = fmt.format(timestamp);
        }
        return  timeStr;
    }
    
    public static String secondToString(int numSecond){
        int hour = 0;
        int minute = 0;
        int second = 0;
        second = numSecond % 60;
        numSecond -= second;
        if(numSecond > 0) {
        	numSecond /= 60;
            minute = numSecond % 60;
            numSecond -= minute;
            if(numSecond > 0) {
                hour = numSecond / 60;
            }          
        }
        if(hour>100){
        	return hour+"小时";
        }else{
        	return hour+":"+minute+":"+second;
        }
    }
}
