package com.bj58.myspringboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao {

    @Select({"select sname from student where sid = #{sid}"})
    public String getStudentName(@Param("sid") int studentId);
}
