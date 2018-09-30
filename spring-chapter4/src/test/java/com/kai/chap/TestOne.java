package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring的@Required注解
 * @author hok
 * @since 2018-9-29 14:27:36
 */
public class TestOne {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-required.xml");
        Student st = (Student) context.getBean("student");
        System.out.println(st.getAge());
        System.out.println(st.getName());
    }

}
