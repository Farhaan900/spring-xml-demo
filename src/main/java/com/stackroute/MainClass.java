package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actors;
import com.stackroute.domain.Movies;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.BeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainClass {

    public static void main(String[] args) {



        BeanPostProcessorDemoBean beanPostProcessorDemoBean;

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");

        beanPostProcessorDemoBean = context.getBean("postprocess", BeanPostProcessorDemoBean.class);

//
//        ((ClassPathXmlApplicationContext) context).close();


    }



}
