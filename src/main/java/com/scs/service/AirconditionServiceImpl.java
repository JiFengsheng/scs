package com.scs.service;

import com.scs.dao.AirconditionMapper;
import com.scs.pojo.Aircondition;

import java.util.List;

public class AirconditionServiceImpl implements IAirconditionService {

    private AirconditionMapper dao;
    public void setDao(AirconditionMapper dao){
        this.dao=dao;
    }
    @Override
    public void addAircondition(Aircondition Aircondition) {

    }

    @Override
    public void addAirconditionSelective(Aircondition Aircondition) {

    }

    @Override
    public List<Aircondition> findAllAirconditions() {
        return null;
    }

    @Override
    public Long countAirconditions() {
        return null;
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public List<Aircondition> selectByExample(Aircondition Aircondition) {
        return null;
    }

    @Override
    public void modifyAircondition(Aircondition Aircondition) {

    }

    @Override
    public Aircondition findAirconditionById(int id) {
        return null;
    }


}
