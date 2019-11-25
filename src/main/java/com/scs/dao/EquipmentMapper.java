package com.scs.dao;

import com.scs.pojo.Equipment;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(Equipment example);

    int updateByExampleSelective(Equipment equipment);

    List<Equipment> selectAllEquipments();

    Equipment selectById(int id);


}