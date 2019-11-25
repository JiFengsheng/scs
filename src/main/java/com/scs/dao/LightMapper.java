package com.scs.dao;

import com.scs.pojo.Light;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LightMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Light record);

    int insertSelective(Light record);

    List<Light> selectByExample(Light example);

    int updateByExampleSelective(Light light);

    List<Light> selectAllLights();

    Light selectById(int id);
}