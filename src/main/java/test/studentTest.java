package test;

import com.scs.pojo.Student;
import com.scs.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

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
        Student student=new Student(4, 123, "王五", "男", new Date(), new Date(), "广东省某市", "广东某市xxx县", "515044", "数学与计算机学院", 1, "a.png", false);
        service.addStudent(student);
        System.out.println(student);
    }
    /*任意添加学生*/
    @Test
    public void test02(){
        Student student = new Student();
        student.setUserId(1);
        student.setName("lisi");
        student.setAcademy("数学与计算机学院");
        student.setHome("广东省汕头市龙湖区");
        student.setClassId(1);
        student.setEmailCode("515041");
        student.setNativePlace("广东省汕头市");
        service.addStudentSelective(student);

    }

    /*查询所有的学生数量*/
    @Test
    public void test03(){
        Long a = service.countStudents();
        System.out.println(a);
    }

    /*删除学生*/
    @Test
    public void test04(){
        service.removeById(3);
    }

    /*查询所有学生*/
    @Test
    public void test05(){
        List<Student> students = service.findAllStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }
    /*任意查询学生*/
    @Test
    public void test06(){
        Student student = new Student();
        student.setName("五");
        List<Student> students = service.selectByExample(student);
        for(Student student1:students){
            System.out.println(student1);
        }

    }

    /*通过id查询学生*/
    @Test
    public void test07(){
        Student student = service.findStudentById(2);
        System.out.println(student);
    }
    /*修改测试*/
    @Test
    public void test08(){
        Student student = new Student();
        student.setId(2);
        student.setEmailCode("515041");
        service.modifyStudent(student);
        System.out.println(service.findStudentById(2));

    }







    
}
