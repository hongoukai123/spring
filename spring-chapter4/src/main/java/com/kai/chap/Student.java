package com.kai.chap;

import org.springframework.beans.factory.annotation.Required;

/**
 * 基于@Required注解的配置，此注解应用于bean属性的setter方法
 * 它表明受影响的bean属性，在配置时必须放在XML文件中，否则容器就会抛出
 * 一个BeanInitializationException异常
 * @author hongok
 * @since 2018-9-29 14:25:36
 */
public class Student {

    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
