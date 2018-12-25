package com.efun.sevsecury.action;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.efun.po.TDepartmentGame;
import com.efun.tools.TypeSet;
import com.efun.sevsecury.core.UserContainer;
import com.efun.tools.DataSourceMap;
import com.efun.tools.PropertiesUtils;
import com.efun.util.du.AreaUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.Map.Entry;

/**
 * 
 * @author xp 2012-11-30
 * @param <T>
 */
public class ToolAction<T> extends ActionSupport
		implements SessionAware, ServletRequestAware, ServletResponseAware, ModelDriven<T> {

	private static final long serialVersionUID = 1L;

	public ActionContext actionContext = ActionContext.getContext();
	public HttpServletRequest request;
	public HttpServletResponse response;
	public SessionMap<String, Object> session;
	protected String height;
	public PrintWriter out;
	private Map<DataSourceMap, String> MAP_CORE_MASTER = TypeSet.getInstanse().getAREA_CORE_MASTER();
	private Map<DataSourceMap, String> MAP_CORE_SLAVE = TypeSet.getInstanse().getAREA_CORE_SLAVE();
	private Map<DataSourceMap, String> MAP_EXTEND_MASTER = TypeSet.getInstanse().getAREA_EXTEND_MASTER();
	private Map<DataSourceMap, String> MAP_EXTEND_SLAVE = TypeSet.getInstanse().getAREA_EXTEND_SLAVE();

	/**
	 * 类型集合
	 */
	private Map<String, Object> TYPES = TypeSet.getTypeSets();

	/**
	 * 参数map集合
	 */
	protected Map<String, String> params = new HashMap<String, String>();

	protected static final String LIST = "list";

	protected T entity;

	@SuppressWarnings("unchecked")
	protected ToolAction() { // 构造函数只允许子类使用
		// 获取泛型的类型
		Type type = this.getClass().getGenericSuperclass();
		// 将类型强转成参数化类型
		ParameterizedType p = (ParameterizedType) type;
		// 获取参数化类型列表，并把第一个参数化类型强转成Class类型对象
		Class<?> clazz = (Class<?>) p.getActualTypeArguments()[0];
		try {
			// 创建该类型的实例
			entity = (T) clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String list() throws Exception {
		return LIST;
	}

	public void setServletRequest(HttpServletRequest request) {

		this.request = request;
		initialize();
	}

	public void setServletResponse(HttpServletResponse response) {

		this.response = response;
	}

	public void setSession(Map<String, Object> map) {
		this.session = (SessionMap<String, Object>) map;
	}

	public T getModel() {
		return entity;
	}

	public void setParameters(Map<String, String[]> parameters) {
		parameters.remove("pager.offset");
	}

	public Map<DataSourceMap, String> getMAP_EXTEND_MASTER() {
		return judgeAreaLimit(MAP_EXTEND_MASTER);
	}

	public Map<DataSourceMap, String> getMAP_EXTEND_SLAVE() {
		return judgeAreaLimit(MAP_EXTEND_SLAVE);
	}

	public Map<DataSourceMap, String> getMAP_CORE_MASTER() {
		return judgeAreaLimit(MAP_CORE_MASTER);
	}

	public Map<DataSourceMap, String> getMAP_CORE_SLAVE() {
		return judgeAreaLimit(MAP_CORE_SLAVE);
	}

	private Map<DataSourceMap, String> judgeAreaLimit(Map<DataSourceMap, String> params) {
		Map<DataSourceMap, String> maps = new LinkedHashMap<DataSourceMap, String>();

		TDepartmentGame[] departArrays = (TDepartmentGame[]) session.get(UserContainer.USER_DEPART_OBJECT);
		if (null == departArrays || departArrays.length == 0) {
			return maps;
		}

		List<DataSourceMap> list = new ArrayList<DataSourceMap>();
		Iterator<Entry<DataSourceMap, String>> it = params.entrySet().iterator();
		while (it.hasNext()) {
			Entry<DataSourceMap, String> e = it.next();
			DataSourceMap ds = e.getKey();
			list.add(ds);
		}

		for (int i = 0; i < departArrays.length; i++) {
			TDepartmentGame td = departArrays[i];
			if (td == null) {
				continue;
			}
			String departCode = td.getDepartCode() + "";

			for (DataSourceMap dataSourceMap : list) {
				String dataName = dataSourceMap + "";
				if (dataName.startsWith(departCode) || departCode.startsWith(dataName)) {
					maps.put(dataSourceMap, params.get(dataSourceMap));
				}
			}
		}

		return maps;
	}

	/**
	 * ajax打印返回参数
	 * 
	 * @param str
	 */
	public void ajaxPri(Boolean str) {
		ajaxPriMain("text/html;charset=UTF-8", str);
	}

	public void ajaxPri(String str) {
		ajaxPriMain("text/html;charset=UTF-8", str);
	}

	public void ajaxPri(Long vl) {
		ajaxPriMain("text/html;charset=UTF-8", vl);
	}

	public void ajaxPri(JSONObject json) {
		ajaxPriMain("application/json;charset=UTF-8", json);
	}

	public void ajaxPri(JSONArray json) {
		ajaxPriMain("application/json;charset=UTF-8", json);
	}

	public void ajaxPri(String str, int t) {
		ajaxPriMain("text/xml;charset=UTF-8", str);
	}

	public void ajaxPri(int str) {
		ajaxPriMain("text/html;charset=UTF-8", str);
	}

	/**
	 * 根据str值,转换成对应的json,示例str等于1,则返回{"code":"1000","message":"success"},或者失败,返回{"code":"1004","message":"fail"},
	 * 其中message可自定义,成功和失败分别去strArr的位置0和1
	 * 
	 * @param str
	 * @param strArr
	 */
	public void ajaxPri(int str, String[] strArr) {
		if (null == strArr || strArr.length != 2) {
			strArr = new String[] { "success", "fail" };
		}
		String message = strArr[1];
		String code = "1004";
		if (str == 1) {
			message = strArr[0];
			code = "1000";
		}
		ajaxPri(code, message);
	}

	public void ajaxPri(String code, String message) {
		JSONObject obj = new JSONObject();
		obj.put("code", code);
		obj.put("message", message);
		ajaxPri(obj);
	}

	public void ajaxPri(Object object) {
		String crossdomain = params.get("crossdomain");
		if (object == null) {
			object = "";
		}
		try {
			if (null != crossdomain && "true".equalsIgnoreCase(crossdomain)) {
				// response.getWriter().write(getCallBack(object.toString()));
			} else {
				response.getWriter().write(object.toString());
			}
		} catch (IOException e) {
		}

	}

	public PrintWriter getOut(HttpServletResponse response, PrintWriter out) {
		response.setCharacterEncoding("utf-8");
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out;
	}

	/**
	 * ajaxPri具体实现
	 * 
	 * @param contentType
	 * @param obj
	 */
	private void ajaxPriMain(String contentType, Object obj) {
		response.setContentType(contentType);
		out = this.getOut(response, out);
		out.print(obj);
		out.close();
	}

	public String getPropertValue(String key) {
		return PropertiesUtils.getDomain(key);
	}

	/**
	 * 废弃的方法
	 * 
	 * @author Efun
	 * @date 2016-7-27 void
	 */
	@Deprecated
	public void getDataSourceList() {
		String type = request.getParameter("type");

		Map<DataSourceMap, String> maps = "r".equals(type) ? MAP_EXTEND_MASTER : MAP_CORE_MASTER;

		JSONArray array = new JSONArray();
		JSONObject object = null;

		for (Entry<DataSourceMap, String> en : maps.entrySet()) {
			object = new JSONObject();
			object.put("key", en.getKey());
			object.put("value", en.getValue());
			array.add(object);
		}
		ajaxPri(array);
	}

	/**
	 * 初始化参数到MAP-->params
	 */
	protected void initialize() {
		try {
			params = getParameters(request);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 将参数字符串转换为Map<paramKey,paramValue> eg.
	 * xxKey=xxValue&yyKey=yyValue&zzKey=zzValue -->
	 * Map{xxKey=xxValue,yyKey=yyValue,zzKey=zzValue}
	 *
	 * @param request
	 *            要转换的字符串
	 * @param bools
	 *            是否第一次读取参数(true 非第一读取参数返回现有paramMap , 空值或false 重新读取paramMap)
	 * @return Map
	 * @throws UnsupportedEncodingException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map<String, String> getParameters(HttpServletRequest request) throws UnsupportedEncodingException {

		// 参数Map
		Map<String, String[]> properties = request.getParameterMap();
		// 返回值Map
		Map<String, String> returnMap = new HashMap<String, String>();
		Iterator entries = properties.entrySet().iterator();
		Entry entry;
		String name = "";
		String value = null;
		while (entries.hasNext()) {
			entry = (Entry) entries.next();
			name = (String) entry.getKey();
			Object valueObj = entry.getValue();
			if (null == valueObj) {

			} else if (valueObj instanceof String[]) {
				String[] values = (String[]) valueObj;
				for (int i = 0; i < values.length; i++) {
					value = values[i] + ",";
				}
				value = value.substring(0, value.length() - 1);
			} else {
				value = valueObj.toString().trim();
			}
			returnMap.put(name, value);
		}
		return returnMap;
	}

	/**
	 * 获取Ip
	 * 
	 * @return
	 */
	public String getIpAddr() {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public Map<String, Object> getTYPES() {
		return TYPES;
	}

	/**
	 * 用于获取当前数据源
	 * 
	 * @author Efun
	 * @date 2016-7-27
	 * @return String
	 */
	public String getArea() {
		return AreaUtil.getArea();
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
