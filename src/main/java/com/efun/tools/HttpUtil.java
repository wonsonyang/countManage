package com.efun.tools;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Map;

public class HttpUtil {

	private static Logger logger = Logger.getLogger(HttpUtil.class);

	/**
	 * Get方式调用远程链接
	 * 
	 * @param uri
	 *            地址 包含参数
	 * @param params
	 *            参数
	 * @return 是否成功 String
	 */
	public static String sendGetString(String uri, Map<String, String> params) {
		if (StringUtils.isEmpty(uri)) {
			return null;
		}
		StringBuffer paramsBuffer = new StringBuffer();
		if (params != null) {
			Object[] keys = params.keySet().toArray();
			for (Object objKey : keys) {
				String key = String.valueOf(objKey);
				String value = params.get(key);
				paramsBuffer.append("&").append(key).append("=").append(value);
			}
		}
		if (uri.indexOf("?") == -1) {
			uri += "?" + paramsBuffer.substring(1);
		} else if (uri.indexOf("?") != uri.length() - 1) {
			uri += paramsBuffer.toString();
		} else if (uri.indexOf("?") != -1) {
			uri += paramsBuffer.substring(1);
		} else {
			uri += "?" + paramsBuffer.substring(1);
		}
		return sendGetString(uri);
	}

	/**
	 * Get方式调用远程链接
	 * 
	 * @param uri
	 *            地址 包含参数
	 * @return 是否成功 String
	 * 
	 */
	public static String sendGetString(String uri) {
		if (StringUtils.isEmpty(uri)) {
			return null;
		}

		CloseableHttpResponse response = null;
		try {
			CloseableHttpClient client = HttpClients.createDefault();
			HttpGet get = new HttpGet(uri);
			int timeout = 180 * 10000;
			RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout).setConnectionRequestTimeout(timeout)
						.setSocketTimeout(timeout).build();
			get.setConfig(config);
			response = client.execute(get);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			EntityUtils.consume(entity);
			return result;
		} catch (IOException e) {
			logger.error("advertising registered activation failure ,message:" + e.getMessage());
		} finally {
			try {
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				logger.error(e);
			}
		}

		return null;
	}
	
}
