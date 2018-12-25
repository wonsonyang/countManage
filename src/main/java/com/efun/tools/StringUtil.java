package com.efun.tools;

import java.util.*;

//处理各种类型变量转换成String，输出“”，不是“rull”
public class StringUtil {

	/**
	 * 判断String 是否为空
	 * 
	 * @param b
	 * @return false
	 */

	public static boolean stringIsNull(String b) {

		if (b == null || b.equals("null") || b.equals("")) {
			return false;
		}

		return true;
	}

	/**
	 * 判断字符串是否为空 null对象，"null"字符串，""字符串都为空
	 * 
	 * @param str
	 *            被判断的字符串
	 * @return
	 */
	public static boolean isNotEmpty(String str) {

		if (str == null || "null".equalsIgnoreCase(str) || str.trim().length() == 0) {// 为空
			return false;
		} else {
			return true;
		}

	}

	public static boolean isEmpty(String str) {

		return !isNotEmpty(str);
	}

	/**
	 * 是否包含空
	 * 
	 * @param args
	 * @return
	 */
	public static boolean haveEmpty(String... args) {
		if (null == args || args.length == 0) {
			return true;
		}
		for (String s : args) {
			if (null == s || s.equals("")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断params里面是否包含args
	 * 
	 * @author Leng
	 */
	public static boolean haveEmpty(Map<String, String> params, String... args) {
		if (null == args || args.length == 0) {
			return true;
		}
		for (String s : args) {
			if (isEmpty(params.get(s))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 字符串str是否存在于strArr數組中<br>
	 * 
	 * @param str
	 *            字符串
	 * @param strArr
	 *            字符串數組
	 * @param isEgnoreCase
	 *            是否忽略大小寫
	 * @return
	 */
	public static boolean isExist(String str, String[] strArr, boolean isEgnoreCase) {
		if (null == str || null == strArr) {
			return false;
		}

		for (int i = 0; i < strArr.length; i++) {
			if (isEgnoreCase && str.equalsIgnoreCase(strArr[i])) {
				return true;
			} else if (str.equals(strArr[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 字符串数组转int数组
	 * 
	 * @param strArr
	 * @return
	 */
	public static Integer[] strArrToIntArr(String[] strArr) {
		if (null == strArr) {
			return null;
		}

		int strArrSize = strArr.length;

		Integer[] iArr = new Integer[strArrSize];
		for (int i = 0; i < strArrSize; i++) {
			String sTemp = strArr[i];
			iArr[i] = Integer.parseInt(sTemp);
		}
		return iArr;
	}

	/**
	 * 数组去除重复
	 * 
	 * @param strArr
	 *            数组
	 * @param orgOrder
	 *            是否保持原来的顺序
	 * @return
	 */
	public static String[] strArrDuplicateRemoval(String[] strArr, boolean orgOrder) {
		if (orgOrder) {
			// array_unique
			List<String> list = new LinkedList<String>();
			for (int i = 0; i < strArr.length; i++) {
				if (!list.contains(strArr[i])) {
					list.add(strArr[i]);
				}
			}
			return (String[]) list.toArray(new String[list.size()]);
		} else {
			Set<String> set = new HashSet<String>();
			set.addAll(Arrays.asList(strArr));
			return set.toArray(new String[0]);
		}
	}

	public static String selectMultipleToSqlWhere(String params) {
		String[] array = params.split(", ");
		String result = "";
		for (String str : array) {
			result += ",'" + str + "'";
		}
		return "".equals(result) ? result : result.substring(1);
	}

}
