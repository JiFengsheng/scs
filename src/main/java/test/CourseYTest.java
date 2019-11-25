package test;

import com.scs.pojo.CourseY;
import com.scs.service.ICourseYService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CourseYTest {
    private ICourseYService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ICourseYService) ac.getBean("courseYService");
    }

    @Test
    public void test01(){
        List<CourseY> courseYS=service.findAllCourseYs();
        for(CourseY courseY:courseYS){
            System.out.println(courseY);
        }
    }

    @Test
    public void test02(){
        CourseY courseY=service.findCourseYById(1);
        System.out.println(courseY);
    }
    @Test
    public void test03(){
        Long a = service.countCourseYs();
        System.out.println(a);
    }

    @Test
    public void test04(){
        CourseY courseY=new CourseY(3, "1", 2, false);
        service.addCourseY(courseY);
        System.out.println(courseY);
    }

    @Test
    public void test05(){
        CourseY courseY=new CourseY();
        courseY.setCourseId(3);
        courseY.setDisabled(false);
        service.addCourseYSelective(courseY);
        test01();
    }
    @Test
    public void test06(){
        CourseY courseY=new CourseY();
        courseY.setCourseId(2);
        List<CourseY> courseYS=service.selectByExample(courseY);
        for (CourseY courseY1:courseYS){
            System.out.println(courseY1);
        }
    }

    @Test
    public void test07(){
        CourseY courseY=new CourseY();
        courseY.setId(4);
        courseY.setWeekDay("2");
        service.modifyCourseY(courseY);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(4);
        test01();
    }






}
