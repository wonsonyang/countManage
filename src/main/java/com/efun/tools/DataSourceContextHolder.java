package com.efun.tools;

import org.apache.log4j.Logger;

public class DataSourceContextHolder {

	private static final Logger logger = Logger.getLogger(DataSourceContextHolder.class);

	private static final InheritableThreadLocal<DataSourceMap> contextHolder = new InheritableThreadLocal<DataSourceMap>();

	// 默认数据源
	public static DataSourceMap DEFAULT_DATASOURCE;

	public static void setCustomerType(DataSourceMap customerType) {
		if (customerType != null) {
			contextHolder.set(customerType);
		} else {
			logger.error("************** customerType is null **************");
		}
	}

	public static DataSourceMap getCustomerType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}

	/**
	 * 转换基础库数据源，返回原数据源，以便后续重置
	 * 
	 * @return
	 */
	public static DataSourceMap setBaseDataSource(boolean needMain) {
		DataSourceMap old = getCustomerType();
		setCustomerType(DataSourceMap.getBaseDataSource(old, needMain));
		return old;
	}

	/**
	 * 转换拓展库数据源，返回原数据源，以便后续重置
	 * 
	 * @return
	 */
	public static DataSourceMap setExtendDataSource(boolean needMain) {
		DataSourceMap old = getCustomerType();
		setCustomerType(DataSourceMap.getExtendDataSource(old, needMain));
		return old;
	}

}
