package com.scs.service;

import com.scs.dao.THSensorMapper;
import com.scs.pojo.THSensor;

import java.util.List;

public class THSensorServiceImpl implements ITHSensorService{



    private THSensorMapper dao;
    public void setDao(THSensorMapper dao){
        this.dao=dao;
    }
    @Override
    public void addTHSensor(THSensor THSensor) {
        dao.insert(THSensor);
    }

    @Override
    public void addTHSensorSelective(THSensor THSensor) {
        dao.insertSelective(THSensor);
    }

    @Override
    public List<THSensor> findAllTHSensors() {
        return dao.selectAllTHSensor();
    }

    @Override
    public Long countTHSensors() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<THSensor> selectByExample(THSensor THSensor) {
        return dao.selectByExample(THSensor);
    }

    @Override
    public void modifyTHSensor(THSensor THSensor) {
        dao.updateByExampleSelective(THSensor);
    }

    @Override
    public THSensor findTHSensorById(int id) {
        return dao.selectById(id);
    }
}
