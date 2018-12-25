package com.efun.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CoderUtil {

	public static final String DEFAULT_CHARSET = "UTF-8";

	/**
	 * 解码
	 * 
	 * @param str
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	public static final String decode(String str, String charset) throws UnsupportedEncodingException {
		try {
			return URLDecoder.decode(str, charset);
		} catch (UnsupportedEncodingException e) {
			throw e;
		} catch (Exception e) {
			return str;
		}
	}

	/**
	 * 编码
	 * 
	 * @param str
	 * @param charset
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static final String encode(String str, String charset) throws UnsupportedEncodingException {
		return URLEncoder.encode(str, charset);
	}

}
