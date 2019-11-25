package com.scs.service;

import com.scs.dao.EquipmentMapper;
import com.scs.pojo.Equipment;

import java.util.List;

public class EquipmentServiceImpl implements IEquipmentService {



    private EquipmentMapper dao;
    public void setDao(EquipmentMapper dao){
        this.dao=dao;
    }
    @Override
    public void addEquipment(Equipment Equipment) {
        dao.insert(Equipment);
    }

    @Override
    public void addEquipmentSelective(Equipment Equipment) {
        dao.insertSelective(Equipment);
    }

    @Override
    public List<Equipment> findAllEquipments() {
        return dao.selectAllEquipments();
    }

    @Override
    public Long countEquipments() {
        return dao.countByExample();
    }

    @Override
    public void removeById(int id) {
        dao.deleteByExample(id);
    }

    @Override
    public List<Equipment> selectByExample(Equipment Equipment) {
        return dao.selectByExample(Equipment);
    }

    @Override
    public void modifyEquipment(Equipment Equipment) {
        dao.updateByExampleSelective(Equipment);
    }

    @Override
    public Equipment findEquipmentById(int id) {
        return dao.selectById(id);
    }
}
