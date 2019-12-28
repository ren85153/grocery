package com.ribuluo.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
* <p>Title: AuthServerApplication</p>  
* Description: 获取用户信息也是通过这个应用实现这里既是认证服务器，也是资源服务器
* @author saury  
* @date 2019年12月28日
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.ribuluo.auth", "com.ribuluo.common.bean"})
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
        System.err.println("========================AuthServer启动成功========================");
    }
}
