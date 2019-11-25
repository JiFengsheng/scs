package com.scs.dao;

import com.scs.pojo.Control;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ControlMapper {
    long countByExample();

    int deleteByExample(int id);

    int insert(Control record);

    int insertSelective(Control record);

    List<Control> selectByExample(Control example);

    int updateByExampleSelective(Control control);

    List<Control> selectAllControls();

    Control selectById(int id);
}