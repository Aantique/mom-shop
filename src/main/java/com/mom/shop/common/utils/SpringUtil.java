package com.mom.shop.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Clozer
 * @date 2022/3/28 16:59
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null){
                 SpringUtil.applicationContext = applicationContext;
        }
    }

    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    public static <T> Object getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    public static <T> Object getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name,clazz);
    }
}
