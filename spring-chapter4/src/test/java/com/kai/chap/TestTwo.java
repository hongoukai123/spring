package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring注解@Autowired
 * @author hongok
 * @since 2018-9-29 16:45:24
 */
public class TestTwo {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-autowired.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

}
