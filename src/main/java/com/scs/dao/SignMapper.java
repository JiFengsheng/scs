package com.scs.dao;

import com.scs.pojo.Sign;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Sign record);

    int insertSelective(Sign record);

    List<Sign> selectByExample(Sign example);

    int updateByExampleSelective(Sign sign);

    List<Sign> selectAllSigns();

    Sign selectById(int id);


}