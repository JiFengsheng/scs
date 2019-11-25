package com.scs.dao;

import com.scs.pojo.ClassSCS;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassSCSMapper {
    long countClass();

    int deleteById(int id);

    int insert(ClassSCS record);

    int insertSelective(ClassSCS record);

    List<ClassSCS> selectByExample(ClassSCS example);

    List<ClassSCS> selectAllClass();

    ClassSCS selectById(int id);

    int updateByExampleSelective(ClassSCS classSCS);

    List<String> selectGrades();

    List<String> selectAcademys();

    List<String> selectMajors(String academy);

}