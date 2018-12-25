package com.efun.util.redis;

import org.apache.log4j.Logger;
import redis.clients.jedis.ShardedJedis;

import java.util.Set;

/**
 * redis客户端一致性哈希集群配置下常用的功能操作方法接口实现类
 * 
 * @author lujiang
 * @updateTime 2015年3月6日17:47:57
 * 
 */
public class RedisService implements IRedisService {

	private static final Logger log = Logger.getLogger(RedisService.class);

	@Override
	public Long del(byte[] key) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.del(key);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Long del(String key) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.del(key);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Long expire(String key, int seconds) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.expire(key, seconds);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public byte[] get(byte[] key) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		byte[] result = null;
		try {
			redis = Redis.getRedis();
			result = redis.get(key);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public String get(String key) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		String result = null;
		try {
			redis = Redis.getRedis();
			result = redis.get(key);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Long sadd(String key, String... members) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.sadd(key, members);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public String set(byte[] key, byte[] value) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		String result = null;
		try {
			redis = Redis.getRedis();
			result = redis.set(key, value);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public String setex(byte[] key, int seconds, byte[] value) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		String result = null;
		try {
			redis = Redis.getRedis();
			result = redis.setex(key, seconds, value);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public String setex(String key, int seconds, String value) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		String result = null;
		try {
			redis = Redis.getRedis();
			result = redis.setex(key, seconds, value);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Long setnx(String key, String value) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.setnx(key, value);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Set<String> smembers(String key) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Set<String> result = null;
		try {
			redis = Redis.getRedis();
			result = redis.smembers(key);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

	@Override
	public Long srem(String key, String... members) {

		ShardedJedis redis = null;
		boolean isBroken = false;

		Long result = null;
		try {
			redis = Redis.getRedis();
			result = redis.srem(key, members);
		} catch (Exception e) {

			isBroken = true;
			log.info("pool or redis object or command :" + e.getMessage());
		} finally {
			Redis.releaseRedis(redis, isBroken);
		}
		return result;
	}

}
