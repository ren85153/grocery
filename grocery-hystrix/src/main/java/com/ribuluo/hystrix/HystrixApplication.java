package com.ribuluo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 
* <p>Title: HystrixApplication</p>  
* Description:
* @author saury  
* @date 2020年1月11日
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
        System.err.println("-------------------------Hystrix启动成功--------------------------");
    }
}
