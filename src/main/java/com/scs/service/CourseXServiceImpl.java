package com.scs.service;

import com.scs.dao.CourseXMapper;
import com.scs.pojo.CourseX;

import java.util.List;

public class CourseXServiceImpl implements ICourseXService {



    private CourseXMapper dao;
    public void setDao(CourseXMapper dao){
        this.dao=dao;
    }
    @Override
    public void addCourseX(CourseX CourseX) {
        dao.insert(CourseX);
    }

    @Override
    public void addCourseXSelective(CourseX CourseX) {
        dao.insertSelective(CourseX);
    }

    @Override
    public List<CourseX> findAllCourseXs() {
        return dao.selectAllCourseXs();
    }

    @Override
    public Long countCourseXs() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<CourseX> selectByExample(CourseX CourseX) {
        return dao.selectByExample(CourseX);
    }

    @Override
    public void modifyCourseX(CourseX CourseX) {
        dao.updateByExampleSelective(CourseX);
    }

    @Override
    public CourseX findCourseXById(int id) {
        return dao.selectById(id);
    }
}
