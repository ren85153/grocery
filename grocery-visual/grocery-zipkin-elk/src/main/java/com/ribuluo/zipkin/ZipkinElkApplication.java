package com.ribuluo.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author
 * zipkin 链路追踪
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinElkApplication{

    public static void main(String[] args) {
        SpringApplication.run(ZipkinElkApplication.class, args);
    }

}
