package com.ribuluo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * 
 * <p>Title: UserApplication</p>  
 * Description:
 * @author saury  
 * @date 2020年1月9日
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.ribuluo.user", "com.ribuluo.common.bean"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        System.err.println("========================User启动成功========================");
    }
}