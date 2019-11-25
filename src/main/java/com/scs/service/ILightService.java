package com.scs.service;

import com.scs.pojo.Light;

import java.util.List;

public interface ILightService {

    void addLight(Light Light);
    void addLightSelective(Light Light);
    List<Light> findAllLights();
    Long countLights();
    void removeById(int id);
    List<Light> selectByExample(Light Light);
    void modifyLight(Light Light);
    Light findLightById(int id);
    
}
