package com.scs.service;

import com.scs.pojo.THSensor;

import java.util.List;

public interface ITHSensorService {

    void addTHSensor(THSensor THSensor);
    void addTHSensorSelective(THSensor THSensor);
    List<THSensor> findAllTHSensors();
    Long countTHSensors();
    void removeById(int id);
    List<THSensor> selectByExample(THSensor THSensor);
    void modifyTHSensor(THSensor THSensor);
    THSensor findTHSensorById(int id);
    
    
}
