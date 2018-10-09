package com.kai.chap;

/**
 * 打印时间类（SpringAop的切入点）
 * @author hok
 * @since 2018-9-30 10:32:21
 */
public class TimeHandler {

    public void printTime(){
        System.out.println("当前时间为:" + System.currentTimeMillis());
    }

}
