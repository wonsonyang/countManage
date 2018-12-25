package com.efun.util.redis;

import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.log4j.Logger;
import redis.clients.jedis.ShardedJedis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * redis客户端一致性哈希集群配置
 * 
 * @author Administrator
 * 
 */
public class Redis {

	private Redis() {
	}

	private static final Logger log = Logger.getLogger(Redis.class);
	private static ShardedJedisSentinelPool pool = null;
	private static AtomicBoolean poolState = new AtomicBoolean(false);

	static {
		if (!poolState.get()) {
			if (initPool()) {
				poolState.set(true);
			}
		}
	}

	synchronized private static boolean initPool() {
		try {
			if (poolState.get()) {
				return true;
			}
			destroyPool();

			CompositeConfiguration config = new CompositeConfiguration();
			// 改变Apache Configuration List默认分隔符，并禁用
			AbstractConfiguration.setDefaultListDelimiter('~');
			config.setDelimiterParsingDisabled(true);

			try {
				config.addConfiguration(new PropertiesConfiguration("redis.properties"));
			} catch (Exception e) {
				throw new IllegalArgumentException("[redis.properties] is not found!");
			}

			GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
			poolConfig.setMaxIdle(Integer.valueOf(config.getString("redis.pool.maxIdle")));
			poolConfig.setMaxWaitMillis(Long.valueOf(config.getString("redis.pool.maxWait")));
			poolConfig.setTestOnBorrow(Boolean.valueOf(config.getString("redis.pool.testOnBorrow")));
			poolConfig.setTestOnReturn(Boolean.valueOf(config.getString("redis.pool.testOnReturn")));
			poolConfig.setMaxTotal(Integer.valueOf(config.getString("redis.pool.maxActive")));

			int timeout = Integer.valueOf(config.getString("redis.pool.timeout"));

			// 方案二
			// 以|隔开
			String servers = config.getString("redis.serverNames");
			String sentinels = config.getString("redis.sentinels");
			List<String> serverNameList = new ArrayList<String>();
			Set<String> sentinelSet = new HashSet<String>();
			String[] names = new String[0];
			String[] sents = new String[0];
			if (CommonUtil.objectIsNotNull(servers)) {
				names = servers.split("\\|");
			}
			if (CommonUtil.objectIsNotNull(sentinels)) {
				sents = sentinels.split("\\|");
			}
			for (String str : names) {
				if (CommonUtil.objectIsNotNull(str)) {
					serverNameList.add(str);
				}
			}
			for (String str : sents) {
				if (CommonUtil.objectIsNotNull(str)) {
					sentinelSet.add(str);
				}
			}
			log.info(new StringBuilder(2).append("redis.serverNames>>>").append(servers).toString());
			log.info(new StringBuilder(2).append("redis.sentinels>>>").append(sentinels).toString());
			pool = new ShardedJedisSentinelPool(serverNameList, sentinelSet, poolConfig, timeout);

			if (pool == null) {
				log.error("SentinelPool初始化失败");
			} else {
				log.info("SentinelPool初始化成功");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("[redis.properties] 属性文件中属性配置错误!" + e.getMessage());
		}
		return false;
	}

	/***
	 * 分地区清除pool对象
	 * 
	 * @author lujiang
	 * @date 2015年3月6日17:34:14
	 */
	private static void destroyAllPool() {
		try {
			if (pool != null) {
				pool.destroy();
			}
		} catch (Exception e) {
			log.error("pool destroy error:" + e.getMessage());
		} finally {
			pool = null;
		}
	}

	public static void destroyPool() {
		try {
			destroyAllPool();
			if (pool != null) {
				pool.destroy();
			}
		} catch (Exception e) {
			log.error("pool destroy error:" + e.getMessage());
		} finally {
			pool = null;
		}
	}

	/***
	 * 获取一个Redis对象，该对象可添加/更新缓存。
	 * 
	 * @return ShardedJedis obj
	 * @date 2015年1月4日10:19:21
	 */
	public static ShardedJedis getRedis() {
		return pool.getResource();
	}

	public static void releaseRedis(ShardedJedis redis, boolean isBroken) {
		if (redis == null) {
			log.error("releaseRedis error:redis is null");
			return;
		}
		try {
			if (isBroken) {
				pool.returnBrokenResource(redis);
			} else {
				pool.returnResource(redis);
			}
		} catch (Exception e) {
			log.error("releaseRedis exception:" + e.getMessage());
		}
	}

}
