package com.example.sj_pro.controller;

import com.example.sj_pro.model.User;
import com.example.sj_pro.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "/resetPage";
    }

    /**
     * 注册验证
     * @return
     */
    @RequestMapping("/resetCheck")
    @ResponseBody
    public String resetCheck(String username){
        System.out.println(username);
        User user = iLoginService.checkUser(username);
        System.out.println(user);
        if(user==null){
            return "ok";
        }else{
            return "fail";
        }
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping("/reset")
    @ResponseBody
    public String reset(User user){
        System.out.println(user.getPwd());
        iLoginService.addUser(user);
        return "ok";
    }
}
