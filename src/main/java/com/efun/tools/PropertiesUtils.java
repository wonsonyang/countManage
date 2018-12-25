package com.efun.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * 配置文件工具类，用于加载指定文件，主要用于类目录同级目录文件
 */
public class PropertiesUtils {

	/**
	 * 获取文件Properties对象
	 * 
	 * @return
	 */
	public static Properties getProperties(String file) {
		Properties properties = null;
		// 获取download.properties绝对路径
		String path = PropertiesUtils.class.getClassLoader().getResource(file).getPath();

		// 加载download.properties文件
		InputStream inputStream = null;

		try {
			try {
				inputStream = new FileInputStream(path);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				throw new RuntimeException("读取" + file + "文件失败!");
			}

			if (inputStream != null) {
				properties = new Properties();

				try {
					properties.load(inputStream);
				} catch (IOException e) {
					e.printStackTrace();
					throw new RuntimeException("读取" + file + "文件失败!");
				}
			}
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e) {
				}
			}
		}

		return properties;
	}

	/**
	 * 获取download.properties文件所有的key-value集合
	 */
	public static Map<String, String> getMaps(String file) {

		// 获取properties对象
		Properties properties = getProperties(file);

		if (properties == null) {
			return null;
		}

		Map<String, String> map = new HashMap<String, String>();

		Set<Entry<Object, Object>> entrySet = properties.entrySet();

		for (Entry<Object, Object> entry : entrySet) {

			String key = (String) entry.getKey();// key
			String value = (String) entry.getValue();// value

			// 添加到集合中
			map.put(key, value);

		}

		return map;
	}

	/**
	 * 根据key获取对应的值
	 * 先读取缓存，再读配置文件
	 * 
	 * @param file
	 *            配置文件
	 * @param key
	 *            对应的key
	 * @return
	 */
	public static String get(String file, String key) {
		if (StringUtil.isNotEmpty(file) && StringUtil.isNotEmpty(key)) {
			try {
				// 获取properties对象
				Properties properties = getProperties(file);

				if (properties != null) {
					return properties.getProperty(key);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return "";
	}

	/**
	 * 通过key获取域名,key示例pay_asia,pf_asia
	 * 
	 * @author Leng
	 * @date 2016-2-18
	 */
	public static String getDomain(String key) {
		return get("area.properties", key);
	}

}
