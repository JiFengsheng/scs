package com.scs.service;

import com.scs.pojo.Control;

import java.util.List;

public interface IControlService {
    void addControl(Control Control);
    void addControlSelective(Control Control);
    List<Control> findAllControls();
    Long countControls();
    void removeById(int id);
    List<Control> selectByExample(Control Control);
    void modifyControl(Control Control);
    Control findControlById(int id);
    
}
