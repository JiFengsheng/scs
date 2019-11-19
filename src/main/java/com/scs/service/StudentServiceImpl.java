package com.scs.service;

import com.scs.dao.StudentMapper;
import com.scs.pojo.Student;

import java.util.List;

public class StudentServiceImpl implements IStudentService {


    private StudentMapper dao;
    public void setDao(StudentMapper dao){
        this.dao=dao;
    }
    @Override
    public void addStudent(Student Student) {
        dao.insert(Student);
    }

    @Override
    public void addStudentSelective(Student Student) {

    }

    @Override
    public List<Student> findAllStudents() {
        return null;
    }

    @Override
    public Long countStudents() {
        return null;
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public List<Student> selectByExample(Student Student) {
        return null;
    }

    @Override
    public void modifyStudent(Student Student) {

    }

    @Override
    public Student findStudentById(int id) {
        return null;
    }
}
