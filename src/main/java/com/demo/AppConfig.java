package com.demo;

import com.demo.bean.SpringBean1;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    @Description("Provides bean")
    public SpringBean1 springBean1(){
        return  new SpringBean1();
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor (){
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public static BeanPostProcessor beanPostProcessor(){
        return new CustomerBeanPostProcessor();
    }

}
