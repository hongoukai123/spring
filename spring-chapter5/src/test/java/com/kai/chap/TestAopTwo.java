package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 切入关注点（时间、日志打印）
 * 实现SpringAop切面编程
 * @author hok
 * @since
 */
public class TestAopTwo {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springAopTwo.xml");
        HelloWorldImpl1 hw1 = (HelloWorldImpl1) context.getBean("helloWorldImpl1");
        HelloWorldImpl2 hw2 = (HelloWorldImpl2) context.getBean("helloWorldImpl2");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();

    }

}
