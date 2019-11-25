package com.scs.dao;

import com.scs.pojo.Grade;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(Grade example);

    int updateByExampleSelective(Grade grade);

    Grade selectById(int id);

    List<Grade> selectAllGrades();


}