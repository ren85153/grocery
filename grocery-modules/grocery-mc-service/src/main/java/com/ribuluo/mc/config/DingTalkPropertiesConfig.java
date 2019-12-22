package com.ribuluo.mc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * 钉钉服务配置
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "sms.dingtalk")
public class DingTalkPropertiesConfig {

    /**
     * webhook
     */
    private String webhook;
}
