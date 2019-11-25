package com.scs.service;

import com.scs.dao.LightMapper;
import com.scs.pojo.Light;

import java.util.List;

public class LightServiceImpl implements ILightService {


    private LightMapper dao;
    public void setDao(LightMapper dao){
        this.dao=dao;
    }


    @Override
    public void addLight(Light Light) {
        dao.insert(Light);
    }

    @Override
    public void addLightSelective(Light Light) {
        dao.insertSelective(Light);
    }

    @Override
    public List<Light> findAllLights() {
        return dao.selectAllLights();
    }

    @Override
    public Long countLights() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Light> selectByExample(Light Light) {
        return dao.selectByExample(Light);
    }

    @Override
    public void modifyLight(Light Light) {
        dao.updateByExampleSelective(Light);
    }

    @Override
    public Light findLightById(int id) {
        return dao.selectById(id);
    }
}
