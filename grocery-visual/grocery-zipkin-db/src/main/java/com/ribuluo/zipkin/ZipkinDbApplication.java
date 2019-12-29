package com.ribuluo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author
 * zipkin mysql 存储实现
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinDbApplication.class, args);
    }
}
