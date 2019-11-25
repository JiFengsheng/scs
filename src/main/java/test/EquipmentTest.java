package test;

import com.scs.pojo.Equipment;
import com.scs.service.IEquipmentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class EquipmentTest {

    private IEquipmentService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IEquipmentService) ac.getBean("equipmentService");
    }

    @Test
    public void test01(){
        List<Equipment> Equipments=service.findAllEquipments();
        for (Equipment Equipment:Equipments){
            System.out.println(Equipment);
        }
    }

    @Test
    public void test02(){
        Long a = service.countEquipments();
        System.out.println(a);
    }

    @Test
    public void test03(){
        Equipment Equipment=service.findEquipmentById(1);
        System.out.println(Equipment);
    }
    @Test
    public void test04(){
        Equipment Equipment=new Equipment();
        Equipment.setLei("aircondition");
        List<Equipment> Equipments=service.selectByExample(Equipment);
        for (Equipment Equipment1:Equipments){
            System.out.println(Equipment1);
        }
    }
    @Test
    public void test05(){
        Equipment Equipment=new Equipment("音箱c", new Date(), "audio", "在库");
        service.addEquipment(Equipment);
        System.out.println(Equipment);

    }

    @Test
    public void test06(){
        Equipment Equipment = new Equipment();
        Equipment.setName("音箱d");
        Equipment.setLei("audio");
        Equipment.setState("在库");
        service.addEquipmentSelective(Equipment);
        test01();
    }
    @Test
    public void test07(){
        Equipment Equipment=new Equipment();
        Equipment.setId(8);
        Equipment.setInputTime(new Date());
        service.modifyEquipment(Equipment);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(9);
    }
    



}
