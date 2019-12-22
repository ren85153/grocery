package com.ribuluo.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @date 消息中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class JxMessageCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxMessageCenterApplication.class, args);
    }
}
