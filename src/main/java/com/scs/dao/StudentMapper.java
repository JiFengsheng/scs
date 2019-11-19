package com.scs.dao;

import com.scs.pojo.Student;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {


    void insert(Student record);

    void insertSelective(Student record);


    long countByExample();

    int deleteByExample();



    List<Student> selectByExample();

    int updateByExampleSelective();


}