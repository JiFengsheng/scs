package test;

import com.scs.pojo.CourseX;
import com.scs.service.ICourseXService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class CourseXTest {

    private ICourseXService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ICourseXService) ac.getBean("courseXService");
    }

    @Test
    public void test01(){
        List<CourseX> courseXES=service.findAllCourseXs();
        for(CourseX courseX:courseXES){
            System.out.println(courseX);
        }
    }

    @Test
    public void test02(){
        Long a = service.countCourseXs();
        System.out.println(a);
    }

    @Test
    public void test03(){
        CourseX courseX = service.findCourseXById(2);
        System.out.println(courseX);
    }

    @Test
    public void test04(){
        CourseX courseX=new CourseX(2, "大学生创新实践", 2, new Date(), new Date(), false);
        service.addCourseX(courseX);
        System.out.println(courseX);

    }
    @Test
    public void test05(){
        CourseX courseX=new CourseX();
        courseX.setTeacherId(3);
        courseX.setName("软件工程");
        courseX.setEndTime(new Date());
        service.addCourseXSelective(courseX);
    }

    @Test
    public void test06(){
        CourseX courseX=new CourseX();
        courseX.setId(4);
        courseX.setCredit(4);
        service.modifyCourseX(courseX);

    }
    @Test
    public void test07(){
        CourseX courseX=new CourseX();
//        courseX.setName("新");
        courseX.setCredit(4);
        List<CourseX> courseXES=service.selectByExample(courseX);
        for(CourseX courseX1:courseXES){
            System.out.println(courseX1);
        }
    }
    @Test
    public void test08(){
        service.removeById(5);
    }

}
