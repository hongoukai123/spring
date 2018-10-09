package com.kai.chap;

/**
 * 日志打印类（SpringAop切入点）
 * @author hok
 * @since 2018-9-30 11:35:54
 */
public class LogHandler {

    public void logBefore(){
        System.out.println("日志之《前》的方法。");
    }

    public void logAfter(){
        System.out.println("日志之《后》的方法。");
    }

}
