package test;

import com.scs.pojo.Sign;
import com.scs.service.ISignService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class SignTest {

    private ISignService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ISignService) ac.getBean("signService");
    }



    @Test
    public void test01(){
        List<Sign> Signs=service.findAllSigns();
        for (Sign Sign:Signs){
            System.out.println(Sign);
        }
    }

    @Test
    public void test02(){
        Long a = service.countSigns();
        System.out.println(a);
    }

    @Test
    public void test03(){
        Sign Sign=service.findSignById(2);
        System.out.println(Sign);
    }
    @Test
    public void test04(){
        Sign Sign=new Sign();
        Sign.setClassId(1);
        List<Sign> Signs=service.selectByExample(Sign);
        for (Sign Sign1:Signs){
            System.out.println(Sign1);
        }
    }
    @Test
    public void test05(){
        Sign Sign=new Sign(new Date(), 2, 2, new Date(), 1, new Date());
        service.addSign(Sign);
        System.out.println(Sign);

    }

    @Test
    public void test06(){
        Sign Sign = new Sign();
        Sign.setCourseyId(3);
        Sign.setClassId(1);
        service.addSignSelective(Sign);
        test01();
    }
    @Test
    public void test07(){
        Sign Sign=new Sign();
        Sign.setId(3);

        service.modifySign(Sign);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(3);
    }



}
