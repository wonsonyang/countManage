package com.efun.tools;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * json对象返回内容封装
 * 
 * @author Leng
 * 
 */
public class JSONObjectUtil {

	/**
	 * 获取JSONObject對象
	 * 
	 * @param code
	 *            code值
	 * @param message
	 *            message消息
	 * @return
	 */
	public static JSONObject getJSONObject(String code, String message) {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("message", message);
		return json;
	}

	public static JSONObject getJSONObject(String code, String message,
			Object obj) {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("message", message);
		json.put("objList", obj);
		return json;
	}

	/**
	 * 将list集合转换为json数组
	 * 
	 * @param list
	 * @return
	 */
	public static JSONArray toJSONArray(List<?> list) {
		if (null == list) {
			return null;
		}
		JSONArray jArr = new JSONArray();

		for (int i = 0; i < list.size(); i++) {
			JSONObject j = (JSONObject) JSONObject.toJSON(list.get(i));
			jArr.add(j);
		}
		return jArr;
	}

	/**
	 * 将List对象转换成JSONArray数组
	 * 
	 * @param list
	 * @return
	 */
	public static JSONArray parseJSONArray(List<?> list) {
		JSONArray jArr = new JSONArray();
		if (null == list || list.size() == 0) {
			return jArr;
		}

		for (Object object : list) {
			try {
				JSONObject json = (JSONObject) JSONObject.toJSON(object);
				jArr.add(json);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return jArr;
	}

	/**
	 * map转换成JSONObject对象
	 * @author Leng
	 * @date 2016-1-25
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static JSONObject maptoJson(Map map) {
	    Iterator<Entry<String,Object>> it=map.entrySet().iterator();
		JSONObject json=new JSONObject();
		while (it.hasNext()) {
			Entry<String,Object> e=it.next();
			String key=e.getKey();
			Object value=e.getValue();
			json.put(key, value);
		}
		return json;
	}

}
