package com.scs.service;

import com.scs.pojo.CourseX;

import java.util.List;

public interface ICourseXService {

    void addCourseX(CourseX CourseX);
    void addCourseXSelective(CourseX CourseX);
    List<CourseX> findAllCourseXs();
    Long countCourseXs();
    void removeById(int id);
    List<CourseX> selectByExample(CourseX CourseX);
    void modifyCourseX(CourseX CourseX);
    CourseX findCourseXById(int id);
}
