/**
 * Copyright (C),
 * FileName: JxEurekaApplication
 * Author:   weiyz
 * Date:     2018-2019
 * Description: JxAuthServerApplication
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wyz
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class JxConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxConfigApplication.class, args);
    }
}
