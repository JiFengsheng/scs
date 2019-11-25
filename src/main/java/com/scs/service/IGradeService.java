package com.scs.service;

import com.scs.pojo.Grade;

import java.util.List;
import java.util.Map;

public interface IGradeService {
    void addGrade(Grade Grade);
    void addGradeSelective(Grade Grade);
    List<Grade> findAllGrades();
    Long countGrades();
    void removeById(int id);
    List<Grade> selectByExample(Grade Grade);
    void modifyGrade(Grade Grade);
    Grade findGradeById(int id);

}
