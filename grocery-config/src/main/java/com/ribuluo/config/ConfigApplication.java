package com.ribuluo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
* <p>Title: ConfigApplication</p>  
* Description:
* @author saury  
* @date 2019年12月28日
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
        System.err.println("========================Config启动成功==============================");
    }
}
