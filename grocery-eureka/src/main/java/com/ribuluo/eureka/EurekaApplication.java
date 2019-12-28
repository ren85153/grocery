package com.ribuluo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * <p>Title: EurekaApplication</p>  
 * Description:
 * @author saury  
 * @date 2019年12月28日
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.err.println("========================Eureka启动成功========================");
    }
}
