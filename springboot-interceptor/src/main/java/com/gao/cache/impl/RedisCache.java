package com.gao.cache.impl;

import com.gao.cache.ICache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author gs
 * @Date created time 2019/5/13 20:52
 * @Description
 */
@Component
public class RedisCache<V> implements ICache<V>{

    // 在构造器中获取redisTemplate实例, key(not hashKey) 默认使用String类型
    private RedisTemplate<String, V> redisTemplate;
    private ValueOperations<String, V> valueOperations;

    // 实例化操作对象后就可以直接调用方法操作Redis数据库
    @Autowired
    public RedisCache(RedisTemplate<String, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.valueOperations = redisTemplate.opsForValue();
    }

    @Override
    public void set(String key, V value, Long expireTime) {
        valueOperations.set(key, value ,expireTime, TimeUnit.SECONDS);
    }

    @Override
    public void setHalfHour(String key, V value) {
        set(key,value,HALF_HOUR_SECONDS);
    }

    @Override
    public V get(String key) {
        V v = valueOperations.get(key);
        return v;
    }

    @Override
    public void remove(String key) {
        redisTemplate.delete(key);
    }
}
