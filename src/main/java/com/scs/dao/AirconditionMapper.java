package com.scs.dao;

import com.scs.pojo.Aircondition;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirconditionMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Aircondition record);

    int insertSelective(Aircondition record);

    List<Aircondition> selectByExample(Aircondition example);

    int updateByExampleSelective(Aircondition aircondition);

    List<Aircondition> selectAllAircondition();

    Aircondition selectById();
}