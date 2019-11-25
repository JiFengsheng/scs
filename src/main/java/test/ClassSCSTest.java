package test;

import com.scs.pojo.ClassSCS;
import com.scs.service.IClassSCSService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ClassSCSTest {

    private IClassSCSService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IClassSCSService) ac.getBean("classSCSService");
    }
    @Test
    public void test01(){
        ClassSCS classSCS = new ClassSCS("数学与计算机","软件工程1191","软件工程","2019",1);
        service.addClassSCS(classSCS);
        System.out.println(classSCS);
    }

    @Test
    public void test02(){
        ClassSCS classSCS = new ClassSCS();
        classSCS.setAcademy("电子与信息工程学院");
        classSCS.setName("电子工程1161");
        service.addClassSCSSelective(classSCS);

    }

    @Test
    public void test03(){
        List<ClassSCS> classSCSs=service.findAllClassSCSs();
        for (ClassSCS classSCS:classSCSs){
            System.out.println(classSCS);
        }
    }
    @Test
    public void test04(){
        ClassSCS classSCS = new ClassSCS();
        classSCS.setGrade("2016");
        classSCS.setAcademy("数学与计算机");
        classSCS.setMajor("软件工程");
        List<ClassSCS> classSCSList = service.selectByExample(classSCS);
        for(ClassSCS classSCS1:classSCSList){

            System.out.println(classSCS1);
        }
    }
    @Test
    public void test05(){
        Long a= service.countClassSCSs();
        System.out.println(a);
    }
    @Test
    public void test06(){
        ClassSCS classSCS=service.findClassSCSById(2);
        System.out.println(classSCS);
    }

    @Test
    public void test07(){
        ClassSCS classSCS = new ClassSCS();
        classSCS.setId(14);
        classSCS.setGrade("2019");
        service.modifyClassSCS(classSCS);
    }
    @Test
    public void test08(){
        service.removeById(14);
        test03();
    }
    @Test
    public void test09(){
        List<String> list = service.selectGrades();
        for (String s:list){
            System.out.println(s);
        }
    }
    @Test
    public void test10(){
        List<String> list = service.selectAcademys();
        for (String s:list){
            System.out.println(s);
        }
    }
    @Test
    public void test11(){
        List<String> list = service.selectMajors("数学与计算机");
        for(String s:list){
            System.out.println(s);
        }
        List<String> list1 = service.selectMajors("电子信息工程");
        for(String s:list1){
            System.out.println(s);
        }
    }





}
