package com.scs.dao;

import com.scs.pojo.Addr;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddrMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Addr record);

    int insertSelective(Addr record);

    List<Addr> selectByExample(Addr example);

    int updateByExampleSelective(Addr addr);

    List<Addr> selectAllAddr();

    Addr selectById(int id);


}