package com.scs.dao;

import com.scs.pojo.Student;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {


    void insert(Student record);

    void insertSelective(Student record);


    long countStudent();

    void deleteById(int id);

    List<Student> selectAllStudents();

    List<Student> selectByExample(Student student);

    Student selectById(int id);

    int updateByExampleSelective(Student student);


}