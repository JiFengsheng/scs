package com.scs.service;

import com.scs.pojo.Addr;

import java.util.List;

public interface IAddrService {
    void addAddr(Addr Addr);
    void addAddrSelective(Addr Addr);
    List<Addr> findAllAddrs();
    Long countAddrs();
    void removeById(int id);
    List<Addr> selectByExample(Addr Addr);
    void modifyAddr(Addr Addr);
    Addr findAddrById(int id);
}
