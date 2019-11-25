package com.scs.service;

import com.scs.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface ITeacherService {
    void addTeacher(Teacher Teacher);
    void addTeacherSelective(Teacher Teacher);
    List<Teacher> findAllTeachers();
    Long countTeachers();
    void removeById(int id);
    List<Teacher> selectByExample(Teacher Teacher);
    void modifyTeacher(Teacher Teacher);
    Teacher findTeacherById(int id);
    List<Teacher> selectByLimit(Map map);

}
