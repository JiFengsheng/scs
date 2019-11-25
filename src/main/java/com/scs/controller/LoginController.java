package com.scs.controller;

import com.scs.pojo.User;
import com.scs.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    private IUserService service;

    public void setService(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IUserService) ac.getBean("userService");
    }

    @RequestMapping("/LoginController")
    public String login(String name, String password, HttpSession session){

        System.out.println(name);
        System.out.println(password);
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        List<User> users=service.selectByExample(user);
        if(users.size()!=0){



        }else {

        }



        return "hello";


    }



}
