package com.scs.service;

import com.scs.dao.SignMapper;
import com.scs.pojo.Sign;

import java.util.List;

public class SignServiceImpl implements ISignService {

    private SignMapper dao;
    public void setDao(SignMapper dao){
        this.dao=dao;
    }


    @Override
    public void addSign(Sign Sign) {
        dao.insert(Sign);
    }

    @Override
    public void addSignSelective(Sign Sign) {
        dao.insertSelective(Sign);
    }

    @Override
    public List<Sign> findAllSigns() {
        return dao.selectAllSigns();
    }

    @Override
    public Long countSigns() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Sign> selectByExample(Sign Sign) {
        return dao.selectByExample(Sign);
    }

    @Override
    public void modifySign(Sign Sign) {
        dao.updateByExampleSelective(Sign);
    }

    @Override
    public Sign findSignById(int id) {
        return dao.selectById(id);
    }



}
