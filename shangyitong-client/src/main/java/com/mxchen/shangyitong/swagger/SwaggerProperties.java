package com.mxchen.shangyitong.swagger;

import cn.hutool.core.collection.ListUtil;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 基础配置
 * @since 1.0.0
 */
@ConfigurationProperties("swagger")
@Data
public class SwaggerProperties {
    /****
     * 是否启动
     */
    private Boolean enable = true;
    /**
     * 是否优化 网关 select a spec 列表
     */
    private Boolean isOptimizeLocation = true;
    /***
     * 组名称
     */
    private String groupName="";
    /**
     * 文档扫描包路径
     */
    private String basePackage = "";
    /**
     * 文档显示APi
     */
    private String paths = "";

    /**
     * title 如: 用户模块系统接口详情
     */
    private String title = "";

    /**
     * 服务文件介绍
     */
    private String description = "";
    /**
     * 版本
     */
    private String version = "";
    /***
     *作者名称
     */
    private String authorName = "";
    /***
     *邮件
     */
    private String email = "";
    /**
     * 服务条款网址
     */
    private String termsOfServiceUrl = "";

    private List<SwaggerProperties> config;
}
