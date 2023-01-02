package com.demo;

import com.demo.bean.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //loading the spring xml configuration files into spring container and it will create the instance of the bean as it loads int container
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //it will close the spring container and result invokes the destroy method
        context.registerShutdownHook();
        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        System.out.println(springBean1.greet());
    }
}
