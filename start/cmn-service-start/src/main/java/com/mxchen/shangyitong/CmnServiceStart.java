package com.mxchen.shangyitong;

import com.mxchen.shangyitong.swagger.annotation.EnableSwaggerPlugins;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableSwaggerPlugins
@SpringBootApplication
public class CmnServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(CmnServiceStart.class,args);
    }
}
