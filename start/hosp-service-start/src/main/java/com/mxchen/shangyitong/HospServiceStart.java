package com.mxchen.shangyitong;

import com.mxchen.shangyitong.swagger.annotation.EnableSwaggerPlugins;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableSwaggerPlugins
@MapperScan("com.mxchen.shangyitong.gatewayimpl.database.mysql")
@EnableMongoRepositories(basePackages = {"com.mxchen.shangyitong.gatewayimpl.database.mongo"})
@SpringBootApplication
public class HospServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(HospServiceStart.class,args);
    }
}
