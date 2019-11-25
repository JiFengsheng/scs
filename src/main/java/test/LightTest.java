package test;

import com.scs.service.ILightService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LightTest {
    private ILightService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ILightService) ac.getBean("lightService");
    }
    
    
}
