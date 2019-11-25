package test;

import com.scs.pojo.Addr;
import com.scs.service.IAddrService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AddrTest {
    private IAddrService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IAddrService) ac.getBean("addrService");
    }

    @Test
    public void test01(){
        List<Addr> Addrs=service.findAllAddrs();
        for (Addr Addr:Addrs){
            System.out.println(Addr);
        }
    }

    @Test
    public void test02(){
        Long a = service.countAddrs();
        System.out.println(a);
    }

    @Test
    public void test03(){
        Addr Addr=service.findAddrById(1);
        System.out.println(Addr);
    }
    @Test
    public void test04(){
        Addr Addr=new Addr();
        Addr.setClassroom("钟海楼04001");
        List<Addr> Addrs=service.selectByExample(Addr);
        for (Addr Addr1:Addrs){
            System.out.println(Addr1);
        }
    }
    @Test
    public void test05(){
        Addr Addr=new Addr("钟海楼04003", "1", 10);
        service.addAddr(Addr);
        System.out.println(Addr);

    }

    @Test
    public void test06(){
        Addr Addr = new Addr();
        Addr.setClassroom("钟海楼04003");
        Addr.setNum("2");
        service.addAddrSelective(Addr);
        test01();
    }
    @Test
    public void test07(){
        Addr Addr=new Addr();
        Addr.setId(9);
        Addr.setEquipmentId(7);
        service.modifyAddr(Addr);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(9);
    }




}
