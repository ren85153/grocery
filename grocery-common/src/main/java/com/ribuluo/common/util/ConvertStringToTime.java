package com.ribuluo.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToTime {
	public static Date convert(String timeStr){
		//String time="2010-11-20 11:10:10"; 
		  Date date=null; 
		  try {
		  SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			date=formatter.parse(timeStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		  return date;
	}
}
