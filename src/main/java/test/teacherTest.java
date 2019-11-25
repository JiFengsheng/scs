package test;

import com.scs.pojo.Teacher;
import com.scs.service.ITeacherService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class teacherTest {

    private ITeacherService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(ITeacherService) ac.getBean("teacherService");
    }

    @Test
    public void test01(){
        Teacher teacher = new Teacher(11, "zzz", "男", new Date(), new Date(), "广东省某市某区某县", "数学老师", "辅导员", "a.png",  false);
        service.addTeacher(teacher);
        System.out.println(teacher);

    }

    @Test
    public void test02(){
        Teacher teacher = new Teacher();
        teacher.setUserId(12);
        teacher.setName("yyy");
        teacher.setSex("男");
        service.addTeacherSelective(teacher);

    }
    /*查询教师数量*/
    @Test
    public void test03(){
        Long a = service.countTeachers();
        System.out.println(a);
    }
    /*查询所有的教师*/
    @Test
    public void test04(){
        List<Teacher> teachers = service.findAllTeachers();
        for (Teacher teacher:teachers){
            System.out.println(teacher);
        }
    }
    /*任意性查询教师*/
    @Test
    public void test05(){
        Teacher teacher = new Teacher();
        teacher.setName("z");
        List<Teacher> teachers = service.selectByExample(teacher);
        for(Teacher teacher1:teachers){
            System.out.println(teacher1);
        }
    }
    /*通过id查询*/
    @Test
    public void test06(){
        Teacher teacher = service.findTeacherById(3);
        System.out.println(teacher);
    }

    @Test
    public void test07(){
        service.removeById(4);
        List<Teacher> teachers = service.findAllTeachers();
        for (Teacher teacher:teachers){
            System.out.println(teacher);
        }
    }

    @Test
    public void test08(){
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("杨福广");
        service.modifyTeacher(teacher);
    }

    @Test
    public void test09(){
        Map map=new HashMap();
        map.put("start",0);
        map.put("num",3);
        List<Teacher> teachers=service.selectByLimit(map);
        for (Teacher teacher:teachers){
            System.out.println(teacher);
        }
    }


}
