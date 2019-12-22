package com.ribuluo.oss.utils;

import java.util.UUID;

public class UUIDGenerator {
	public static void main(String[] args) {
		generate();
	}

	public static String generate(){
		String uuidStr =  UUID.randomUUID().toString();
		
		long time = System.currentTimeMillis();
		String timeStr = time+"";
		
		String timeTemp = timeStr.substring(0, 12);	
		
		StringBuffer sb = new StringBuffer(timeTemp);
		String[] uuidArray = uuidStr.split("-");
		
		for(String uuidStrTemp:uuidArray){
			sb.append(uuidStrTemp);
		}
		
		return sb.substring(0, 32);
	}
}
