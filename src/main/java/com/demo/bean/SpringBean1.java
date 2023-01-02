package com.demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {

    private SpringBean2 springBean2;

    public SpringBean2 getSpringBean2() {
        return springBean2;
    }

    public SpringBean1(){
        System.out.println(this.getClass()
                .getSimpleName()+ "::Constuctor");
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2){
        System.out.println(springBean2.getClass().getSimpleName()+ " apply setter injection to ::" + this.getClass().getSimpleName());
        this.springBean2=springBean2;
    }

    @PostConstruct
    public void postConstructor(){
        System.out.println(this.getClass().getSimpleName()+ "::postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass().getSimpleName()+ "::afterPropertiesSet");
    }

    public void customInit(){
        System.out.println(this.getClass().getSimpleName()+" ::customInit");
    }
    public String greet(){
        return "Hello Word";
    }

  @PreDestroy
    public void preDestroy(){
        System.out.println(this.getClass().getSimpleName()+":: preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("::DisposableBean");
    }
    public void customDestroy(){
        System.out.println("CustomDestroy");
    }
}
