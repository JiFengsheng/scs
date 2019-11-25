package com.scs.service;

import com.scs.dao.TeacherMapper;
import com.scs.pojo.Teacher;

import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements ITeacherService {

    private TeacherMapper dao;
    public void setDao(TeacherMapper dao){
        this.dao=dao;
    }
    @Override
    public void addTeacher(Teacher Teacher) {
        dao.insert(Teacher);
    }

    @Override
    public void addTeacherSelective(Teacher Teacher) {
        dao.insertSelective(Teacher);
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return dao.selectAllTeachers();
    }

    @Override
    public Long countTeachers() {
        return dao.countTeachers();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Teacher> selectByExample(Teacher Teacher) {
        return dao.selectByExample(Teacher);
    }

    @Override
    public void modifyTeacher(Teacher Teacher) {
        dao.updateByExampleSelective(Teacher);
    }

    @Override
    public Teacher findTeacherById(int id) {
        return dao.selectById(id);
    }

    @Override
    public List<Teacher> selectByLimit(Map map) {
        return dao.selectByLimit(map);
    }


}
