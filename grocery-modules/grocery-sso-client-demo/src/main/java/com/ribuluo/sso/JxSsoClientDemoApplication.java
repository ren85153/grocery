package com.ribuluo.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author
 * 单点登录客户端
 */
@EnableOAuth2Sso
@SpringBootApplication
public class JxSsoClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxSsoClientDemoApplication.class, args);
    }
}
