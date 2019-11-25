package com.scs.service;

import com.scs.pojo.CourseY;

import java.util.List;

public interface ICourseYService {

    void addCourseY(CourseY CourseY);
    void addCourseYSelective(CourseY CourseY);
    List<CourseY> findAllCourseYs();
    Long countCourseYs();
    void removeById(int id);
    List<CourseY> selectByExample(CourseY CourseY);
    void modifyCourseY(CourseY CourseY);
    CourseY findCourseYById(int id);
    
}
