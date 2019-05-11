package com.gao.service.impl;

import com.gao.dao.UserMapper;
import com.gao.entity.User;
import com.gao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author gs
 * @Date created time 2019/5/11 17:54
 * @Description
 */
@Service
public class UserServiceIml implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByName(username);
    }
}
