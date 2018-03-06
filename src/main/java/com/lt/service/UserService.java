package com.lt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lt.entity.User;
import com.lt.mapper.UserMapper;

@Service
public class UserService implements IUserService{
    @Resource
    private UserMapper userMapper;
    
    
    public User userLogin(int userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
