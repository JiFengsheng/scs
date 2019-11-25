package test;

import com.scs.pojo.CourseZ;
import com.scs.service.ICourseZService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseZTest {


    private ICourseZService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ICourseZService) ac.getBean("courseZService");
    }

    @Test
    public void test01(){
        CourseZ courseZ = service.findCourseZById(1);
        System.out.println(courseZ);
    }
}
