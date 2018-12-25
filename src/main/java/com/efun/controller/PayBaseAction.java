package com.efun.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author tink
 * 
 * @param
 */
@Component
public class PayBaseAction {
	// private Logger logger = Logger.getLogger(BaseAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 7103780933257477843L;
	public HttpServletRequest request;
	public HttpServletResponse response;

    @Autowired
	public ServletContext context;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
    }

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletContext(ServletContext context) {
		this.context = context;
	}

	public String getCallBack(String result) {
		return getCallBack(request, result);
	}

	public final static String getCallBack(HttpServletRequest request, String result) {
		String callback = request.getParameter("jsoncallback");
		return new StringBuilder(100).append(callback).append("([").append(result).append("])").toString();
	}

	//public final static String getIpAddr(HttpServletRequest request) {
		//return IpUtil.getIpAddrByRequest(request);
	//}

	//public String getIpAddr() {
		//return getIpAddr(request);
	//}

	/**
	 * <p>json or jsonp格式字符串</p>
	 * 
	 * <p>当参数中包含crossdomin=true 
	 * 		返回值会根据jsoncallback包装jsonp格式数据</p>
	 * @param request
	 * @param result
	 * @return
	 */
	public String getCallBack(HttpServletRequest request, JSONObject result) {
		String crossdomin = request.getParameter("crossdomain");
		String callback = request.getParameter("jsoncallback");
		if(crossdomin==null || "false".equals("crossdomain")){
			return result.toJSONString();
		}else{
			return new StringBuilder(100).append(callback).append("([").append(result.toJSONString()).append("])").toString();
		}
	}
	
	/**
	 * 将数据包装为json
	 * 
	 * @param code
	 *            状态码
	 * @param message消息
	 * @return
	 */
	public JSONObject putdataToJson(String code, String message) {
		JSONObject object = new JSONObject();
		object.put("code", code);
		object.put("message", message);
		return object;
	}
}
