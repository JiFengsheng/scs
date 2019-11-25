package com.scs.service;

import com.scs.dao.GradeMapper;
import com.scs.pojo.Grade;

import java.util.List;
import java.util.Map;

public class GradeServiceImpl implements IGradeService {



    private GradeMapper dao;
    public void setDao(GradeMapper dao){
        this.dao=dao;
    }

    @Override
    public void addGrade(Grade Grade) {
        dao.insert(Grade);
    }

    @Override
    public void addGradeSelective(Grade Grade) {
        dao.insertSelective(Grade);
    }

    @Override
    public List<Grade> findAllGrades() {
        return dao.selectAllGrades();
    }

    @Override
    public Long countGrades() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Grade> selectByExample(Grade Grade) {
        return dao.selectByExample(Grade);
    }

    @Override
    public void modifyGrade(Grade Grade) {
        dao.updateByExampleSelective(Grade);
    }

    @Override
    public Grade findGradeById(int id) {
        return dao.selectById(id);
    }


}
