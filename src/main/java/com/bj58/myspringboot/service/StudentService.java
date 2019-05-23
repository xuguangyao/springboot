package com.bj58.myspringboot.service;

import com.bj58.myspringboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xgy
 * @create 2019-05-23 17:30
 **/
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public String getStudentName(int studentId){
        String name = studentDao.getStudentName(studentId);
        System.out.println("student name" + name);
        return name;
    }
}
