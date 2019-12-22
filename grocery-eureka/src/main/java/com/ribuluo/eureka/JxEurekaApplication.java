/**
 * Copyright (C), 2018-2019,Kinglian
 * FileName: JxEurekaApplication
 * Author:   weiyz
 * Date:     2019/1/6 15:34
 * Description: JxEurekaApplication
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ribuluo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈JxEurekaApplication〉
 * @author weiyz
 * @create 2019/1/6
 */
@EnableEurekaServer
@SpringBootApplication
public class JxEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JxEurekaApplication.class, args);
    }
}
