package com.stackroute;

import com.stackroute.domain.Actors;
import com.stackroute.domain.Movies;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainClass {

    public static void main(String[] args){


        /**
         * using XmlBeanFactory
         */

        Resource res = new FileSystemResource("src/main/resources/beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        Movies moviesFactory = factory.getBean("movies1" , Movies.class);
        System.out.println(moviesFactory.getActor().toString());

        System.out.println("Second part starts here");

        /**
         * using Application context
         */

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");
        Movies movies1 = context.getBean(
                "movies1", Movies.class);
        Movies movies2 = context.getBean(
                "movies2", Movies.class);
        System.out.println(movies1.getActor().toString());
        System.out.println(movies2.getActor().toString());


        /**
         * BeanDefinitionRegistry and BeanDefinitionReader
         */

        System.out.println("Third part starts here");


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Movies.class);
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext.getBeanFactory();

        GenericBeanDefinition definition=new GenericBeanDefinition();
        definition.setBeanClass(Movies.class);
        definition.setAutowireCandidate(true);
//        MutablePropertyValues mutablePropertyValues=new MutablePropertyValues();
        beanDefinitionRegistry.registerBeanDefinition("movies2",definition);
        Movies movie1=(Movies)context.getBean("movies2");
        System.out.println(movie1.getActor());



        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();


        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movies movie3=(Movies)factory.getBean("movies1");
        System.out.println(movie3.getActor());



    }
}
