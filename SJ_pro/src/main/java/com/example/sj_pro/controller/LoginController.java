package com.example.sj_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    /**
     * 首页
     * @return
     */
    @GetMapping("/index")
    public String index(){
       return "/sj_login";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String pwd){

        System.out.println("username="+username+"-----pwd="+pwd);
        return "222";
    }
}
