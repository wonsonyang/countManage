package com.efun.util.dao;


import com.efun.tools.DataSourceContextHolder;
import com.efun.tools.DataSourceMap;
import com.efun.tools.StringUtil;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DataSourceTransformInvocation implements InvocationHandler {

	private Object dao;

	private DataSourceMap newDB;

	private String alias;

	private HibernateTransactionManager transactionManager;

	public DataSourceTransformInvocation(String alias, String area, Object dao,
                                         HibernateTransactionManager transactionManager) {
		if (StringUtil.isNotEmpty(alias)) {
			this.alias = alias;
		} else {
			this.alias = "noname";
		}

		this.dao = dao;
		this.newDB = get(area);
		this.transactionManager = transactionManager;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		DataSourceMap oldDB = DataSourceContextHolder.getCustomerType();
		boolean isTrans = false;

		if (oldDB == null) {
			oldDB = DataSourceMap.asia;
			DataSourceContextHolder.setCustomerType(oldDB);
		}

		if (newDB != null && newDB != oldDB) {
			DataSourceContextHolder.setCustomerType(newDB);
			isTrans = true;

			//LogUtils.info("******************* [" + alias + "] DB change: oldArea=" + oldDB.name() + ", newArea="
				//	+ newDB.name());
		}

		//LogUtils.info("******************* [" + alias + "] DB current: area="
			///	+ DataSourceContextHolder.getCustomerType().name());

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
		TransactionStatus status = transactionManager.getTransaction(def);

		try {
			Object obj = method.invoke(dao, params);
			transactionManager.commit(status);
			return obj;
		} catch (Throwable e) {
//			LogUtils.info("******************* [" + alias + "] DB ERROR: area="
//					+ DataSourceContextHolder.getCustomerType().name());
//			e.printStackTrace();

			try {
				transactionManager.rollback(status);
			} catch (Exception e2) {
			}

			throw e;
		} finally {
			if (isTrans) {
//				LogUtils.info("******************* [" + alias + "] DB restore: area=" + oldDB.name());
//				DataSourceContextHolder.setCustomerType(oldDB);
			}
		}
	}

	private DataSourceMap get(String area) {
		if (StringUtil.isNotEmpty(area)) {
			for (DataSourceMap map : DataSourceMap.values()) {
				if (map.name().equals(area)) {
					return map;
				}
			}
			//LogUtils.info("******************* area is not definded in DataSourceMap" + area);
			throw new RuntimeException("area is not definded in DataSourceMap: " + area);
		}
		return null;
	}

}
