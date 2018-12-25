package com.efun.util.du;

import com.efun.tools.DataSourceContextHolder;
import com.efun.tools.DataSourceMap;

/**
 * 
 * 獲取地區
 * 类名称：AreaUtil <br>
 * 类描述： <br>
 * 创建人：lengchengzhen <br>
 * 创建时间：2016-5-30 下午06:19:25 <br>
 * 修改人：lengchengzhen <br>
 * 修改时间：2016-5-30 下午06:19:25 <br>
 * 修改备注： <br>
 * 
 * @version
 * 
 */
public class AreaUtil {

	public static String getArea() {
		return DataSourceContextHolder.getCustomerType().name();
	}

	/**
	 * 获取基础库地址
	 * 
	 * @return
	 */
	public static String getBaseArea(String area, boolean needMain) {
		if(null != DataSourceMap.getDataSourceMap(area)){
			return DataSourceMap.getBaseDataSource(DataSourceMap.getDataSourceMap(area), needMain)
					.name();
		}
		return "";
	}

}
