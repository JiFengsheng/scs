package com.scs.controller;


import com.sun.deploy.net.HttpResponse;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public void test(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("hello");
    }

}
