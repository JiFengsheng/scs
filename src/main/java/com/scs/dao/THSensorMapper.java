package com.scs.dao;

import com.scs.pojo.THSensor;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THSensorMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(THSensor record);

    int insertSelective(THSensor record);

    List<THSensor> selectByExample(THSensor example);

    int updateByExampleSelective(THSensor thSensor);

    List<THSensor> selectAllTHSensor();

    THSensor selectById(int id);

}