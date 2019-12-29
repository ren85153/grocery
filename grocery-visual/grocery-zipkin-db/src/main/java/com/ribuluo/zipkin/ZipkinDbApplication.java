package com.ribuluo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * 
* <p>Title: ZipkinDbApplication</p>  
* Description: zipkin mysql 存储实现
* @author saury  
* @date 2019年12月29日
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinDbApplication.class, args);
        System.err.println("========================ZipkinDb启动成功========================");
    }
}
