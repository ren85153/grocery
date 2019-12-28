package com.ribuluo.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * 
 * <p>Title: SsoClientDemoApplication</p>  
 * Description: 单点登录客户端
 * @author saury  
 * @date 2019年12月28日
 */
@EnableOAuth2Sso
@SpringBootApplication
public class SsoClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoClientDemoApplication.class, args);
        System.err.println("========================SsoClientDemo启动成功========================");
    }
}
