package com.scs.service;

import com.scs.dao.AddrMapper;
import com.scs.pojo.Addr;

import java.util.List;

public class AddrServiceImpl implements IAddrService {



    private AddrMapper dao;
    public void setDao(AddrMapper dao){
        this.dao=dao;
    }
    
    @Override
    public void addAddr(Addr Addr) {
        dao.insert(Addr);
    }

    @Override
    public void addAddrSelective(Addr Addr) {
        dao.insertSelective(Addr);
    }

    @Override
    public List<Addr> findAllAddrs() {
        return dao.selectAllAddr();
    }

    @Override
    public Long countAddrs() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Addr> selectByExample(Addr Addr) {
        return dao.selectByExample(Addr);
    }

    @Override
    public void modifyAddr(Addr Addr) {
        dao.updateByExampleSelective(Addr);
    }

    @Override
    public Addr findAddrById(int id) {
        return dao.selectById(id);
    }
}
