package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movies implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actors actor;
    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    public Actors getActor() {
        return actor;
    }

    public Movies() {
    }
    public Movies(Actors actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "actor=" + actor +
                '}';
    }

    
    public void printer(){
        System.out.println("Hello movie");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {

        this.beanName = s;

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;

    }


    public void setActor(Actors actor) {
        this.actor = actor;
    }

    public void runEverything(){

        System.out.println("Bean name : "+this.beanName);
        System.out.println(applicationContext.getBean("movies1").toString());
        System.out.println(beanFactory.getBean("movies1").toString());

    }


}
