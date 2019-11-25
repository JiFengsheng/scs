package com.scs.dao;

import com.scs.pojo.Teacher;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    void insert(Teacher record);

    void insertSelective(Teacher record);

    long countTeachers();

    List<Teacher> selectAllTeachers();

    List<Teacher> selectByExample(Teacher example);

    Teacher selectById(int id);

    int deleteById(int id);

    int updateByExampleSelective(Teacher teacher);

    List<Teacher> selectByLimit(Map map);

}