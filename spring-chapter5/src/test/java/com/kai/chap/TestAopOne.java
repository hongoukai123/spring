package com.kai.chap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试SpringAop的实现流程
 * @author hongok
 * @since 2018-9-30 10:35:37
 */
public class TestAopOne {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springAopOne.xml");
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
