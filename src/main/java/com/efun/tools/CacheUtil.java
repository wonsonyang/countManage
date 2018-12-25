package com.efun.tools;

import com.efun.util.redis.RedisUtil;

public class CacheUtil {

    private static final String KEY_PREFIX = "AE_manager_";

    public static <T> T getCacheByKey(String key) {
        return RedisUtil.getValue(KEY_PREFIX + key);
    }

    public static <T> T getCacheByKey(String key, Class<T> classType) {
        return RedisUtil.getValue(KEY_PREFIX + key);
    }

    public static <T> void addCache(String key, T t, int seconds) {
        RedisUtil.setValue(KEY_PREFIX + key, t, seconds);
    }

    public static <T> void addCache(String key, T t, Class<T> classType, int seconds) {
        RedisUtil.setValue(KEY_PREFIX + key, t, seconds);
    }

    public static <T> void updateCache(String key, T t, Class<T> classType) {
        RedisUtil.setValue(KEY_PREFIX + key, t);
    }

    public static <T> void deleteCache(String key, Class<T> classType) {
        RedisUtil.del(KEY_PREFIX + key);
    }

}
