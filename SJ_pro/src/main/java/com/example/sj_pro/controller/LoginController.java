package com.example.sj_pro.controller;

import com.example.sj_pro.model.User;
import com.example.sj_pro.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class LoginController {

    @Autowired
    private ILoginService iLoginService;

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
        User user = iLoginService.checkUser(username);
        System.out.println(username);
        return "222";
    }

    /**
     * 跳转注册页面
     * @return
     */
    @GetMapping("/toResetPage")
    public String toReset(){
        System.out.println("跳转注册页面");
        return "/reset";
    }

    /**
     * 注册验证
     * @return
     */
    @RequestMapping("/resetCheck")
    @ResponseBody
    public String resetCheck(String name,String account,String sex,String pwd){
        User user = iLoginService.checkUser(account);
        User user1 = new User();
        user1.setAccount(account);
        user1.setName(name);
        user1.setSex(sex);
        user1.setPwd(pwd);
        user1.setCreate_time(new Date());
        if(user==null){
            iLoginService.addUser(user1);
            return "ok";
        }else{
            return "fail";
        }
    }
}
