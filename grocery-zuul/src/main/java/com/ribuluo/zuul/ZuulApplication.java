/**
 * Copyright (C),
 * FileName: JxGatewayApplication
 * Author:   weiyz
 * Date:     2018-2019
 * Description: JxAuthServerApplication
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.client.RestTemplate;

/**
 * 
* <p>Title: ZuulApplication</p>  
* Description:
* @author saury  
* @date 2019年12月28日
 */
@EnableZuulProxy
@EnableFeignClients
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringCloudApplication
@ComponentScan(basePackages = {"com.ribuluo.zuul", "com.ribuluo.common.bean"})
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        System.err.println("========================zuul启动成功========================");
    }

    @Bean
    LoadBalancerInterceptor loadBalancerInterceptor(LoadBalancerClient loadBalance){
        return new LoadBalancerInterceptor(loadBalance);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}