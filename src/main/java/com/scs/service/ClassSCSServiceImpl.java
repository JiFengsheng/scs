package com.scs.service;

import com.scs.dao.ClassSCSMapper;
import com.scs.pojo.ClassSCS;

import java.util.List;

public class ClassSCSServiceImpl implements IClassSCSService {

    private ClassSCSMapper dao;
    public void setDao(ClassSCSMapper dao){
        this.dao=dao;
    }

    @Override
    public void addClassSCS(ClassSCS ClassSCS) {
        dao.insert(ClassSCS);
    }

    @Override
    public void addClassSCSSelective(ClassSCS ClassSCS) {
        dao.insertSelective(ClassSCS);
    }

    @Override
    public List<ClassSCS> findAllClassSCSs() {
        return dao.selectAllClass();
    }

    @Override
    public Long countClassSCSs() {
        return dao.countClass();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<ClassSCS> selectByExample(ClassSCS ClassSCS) {
        return dao.selectByExample(ClassSCS);
    }

    @Override
    public void modifyClassSCS(ClassSCS ClassSCS) {
        dao.updateByExampleSelective(ClassSCS);
    }

    @Override
    public ClassSCS findClassSCSById(int id) {
        return dao.selectById(id);
    }

    @Override
    public List<String> selectGrades() {
        return dao.selectGrades();
    }

    @Override
    public List<String> selectAcademys() {
        return dao.selectAcademys();
    }

    @Override
    public List<String> selectMajors(String academy) {
        return dao.selectMajors(academy);
    }


}
