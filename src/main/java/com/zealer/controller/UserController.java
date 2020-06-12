package com.zealer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView newFtl(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("nums","100");
        return modelAndView;
    }

    @RequestMapping(value="/login",produces = "text/plain;charset=utf-8")
    @ResponseBody
    @CrossOrigin(origins = "*")

    public String toLogin(String  uname,String pwd){
        System.out.println(uname+","+pwd);
        if(uname.equals("zhangsan")&&pwd.equals("123")){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
