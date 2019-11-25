package com.scs.service;

import com.scs.pojo.Aircondition;

import java.util.List;

public interface IAirconditionService {

    void addAircondition(Aircondition Aircondition);
    void addAirconditionSelective(Aircondition Aircondition);
    List<Aircondition> findAllAirconditions();
    Long countAirconditions();
    void removeById(int id);
    List<Aircondition> selectByExample(Aircondition Aircondition);
    void modifyAircondition(Aircondition Aircondition);
    Aircondition findAirconditionById(int id);
    
    
}
