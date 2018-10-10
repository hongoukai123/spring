package com.kai.chap;

import com.kai.chap.dao.impl.StudentDAOImpl;
import com.kai.chap.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试Spring-JDBC操作数据库数据
 * @author hongok
 * @since 2018-10-10 11:38:16
 */
public class MainApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jdbc.xml");
        StudentDAOImpl studentDAOImpl = (StudentDAOImpl) context.getBean("studentJDBCTemplate");
        System.out.println("<-----------------Create Start------------------->");
        studentDAOImpl.create("Jack", 10);
        studentDAOImpl.create("Tom", 20);
        studentDAOImpl.create("Rose", 30);
        System.out.println("------------------------------------");
        List<Student> studentList = studentDAOImpl.listStudents();
        for (Student stu : studentList){
            System.out.println("ID : " + stu.getId());
            System.out.println("name : " + stu.getName());
            System.out.println("age : " + stu.getAge());
        }
        System.out.println("-------------------------------------");
        Student student = studentDAOImpl.getStudent(2);
        System.out.println("ID : " + student.getId() + "<--->name : " + student.getName() + "<--->age : " + student.getAge());
        System.out.println("-------------------------------------");
        studentDAOImpl.update(3,50);
        System.out.println("-------------------------------------");
        studentDAOImpl.delete(3);
    }

}
