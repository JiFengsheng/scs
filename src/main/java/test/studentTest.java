package test;

import com.scs.pojo.Student;
import com.scs.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class studentTest {

    private IStudentService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IStudentService) ac.getBean("studentService");
    }
    
    /*添加学生*/
    @Test
    public void test01(){
        Student student=new Student(3, 123, "张三", "男", new Date(), new Date(), "广东省广州市", "广东广州市xxx县", "515044", "数学与计算机学院", 1, "a.png", false);
        service.addStudent(student);
        System.out.println(student);
    }
    /*任意添加学生*/
    @Test
    public void test02(){
        Student student = new Student();
        student.setName("lisi");
        student.setAcademy("数学与计算机学院");
        student.setHome("广东省汕头市龙湖区");
        student.setClassId(1);
        student.setEmailCode("515041");
        student.setNativePlace("广东省汕头市");


    }


    
}
