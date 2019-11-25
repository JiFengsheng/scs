package com.scs.dao;

import com.scs.pojo.CourseX;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseXMapper {
    long countByExample();

    int deleteById(int id);

    int insert(CourseX record);

    int insertSelective(CourseX record);

    List<CourseX> selectByExample(CourseX courseX);

    List<CourseX> selectAllCourseXs();

    CourseX selectById(int id);

    int updateByExampleSelective(CourseX courseX);


}