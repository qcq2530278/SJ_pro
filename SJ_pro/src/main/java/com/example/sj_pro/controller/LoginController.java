package com.example.sj_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public void login(){
        System.out.println("甜甜大傻瓜");
    }
}
