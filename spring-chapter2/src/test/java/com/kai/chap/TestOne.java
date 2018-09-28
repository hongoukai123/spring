package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hok on 2018/9/28.
 */
public class TestOne {

    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-one.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-two.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-three.xml");
        TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
        te.spellCheck();
    }

}
