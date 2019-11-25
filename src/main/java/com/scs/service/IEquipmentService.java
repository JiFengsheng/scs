package com.scs.service;

import com.scs.pojo.Equipment;

import java.util.List;

public interface IEquipmentService {

    void addEquipment(Equipment Equipment);
    void addEquipmentSelective(Equipment Equipment);
    List<Equipment> findAllEquipments();
    Long countEquipments();
    void removeById(int id);
    List<Equipment> selectByExample(Equipment Equipment);
    void modifyEquipment(Equipment Equipment);
    Equipment findEquipmentById(int id);
    
}
