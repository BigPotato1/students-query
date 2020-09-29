package com.sqw.dao;

import com.sqw.entity.Student;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/8
 */
public interface  StudentDao {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);
}
