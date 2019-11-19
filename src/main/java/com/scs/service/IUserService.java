package com.scs.service;

import com.scs.pojo.User;

import java.util.List;

public interface IUserService {

    void addUser(User user);
    void addUserSelective(User user);
    List<User> findAllUsers();
    Long countUsers();
    void removeById(int id);
    List<User> selectByExample(User user);
    void modifyUser(User User);
    User findUserById(int id);




    List<String> findAllUsersNames();
    String findUserNameById(int id);


}
