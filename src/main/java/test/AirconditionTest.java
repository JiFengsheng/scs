package test;

import com.scs.service.IAirconditionService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirconditionTest {

    private IAirconditionService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IAirconditionService) ac.getBean("airconditionService");
    }
    
    
}
