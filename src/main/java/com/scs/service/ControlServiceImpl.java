package com.scs.service;

import com.scs.dao.ControlMapper;
import com.scs.pojo.Control;

import java.util.List;

public class ControlServiceImpl implements IControlService {

    private ControlMapper dao;
    public void setDao(ControlMapper dao){
        this.dao=dao;
    }

    @Override
    public void addControl(Control Control) {
        dao.insert(Control);
    }

    @Override
    public void addControlSelective(Control Control) {
        dao.insertSelective(Control);
    }

    @Override
    public List<Control> findAllControls() {
        return dao.selectAllControls();
    }

    @Override
    public Long countControls() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Control> selectByExample(Control Control) {
        return dao.selectByExample(Control);
    }

    @Override
    public void modifyControl(Control Control) {
        dao.updateByExampleSelective(Control);
    }

    @Override
    public Control findControlById(int id) {
        return dao.selectById(id);
    }
}
