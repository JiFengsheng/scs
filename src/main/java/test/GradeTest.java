package test;

import com.scs.pojo.Grade;
import com.scs.service.IGradeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class GradeTest {

    private IGradeService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IGradeService) ac.getBean("gradeService");
    }

    @Test
    public void test01(){
        List<Grade> grades=service.findAllGrades();
        for (Grade grade:grades){
            System.out.println(grade);
        }
    }

    @Test
    public void test02(){
        Long a = service.countGrades();
        System.out.println(a);
    }

    @Test
    public void test03(){
        Grade grade=service.findGradeById(1);
        System.out.println(grade);
    }
    @Test
    public void test04(){
        Grade grade=new Grade();
        grade.setGrade(80);
        List<Grade> grades=service.selectByExample(grade);
        for (Grade grade1:grades){
            System.out.println(grade1);
        }
    }
    @Test
    public void test05(){
        Grade grade=new Grade(2,4,90);
        service.addGrade(grade);
        System.out.println(grade);

    }

    @Test
    public void test06(){
        Grade grade = new Grade();
        grade.setCourseId(3);
        grade.setStudentId(2);
        service.addGradeSelective(grade);
        test01();
    }
    @Test
    public void test07(){
        Grade grade=new Grade();
        grade.setId(3);
        grade.setGrade(85);
        service.modifyGrade(grade);
        test01();
    }
    @Test
    public void test08(){
        service.removeById(3);
    }


}
