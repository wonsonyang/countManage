package com.efun.util;


import org.apache.commons.lang3.StringUtils;

/**
 * 获取配置文件值的工具类
 * 
 * @author huyunchong
 */
public final class PropUtil {

	/**
	 * 项目的主配置文件名称
	 */
	public final static String BASEPROP = "common.properties";

	/**
	 * 根据key获取value的方法
	 * 
	 * @param key
	 * @return value
	 */
	public static String getString(String key) {
		return getString(key, null);
	}

	/**
	 * 根据key获取value的方法(含缓存处理)
	 * 
	 * @param key
	 * @param defaultValue
	 *            获取不到值时的默认返回值
	 * @return value
	 */
	public static String getString(String key, String defaultValue) {
		return getString(key, defaultValue, BASEPROP);
	}

	/**
	 * 根据key获取value的方法(不含缓存处理)
	 * 
	 * @param key
	 * @param defaultValue
	 *            获取不到值时的默认返回值
	 * @param baseFile
	 *            要获取值的文件地址
	 * @return value
	 */
	public static String getString(String key, String defaultValue, String baseFile) {

		return defaultValue;
	}

	/**
	 * 获取基础vpn.ip
	 * 
	 * @return 字符串格式 ip
	 */
	public static String getBaseVpnIp() {
		System.out.println(getString("base.vpn.ip"));
		return getString("base.vpn.ip");
	}

}
