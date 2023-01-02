package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("%s::postProcessorBeforeInitialization",bean.getClass().getSimpleName()));
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("%s::postProcessAfterInitialization",bean.getClass().getSimpleName()));
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
