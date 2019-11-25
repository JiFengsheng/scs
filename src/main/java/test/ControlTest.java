package test;

import com.scs.pojo.Control;
import com.scs.service.IControlService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ControlTest {

    private IControlService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IControlService) ac.getBean("controlService");
        
    }

    @Test
    public void test01(){
        List<Control> Controls=service.findAllControls();
        for (Control Control:Controls){
            System.out.println(Control);
        }
    }

    @Test
    public void test02(){
        Long a = service.countControls();
        System.out.println(a);
    }

    @Test
    public void test03(){
        Control Control=service.findControlById(1);
        System.out.println(Control);
    }
    @Test
    public void test04(){
        Control Control=new Control();
        Control.setOrder("关闭空调");
        List<Control> Controls=service.selectByExample(Control);
        for (Control Control1:Controls){
            System.out.println(Control1);
        }
    }
    @Test
    public void test05(){
        Control Control=new Control(new Date(), 2, "打开空调", 1);
        service.addControl(Control);
        System.out.println(Control);
    }

    @Test
    public void test06(){
        Control Control = new Control();
        Control.setTime(new Date());
        Control.setOrder("关闭空调");
        service.addControlSelective(Control);
        test01();
    }
    @Test
    public void test07(){
        Control Control=new Control();
        Control.setId(3);
        Control.setUserId(3);
        service.modifyControl(Control);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(3);
    }
    

}
