package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试SpringBeans自动装配
 * @author hongok
 * @since 2018-9-28 17:55:45
 */
public class TestOne {

    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-byname.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bytype.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-const.xml");
        TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
        te.spellCheck();
    }

}
