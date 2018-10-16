package com.kai.chap;

import com.kai.chap.dao.IStudentDAO;
import com.kai.chap.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.*;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dataSource.xml")
public class MyBatisTest {

    @Autowired
    private IStudentDAO studentDAO;

    @Test
    public void testAdd(){
        Student student = new Student();
        student.setName("Rose");
        student.setAge(30);
        studentDAO.add(student);
    }

    @Test
    public void testList(){
        List<Student> studentList = studentDAO.list();
        for(Student stu : studentList){
            System.out.println(stu.getName() + "-------" + stu.getAge());
        }
    }

    @Test
    public void testGet(){
        Student stu = studentDAO.get(3);
        System.out.println(stu.getName() + "-------" + stu.getAge());
    }

    @Test
    public void testUpdate(){
        Student student = new Student();
        student.setId(3);
        student.setName("kai");
        studentDAO.update(student);
    }

    @Test
    public void testDelete(){
        studentDAO.delete(3);
    }

}
