package com.example.sj_pro.mapper;

import com.example.sj_pro.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 登录验证用户
     * @param account
     * @return
     */
    User checkUser(String account);
}