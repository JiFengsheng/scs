package com.scs.service;

import com.scs.dao.CourseYMapper;
import com.scs.pojo.CourseY;

import java.util.List;

public class CourseYServiceImpl implements ICourseYService {


    private CourseYMapper dao;
    public void setDao(CourseYMapper dao){
        this.dao=dao;
    }

    @Override
    public void addCourseY(CourseY CourseY) {
        dao.insert(CourseY);
    }

    @Override
    public void addCourseYSelective(CourseY CourseY) {
        dao.insertSelective(CourseY);
    }

    @Override
    public List<CourseY> findAllCourseYs() {
        return dao.selectAllCoursey();
    }

    @Override
    public Long countCourseYs() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<CourseY> selectByExample(CourseY CourseY) {
        return dao.selectByExample(CourseY);
    }

    @Override
    public void modifyCourseY(CourseY CourseY) {
        dao.updateByExampleSelective(CourseY);
    }

    @Override
    public CourseY findCourseYById(int id) {
        return dao.selectById(id);
    }
}
