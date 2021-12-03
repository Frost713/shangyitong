package com.mxchen.shangyitong.swagger;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.base.Predicates;
import com.mxchen.shangyitong.swagger.annotation.ApiVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * {@link Docket} and {@link ApiInfo} 加载
 *
 * @since 1.0.0
 */
@Configuration
@PropertySource(value = "classpath:swagger.properties", ignoreResourceNotFound = true, encoding = "UTF-8")
@EnableConfigurationProperties(SwaggerProperties.class)
public class SwaggerConfig implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);
    @Resource
    private SwaggerProperties swaggerProperties;
    @Resource
    private ApplicationContext applicationContext;
    @Bean
    public Docket buildDocketByDefault() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(swaggerProperties.getGroupName())
                .enable(swaggerProperties.getEnable())
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
                .paths(StrUtil.isNotBlank(swaggerProperties.getPaths())?
                        Predicates.and(PathSelectors.regex(swaggerProperties.getPaths()))
                        :PathSelectors.any())
                .build();
    }
    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title(swaggerProperties.getTitle())
                .description(swaggerProperties.getDescription())
                .termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl())
                .contact(new Contact(swaggerProperties.getAuthorName(), swaggerProperties.getTermsOfServiceUrl(), swaggerProperties.getEmail()))
                .version(swaggerProperties.getVersion())
                .build();
    }
    private ApiInfo buildApiInf(SwaggerProperties properties) {
        return new ApiInfoBuilder()
                .title(covert(properties.getTitle(),swaggerProperties.getTitle()))
                .description(covert(properties.getDescription(),swaggerProperties.getDescription()))
                .termsOfServiceUrl(covert(properties.getTermsOfServiceUrl(),swaggerProperties.getTermsOfServiceUrl()))
                .contact(new Contact(covert(properties.getAuthorName(), swaggerProperties.getAuthorName()),
                        covert(properties.getTermsOfServiceUrl(),swaggerProperties.getTermsOfServiceUrl()),
                                covert(properties.getEmail(),swaggerProperties.getEmail())))
                .version(covert(properties.getVersion(),swaggerProperties.getVersion()))
                .build();
    }
    private String covert(String str1,String defaultStr){
        return StrUtil.isNotBlank(str1)?str1:defaultStr;
    }
    private Docket buildDocketWithGroupName(SwaggerProperties properties) {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(properties.getGroupName())
                .enable(properties.getEnable())
                .apiInfo(buildApiInf(properties))
                .select()
                .apis(input -> {
                    if (input.isAnnotatedWith(ApiVersion.class)) {
                        ApiVersion apiVersion = input.findAnnotation(ApiVersion.class).get();
                        if (apiVersion.group() != null && apiVersion.group().length != 0) {
                            if (Arrays.asList(apiVersion.group()).contains(properties.getGroupName())) {
                                return true;
                            }
                        }
                    }
                    return false;
                })//controller路径
                .paths(StrUtil.isNotBlank(properties.getPaths())?
                        Predicates.and(PathSelectors.regex(properties.getPaths()))
                        :PathSelectors.any())
                .build();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 动态注入bean
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        if(autowireCapableBeanFactory instanceof DefaultListableBeanFactory){
            DefaultListableBeanFactory capableBeanFactory = (DefaultListableBeanFactory) autowireCapableBeanFactory;
           if(CollUtil.isNotEmpty(swaggerProperties.getConfig())){
               int i = 0;
               for (SwaggerProperties swaggerProperties : swaggerProperties.getConfig()) {
                   AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().setFactoryMethodOnBean("buildDocketWithGroupName", "swaggerConfig")
                           .addConstructorArgValue(swaggerProperties).getBeanDefinition();
                   capableBeanFactory.registerBeanDefinition("buildDocket"+i, beanDefinition);
                   i++;
               }
           }
        }
    }
}
