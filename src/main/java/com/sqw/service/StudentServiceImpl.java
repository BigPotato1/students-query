package com.sqw.service;

import com.sqw.dao.StudentDao;
import com.sqw.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/8
 */
@Service
public class StudentServiceImpl implements StudentService {

////    变量（filed）注入
//    @Autowired
//    StudentDao studentDao;

//    构造器注入
    final
    StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

////    set方法注入
//    private StudentDao studentDao;
//    @Autowired
//    public void setStudentDao (StudentDao studentDao;) {
//        this.studentDao = studentDao;
//    }

    public int getTotal() {
        return studentDao.getTotal();
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    public List<Student> list(int start, int count) {
        return studentDao.list(start, count);
    }
}
