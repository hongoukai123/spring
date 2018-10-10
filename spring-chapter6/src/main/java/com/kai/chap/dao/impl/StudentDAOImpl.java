package com.kai.chap.dao.impl;

import com.kai.chap.dao.StudentDAO;
import com.kai.chap.dao.StudentMapper;
import com.kai.chap.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by hok on 2018/10/9.
 */
public class StudentDAOImpl implements StudentDAO {

    //数据源
    private DataSource dataSource;
    //执行SQL查询、更新语句和存储过程调用，执行迭代结果集和提取返回参数值
    private JdbcTemplate jdbcTemplate;

    /**
     * 设置数据源
     * @param dataSource
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * 添加数据
     * @param name 用户名
     * @param age 年龄
     */
    public void create(String name, int age) {
        String SQL = "insert into student (name,age) values(?,?)";
        jdbcTemplate.update(SQL,name,age);
        System.out.println("Created Record Name = " + name + "Age = " + age);
        return;
    }

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    public Student getStudent(int id) {
        String SQL = "select * from student where id = ?";
        Student student = jdbcTemplate.queryForObject(SQL,new Object[]{id}, new StudentMapper());
        return student;
    }

    /**
     * 获取数据集合
     * @return
     */
    public List<Student> listStudents() {
        String SQL = "select * from student";
        List<Student> studentList = jdbcTemplate.query(SQL,new StudentMapper());
        return studentList;
    }

    /**
     * 根据id删除对象
     * @param id
     */
    public void delete(int id) {
        String SQL = "delete from student where id = ?";
        jdbcTemplate.update(SQL,id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    /**
     * 根据id修改对象的某些属性
     * @param id
     * @param age
     */
    public void update(int id, int age) {
        String SQL = "update student set age = ? where id = ?";
        jdbcTemplate.update(SQL,age,id);
        System.out.println("Updated Record with ID = " + id);
        return;
    }
}
