package com.efun.util;

import org.apache.commons.lang3.StringUtils;

public class WhiteIPUtil {
	
	/**
	 * 系统配置白名单<br>
	 * 对应具体工程下的common.prop文件中的base.vpn.ip属性
	 * @param ip
	 * @return
	 */
	public static final  boolean isWhiteIP(String ip){
		String ipWhitelist = PropUtil.getBaseVpnIp();
		if(StringUtils.isNotEmpty(ipWhitelist)&&ipWhitelist.contains(ip)){
			return true;
		}
		return false;
	}
	
	/**
	 * 优惠券功能兑换白名单<br>
	 * 包含common.prop文件中的base.vpn.ip 以及其他额外IP 暂时先写在此处。后续优化<br>
	 * (58.229.185.4,58.229.185.5,58.229.185.68,203.69.109.107,203.69.109.17,203.69.109.18)
	 * 103.227.128.56 28vnp被停 使用56
	 * @param ip
	 * @return
	 */
	public static final boolean isWhiteIPForCoupon(String ip){
		if(isWhiteIP(ip) || "58.229.185.4,58.229.185.5,58.229.185.68,10.14.20.200,58.229.185.17,203.69.109.107,203.69.109.17,203.69.109.18,203.69.109.83,47.91.158.3,47.89.11.250,47.89.23.4,47.91.158.3,47.90.120.12,10.12.20.61,103.227.128.56".contains(ip)){
			return true;
		}
		return false;
	}
}
