package com.scs.service;

import com.scs.dao.StudentMapper;
import com.scs.pojo.Student;
import java.util.List;
import java.util.Map;

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
        dao.insert(Student);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.selectAllStudents();
    }

    @Override
    public Long countStudents() {
        return dao.countStudent();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Student> selectByExample(Student student) {
        return dao.selectByExample(student);
    }

    @Override
    public void modifyStudent(Student Student) {
        dao.updateByExampleSelective(Student);
    }

    @Override
    public Student findStudentById(int id) {
        return dao.selectById(id);
    }

    @Override
    public List<Student> selectByLimit(Map map) {
        return dao.selectByLimit(map);
    }


}
