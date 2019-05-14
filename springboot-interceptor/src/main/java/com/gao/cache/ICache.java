package com.gao.cache;

/**
 * @Author gs
 * @Date created time 2019/5/13 20:51
 * @Description
 */
public interface ICache<V> {
    /**
     * 60秒
     */
    public static final long ONE_MIN_SECONDS = 60;
    /**
     * 半小时
     */
    public static final long HALF_HOUR_SECONDS = 30 * ONE_MIN_SECONDS;

    /**
     * 保存自定义时长
     */
    void set(final String key, V value, Long expireTime);

    /**
     * 保存半小时
     */
    void setHalfHour(String key, V value);

    /**
     * 查询
     */
    V get(final String key);

    /**
     * 删除
     */
    public void remove(final String key);
}
