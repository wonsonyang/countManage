package com.efun.util.redis;

import java.util.Set;

/**
 * redis客户端一致性哈希集群配置下常用的功能操作方法接口类
 * 
 * @author Administrator
 */
public interface IRedisService {

	Long del(byte[] key);

	Long del(String key);

	Long expire(String key, int seconds);

	byte[] get(byte[] key);

	String get(String key);

	Long sadd(String key, String... members);

	Long srem(String key, String... members);

	String set(byte[] key, byte[] value);

	Long setnx(String key, String value);

	String setex(byte[] key, int seconds, byte[] value);

	String setex(String key, int seconds, String value);

	Set<String> smembers(String key);

}
