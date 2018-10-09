package com.kai.chap;

/**
 * IHelloWorld接口的实现类1(用户测试SpringAop)
 * @author hok
 * @since 2018-9-30 10:25:43
 */
public class HelloWorldImpl1 implements IHelloWorld {


    public void printHelloWorld() {
        System.out.println("一《--------》这个是输出《HelloWorldImpl1》的《printHello》World方法。");
    }

    public void doPrint() {
        System.out.println("一《--------》这个是输出《HelloWorldImpl1》的《doPrint》方法。");
    }
}
