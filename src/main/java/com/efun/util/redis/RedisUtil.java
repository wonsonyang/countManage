package com.efun.util.redis;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

import java.util.Set;

/**
 * redis客户端一致性哈希集群配置下常用的功能操作方法
 * 
 * @author Administrator
 * 
 */
public class RedisUtil {

	private final static JdkSerializationRedisSerializer jdkSerializer = new JdkSerializationRedisSerializer();

	private RedisUtil() {
	}

	private static IRedisService redisService = new RedisService();

	public static Long del(byte[] key) {
		return redisService.del(key);
	}

	/**
	 * @author lujiang
	 * @date 2015年1月4日11:45:29 清除键-值
	 * @param key
	 * @return 1 清除成功/ 0 清楚失败
	 */
	public static Long del(String key) {
		return redisService.del(key);
	}

	public static Long expire(String key, int seconds) {
		return redisService.expire(key, seconds);
	}

	public static byte[] get(byte[] key) {
		return redisService.get(key);
	}

	public static String get(String key) {
		return redisService.get(key);
	}

	public static Long setnx(String key, String value) {
		return redisService.setnx(key, value);
	}

	public static String setex(byte[] key, int seconds, byte[] value) {
		return redisService.setex(key, seconds, value);
	}

	public static String setex(String key, int seconds, String value) {
		return redisService.setex(key, seconds, value);
	}

	public static Long sadd(String key, String... members) {
		return redisService.sadd(key, members);
	}

	public static Long srem(String key, String... members) {
		return redisService.srem(key, members);
	}

	public static Set<String> smembers(String key) {
		return redisService.smembers(key);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getValue(String key) {
		byte[] bytes = redisService.get(jdkSerializer.serialize(key));

		if (bytes != null && bytes.length > 0) {
			return (T) jdkSerializer.deserialize(bytes);
		} else {
			return null;
		}
	}

	public static void setValue(String key, Object value) {
		byte[] bytes = jdkSerializer.serialize(key);
		redisService.set(bytes, jdkSerializer.serialize(value));
	}

	public static void setValue(String key, Object value, int seconds) {
		byte[] bytes = jdkSerializer.serialize(key);
		redisService.setex(bytes, seconds, jdkSerializer.serialize(value));
	}

}
