package com.scs.service;

import com.scs.dao.CourseZMapper;
import com.scs.pojo.CourseZ;

public class CourseZServiceImpl implements ICourseZService {


    private CourseZMapper dao;
    public void setDao(CourseZMapper dao){
        this.dao=dao;
    }

    @Override
    public CourseZ findCourseZById(int id) {
        return dao.selectById(id);
    }
}
