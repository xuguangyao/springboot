package com.bj58.myspringboot.controllers;

import com.bj58.myspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xgy
 * @create 2019-05-22 20:09
 **/
@RestController
public class HelloSpringBoot {

    @Autowired
    StudentService studentService;

    @RequestMapping("/hellotest")
    public String HelloSpring(){
        System.out.println("----------");
        return "start sprint boot";
    }

    @RequestMapping("/hellotest2/{id}")
    public String HelloSpring2(@PathVariable("id") int userid){
        System.out.println("----------");
        return "start sprint boot2 "+userid;
    }

    @RequestMapping("/hellotest3/")
    public String HelloSpring3(@RequestParam(value = "param1",required = false) int param1){
        System.out.println("----------");
        return "start sprint boot3 "+ param1;
    }

    @RequestMapping("/getStudent/")
    public String getStudent(@RequestParam("sid") int sid){
        System.out.println("------getStudent----");
        int id = sid;
        String name = studentService.getStudentName(id);
        return "start sprint boot3 " + name;
    }
}
