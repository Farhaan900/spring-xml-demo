package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor{

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("After Init : "+beanName);

        return null;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before Init : "+beanName);
        return null;
    }
}
