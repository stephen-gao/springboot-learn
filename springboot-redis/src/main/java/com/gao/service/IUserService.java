package com.gao.service;

import com.gao.entity.User;

/**
 * @Author gs
 * @Date created time 2019/5/11 17:53
 * @Description
 */
public interface IUserService {
    User getUserByUsername(String username);

    User getUserById(String id);
}
