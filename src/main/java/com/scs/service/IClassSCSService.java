package com.scs.service;

import com.scs.pojo.ClassSCS;

import java.util.List;

public interface IClassSCSService {

    void addClassSCS(ClassSCS ClassSCS);
    void addClassSCSSelective(ClassSCS ClassSCS);
    List<ClassSCS> findAllClassSCSs();
    Long countClassSCSs();
    void removeById(int id);
    List<ClassSCS> selectByExample(ClassSCS ClassSCS);
    void modifyClassSCS(ClassSCS ClassSCS);
    ClassSCS findClassSCSById(int id);
    List<String> selectGrades();
    List<String> selectAcademys();
    List<String> selectMajors(String academy);
}
