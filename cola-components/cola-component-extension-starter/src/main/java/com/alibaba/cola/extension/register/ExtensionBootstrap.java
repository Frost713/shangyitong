package com.alibaba.cola.extension.register;

import com.alibaba.cola.extension.Extension;
import com.alibaba.cola.extension.ExtensionPointI;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * ExtensionBootstrap
 *
 * @author Frank Zhang
 * @date 2020-06-18 7:55 PM
 */
@Component
public class ExtensionBootstrap implements ApplicationContextAware {

    @Resource
    private ExtensionRegister extensionRegister;

    private ApplicationContext applicationContext;

    public void init(){
        Map<String, Object> extensionBeans = applicationContext.getBeansWithAnnotation(Extension.class);
        extensionBeans.values().forEach(
                extension -> extensionRegister.doRegistration((ExtensionPointI) extension)
        );
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
