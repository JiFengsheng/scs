package com.scs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class ClientController {

    /*
    * String name, String id, String sex, String birth, String grade,
                                String academy, String major, String c, String email, String admission, String nativePlace,
                                String home,
    * */
    @RequestMapping(value = "/insert")
    public String insertStudent(HttpSession session, String name, String id, String sex, String birth, String grade,
                                String academy, String major, String c, String email, String admission, String nativePlace,
                                String home,@RequestParam("upload")CommonsMultipartFile upload) throws IOException {


        //得到文件名
        String fileName=upload.getOriginalFilename();
        System.out.println(fileName);
        //重新命名为唯一的图片名称
        String uuid= UUID.randomUUID().toString();
        String extendsName = fileName.substring(fileName.lastIndexOf("."),fileName.length());
        String onlyName=uuid+extendsName;
        System.out.println(onlyName);
        File saveDir = new File("E:/upload");
        if(!saveDir.exists()){
            saveDir.mkdir();
        }
        File saveFile=new File(saveDir,onlyName);
        //spring api 保存数据
        upload.transferTo(saveFile);

        String pic = onlyName;
        System.out.println(pic);



        //默认转发，改成重定向
        return "redirect:/Client.jsp";
    }


}
