package com.kai.chap;

/**
 * IHelloWorld接口的实现类2(用户测试SpringAop)
 * @author hok
 * @since 2018-9-30 10:30:15
 */
public class HelloWorldImpl2 implements IHelloWorld {

    public void printHelloWorld() {
        System.out.println("二《--------》这个是输出《HelloWorldImpl2》的《printHello》World方法。");
    }

    public void doPrint() {
        System.out.println("二《--------》这个是输出《HelloWorldImpl2》的《doPrint》方法。");
    }

}
