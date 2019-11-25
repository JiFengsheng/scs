package com.scs.dao;

import com.scs.pojo.CourseY;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseYMapper {
    long countByExample();

    int deleteById(int id);

    int insert(CourseY record);

    int insertSelective(CourseY record);

    List<CourseY> selectByExample(CourseY example);

    int updateByExampleSelective(CourseY courseY);

    CourseY selectById(int id);

    List<CourseY> selectAllCoursey();


}