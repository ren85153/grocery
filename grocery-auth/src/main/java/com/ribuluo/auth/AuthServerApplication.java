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
package com.ribuluo.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
@author 获取用户信息也是通过这个应用实现
这里既是认证服务器，也是资源服务器
EnableResourceServer
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.ribuluo.auth", "com.ribuluo.common.bean"})
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
