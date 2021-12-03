package com.mxchen.shangyitong.config.aliyun;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: shangyitong
 * @description: 短信配置
 * @author: hmxchen
 * @create: 2021-06-22 11:37
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "aliyun.sms")
public class SmsConfig {
    /**
     * 阿里云短信服务accessKeyId
     */
    private String accessKeyId;

    /**
     * 阿里云短信服务secret
     */
    private String accessSecret;
}
