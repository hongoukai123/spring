package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hok on 2018/9/29.
 */
public class TestThree {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-autowired2.xml");
        TextEditor2 te = (TextEditor2) context.getBean("textEditor2");
        te.checkSpell();
    }

}
