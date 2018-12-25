package com.efun.sevsecury.core;

import com.efun.tools.CacheUtil;

public class CacheManagerTools<T> {

	private Integer DEFAULT_CACHE_TIME = 60 * 60 * 24 * 5;

	public void addStringToCache(String key, String value) {
		if (value != null) {
			CacheUtil.deleteCache(key, String.class);
			CacheUtil.addCache(key, value, String.class, DEFAULT_CACHE_TIME);
		}
	}

}
