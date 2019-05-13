package com.gao.service.impl;

import com.gao.cache.ICache;
import com.gao.dao.UserMapper;
import com.gao.entity.User;
import com.gao.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

/**
 * @Author gs
 * @Date created time 2019/5/11 17:54
 * @Description
 */
@EnableCaching
@Service
public class UserServiceIml implements IUserService{

    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private ICache cache;

    @Autowired
    private UserMapper userMapper;

    @Value("${spring.redis.cache.user.key}")
    private String CACHE_USER_KEY;

    @Override
    public User getUserByUsername(String username) {
        User user = userMapper.getUserByName(username);
        cache.setHalfHour(CACHE_USER_KEY + user.getId(),user);//显示调用缓存
        return user;
    }
    //使用注解测试cacheManager
    @Cacheable(value = "user", key="#id")
    @Override
    public User getUserById(String id) {
        User user = userMapper.getUserById(id);
        logger.info("查询数据库");
        return user;
    }
}
