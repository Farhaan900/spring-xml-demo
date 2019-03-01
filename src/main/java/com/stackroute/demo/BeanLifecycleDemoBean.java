package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean{

    public void destroy() throws Exception {

        System.out.println("I'm the destroyer");

    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("I'm the creator");

    }

    public void customInit(){
        System.out.println("My custom init");
    }

    public void customDestroy(){
        System.out.println("My custom destroy");
    }
}
