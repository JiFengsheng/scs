package com.scs.service;

import com.scs.pojo.Sign;

import java.util.List;

public interface ISignService {

    void addSign(Sign Sign);
    void addSignSelective(Sign Sign);
    List<Sign> findAllSigns();
    Long countSigns();
    void removeById(int id);
    List<Sign> selectByExample(Sign Sign);
    void modifySign(Sign Sign);
    Sign findSignById(int id);
    
    
}
