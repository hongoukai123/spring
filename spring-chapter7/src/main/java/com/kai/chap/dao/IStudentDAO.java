package com.kai.chap.dao;

import com.kai.chap.entity.Student;

import java.util.List;

/**
 * 数据访问接口
 * @since 2018-10-15
 */
public interface IStudentDAO {

    int add(Student student);

    int delete(int id);

    Student get(int id);

    int update(Student student);

    List<Student> list();


}
