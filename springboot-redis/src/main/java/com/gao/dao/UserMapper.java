package com.gao.dao;

import com.gao.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author gs
 * @Date created time 2019/5/11 17:48
 * @Description
 */
@Mapper
public interface UserMapper {

    User getUserByName(String username);

    User getUserById(String Id);
}
