package com.scs.dao;

import com.scs.pojo.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    int insert(User record);

    int insertSelective(User record);

    List<User> selectAllUsers();

    long countUsers();

    void deleteById(int i);

    List<User> selectByExample(User user);

    void updateByExampleSelective(User user);

    User selectById(int i);

    List<User> selectByLimit(Map map);




}