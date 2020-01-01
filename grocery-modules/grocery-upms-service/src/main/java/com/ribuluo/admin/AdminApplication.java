package com.ribuluo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
* <p>Title: AdminApplication</p>  
* Description:
* @author saury  
* @date 2020年1月1日
 */
@EnableSwagger2 	
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.ribuluo.admin", "com.ribuluo.common.bean"})
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        System.err.println("========================Admin启动成功========================");
    }
}