package com.example.sj_pro.service.impl;

import com.example.sj_pro.mapper.UserMapper;
import com.example.sj_pro.model.User;
import com.example.sj_pro.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ILoginServiceImpl implements ILoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String account) {
        return userMapper.checkUser(account);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
