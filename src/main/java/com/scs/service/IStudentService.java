package com.scs.service;

import com.scs.pojo.Student;

import java.util.List;

public interface IStudentService {

    void addStudent(Student Student);
    void addStudentSelective(Student Student);
    List<Student> findAllStudents();
    Long countStudents();
    void removeById(int id);
    List<Student> selectByExample(Student Student);
    void modifyStudent(Student Student);
    Student findStudentById(int id);
    
    
}
