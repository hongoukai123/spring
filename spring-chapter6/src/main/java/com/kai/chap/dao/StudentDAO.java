package com.kai.chap.dao;

import com.kai.chap.entity.Student;

import javax.sql.DataSource;
import java.util.List;

/**
 * 学校数据访问接口
 * @author hongok
 * @since 2018-10-10 10:32:07
 */
public interface StudentDAO {

    void setDataSource(DataSource ds);

    void create(String name, int age);

    Student getStudent(int id);

    List<Student> listStudents();

    void delete(int id);

    void update(int id, int age);

}
