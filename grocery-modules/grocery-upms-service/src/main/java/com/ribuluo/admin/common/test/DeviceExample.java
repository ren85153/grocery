package com.ribuluo.admin.common.test;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jiguang.common.resp.DefaultResult;
import cn.jpush.api.JPushClient;
import cn.jpush.api.device.OnlineStatus;
import cn.jpush.api.device.TagAliasResult;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Map;

@Slf4j
public class DeviceExample {

	private static final String appKey = "71e8f536d04115fead894108";
	private static final String masterSecret = "adfe5911504d64749b5cc1ec";
	private static final String TAG1 = "tag1";
	private static final String ALIAS1 = "alias1";
	private static final String ALIAS2 = "alias2";
	private static final String REGISTRATION_ID1 = "1a0018970aed8d9498e";
	private static final String REGISTRATION_ID2 = "0a04ad7d8b4";

	private static JPushClient jpushClient = new JPushClient(masterSecret, appKey);

	public static void main(String[] args) {
//
//		testGetUserOnlineStatus();
//		testUpdateDeviceTagAlias();
		testGetDeviceTagAlias();
	}
	
	public static void testUpdateDeviceTagAlias() {
		HashSet<String> tagSet = new HashSet<String>();
		tagSet.add("hhh");
		try {
//			DefaultResult result = jpushClient.updateDeviceTagAlias(REGISTRATION_ID1, "1b181fae17c74a8eb08bf33e057dbfc6", new HashSet<>(), null);
			DefaultResult result = jpushClient.updateDeviceTagAlias(REGISTRATION_ID1, false, true);
			log.info("Got result " + result);
		} catch (APIConnectionException e) {
			log.error("Connection error. Should retry later. ", e);
			
		} catch (APIRequestException e) {
			log.error("Error response from JPush server. Should review and fix it. ", e);
            log.info("HTTP Status: " + e.getStatus());
            log.info("Error Code: " + e.getErrorCode());
            log.info("Error Message: " + e.getErrorMessage());
		}
	}
	
	public static void testGetDeviceTagAlias() {
		try {
			TagAliasResult result = jpushClient.getDeviceTagAlias(REGISTRATION_ID1);
			
			log.info(result.alias);
			log.info(result.tags.toString());
			
		} catch (APIConnectionException e) {
			log.error("Connection error. Should retry later. ", e);
			
		} catch (APIRequestException e) {
			log.error("Error response from JPush server. Should review and fix it. ", e);
            log.info("HTTP Status: " + e.getStatus());
            log.info("Error Code: " + e.getErrorCode());
            log.info("Error Message: " + e.getErrorMessage());
		}
	}

	public static void testGetUserOnlineStatus() {
		try {
			Map<String, OnlineStatus> result =  jpushClient.getUserOnlineStatus(REGISTRATION_ID1, REGISTRATION_ID2);

			log.info(result.get(REGISTRATION_ID1).toString());
			log.info(result.get(REGISTRATION_ID2).toString());
		} catch (APIConnectionException e) {
			log.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			log.error("Error response from JPush server. Should review and fix it. ", e);
			log.info("HTTP Status: " + e.getStatus());
			log.info("Error Code: " + e.getErrorCode());
			log.info("Error Message: " + e.getErrorMessage());
		}
	}

	public static void testBindMobile() {
		try {
			DefaultResult result =  jpushClient.bindMobile(REGISTRATION_ID1, "13000000000");
			log.info("Got result " + result);
		} catch (APIConnectionException e) {
			log.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			log.error("Error response from JPush server. Should review and fix it. ", e);
			log.info("HTTP Status: " + e.getStatus());
			log.info("Error Code: " + e.getErrorCode());
			log.info("Error Message: " + e.getErrorMessage());
		}
	}
	
}
