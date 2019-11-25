package test;

import com.scs.service.ITHSensorService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class THSensorTest {

    private ITHSensorService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ITHSensorService) ac.getBean("thSensorService");
    }

    
}
