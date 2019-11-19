package com.scs.service;

import com.scs.dao.UserMapper;
import com.scs.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private UserMapper dao;
    public void setDao(UserMapper userdao){
        this.dao=userdao;
    }

    @Override
    public void addUser(User user) {
        dao.insert(user);
    }

    @Override
    public void addUserSelective(User user) {
        dao.insertSelective(user);
    }

    @Override
    public List<User> findAllUsers() {
        return dao.selectAllUsers();
    }

    @Override
    public Long countUsers() {
        return dao.countUsers();
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<User> selectByExample(User user) {
        return dao.selectByExample(user);
    }

    @Override
    public void modifyUser(User user) {
        dao.updateByExampleSelective(user);
    }

    @Override
    public User findUserById(int id) {
        return dao.selectById(id);
    }




    @Override
    public List<String> findAllUsersNames() {
        return null;
    }

    @Override
    public String findUserNameById(int id) {
        return null;
    }



}
