package com.ribuluo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @date 分布式任务调度模块
 */
@EnableDiscoveryClient
@SpringBootApplication
public class JxDaemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxDaemonApplication.class, args);
    }
}
