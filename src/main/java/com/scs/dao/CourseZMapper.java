package com.scs.dao;

import com.scs.pojo.CourseZ;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseZMapper {


    CourseZ selectById(int id);


    long countByExample(CourseZ example);
    int deleteByExample(CourseZ example);
    int insert(CourseZ record);
    int insertSelective(CourseZ record);
    List<CourseZ> selectByExample(CourseZ example);
    int updateByExampleSelective();


}