package com.scs.controller;

import com.scs.pojo.ClassSCS;
import com.scs.service.IClassSCSService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class getController {

    private IClassSCSService service;
    public void setService(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IClassSCSService) ac.getBean("classSCSService");
    }


    @RequestMapping(value = "/getGrades",produces = "application/json; charset=utf-8;")
    @ResponseBody
    public List<String> getGrades(HttpServletRequest request, HttpServletResponse response){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IClassSCSService) ac.getBean("classSCSService");
        List<String> grades = service.selectGrades();
        /*for(String s:grades){
            System.out.println(s);
        }*/
        return grades;
    }

    @RequestMapping(value = "/getAcademys",produces = "application/json; charset=utf-8;" )
    @ResponseBody
    public List<String> getAcademys(HttpServletRequest request,HttpServletResponse response){
        setService();
        List<String> academys = service.selectAcademys();
        return academys;

    }

    @RequestMapping(value = "/getMajors",produces = "application/json; charset=utf-8;")
    @ResponseBody
    public List<String> getMajors(String academy, HttpServletRequest request, HttpServletResponse response){
        setService();
        List<String> majors = service.selectMajors(academy);
        return majors;
    }

    @RequestMapping(value = "/getClass",produces = "application/json; charset=utf-8;")
    @ResponseBody
    public List<ClassSCS> getClass(String grade,String academy,String major){
        setService();
        ClassSCS classSCS = new ClassSCS();
        classSCS.setGrade(grade);
        classSCS.setAcademy(academy);
        classSCS.setMajor(major);
        List<ClassSCS> classSCSList = service.selectByExample(classSCS);
        System.out.println(classSCSList);
        return classSCSList;
    }





}
