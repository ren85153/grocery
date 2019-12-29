package com.ribuluo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

/**
 * 
* <p>Title: ZipkinElkApplication</p>  
* Description: 链路追踪
* @author saury  
* @date 2019年12月29日
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinElkApplication{

    public static void main(String[] args) {
        SpringApplication.run(ZipkinElkApplication.class, args);
        System.err.println("========================ZipkinElk启动成功========================");
    }

}
