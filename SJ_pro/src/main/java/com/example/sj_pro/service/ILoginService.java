package com.example.sj_pro.service;

import com.example.sj_pro.model.User;

public interface ILoginService {

    /**
     * 登录验证
     * @param account
     * @return
     */
    public User checkUser(String account);

    /**
     * 用户注册
     * @param user
     */
    public void addUser(User user);
}
