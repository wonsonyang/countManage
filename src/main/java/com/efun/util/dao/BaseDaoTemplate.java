package com.efun.util.dao;

import com.efun.util.dao.page.Page;
import com.efun.util.dao.page.PageMaker;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BaseDaoTemplate implements BaseDao, InitializingBean {

	private BaseDao daoProxy;

	private String alias;

	private SessionFactory sessionFactory;

	private HibernateTransactionManager transactionManager;

	private PageMaker pageMaker;

	private String area;

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void setPageMaker(PageMaker pageMaker) {
		this.pageMaker = pageMaker;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		init();
	}

	protected void init() {
		BaseDaoBean dao = new BaseDaoBean();
		dao.setSessionFactory(sessionFactory);
		dao.setPageMaker(pageMaker);
		dao.setPageSessionFactory();

		daoProxy = (BaseDao) Proxy.newProxyInstance(SessionFactory.class.getClassLoader(),
				new Class[] { BaseDao.class },
				new DataSourceTransformInvocation(alias, area, dao, transactionManager));
	}

	@Override
	public void findByHql(String hql, HttpServletRequest request) {
		daoProxy.findByHql(hql, request);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request) {
		daoProxy.findBySql(sql, request);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request, Map<String, Class<?>> map) {
		daoProxy.findBySql(sql, request, map);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request, Class<?> claz) {
		daoProxy.findBySql(sql, request, claz);
	}

	@Override
	public List<Map<String, Object>> queryMapList(String sql, Object[] params) {
		return daoProxy.queryMapList(sql, params);
	}

	@Override
	public <T> T getById(Class<T> clas, Serializable id) {
		return daoProxy.getById(clas, id);
	}

	@Override
	public <T> List<T> getByHql(String hql) {
		return daoProxy.getByHql(hql);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getByHql(String hql, Object... params) {
		return daoProxy.getByHql(hql, params);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getByHqlLimit(String hql, int firstResult, int maxResults) {
		return daoProxy.getByHqlLimit(hql, firstResult, maxResults);
	}

	@Override
	public void update(Object obj) throws Exception {
		daoProxy.update(obj);
	}

	@Override
	public void save(Object obj) {
		daoProxy.save(obj);
	}

	@Override
	public void saveOrUpdate(Object obj) throws Exception {
		daoProxy.saveOrUpdate(obj);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void saveAll(Collection objs) throws Exception {
		daoProxy.saveAll(objs);
	}

	@Override
	public Object merge(Object obj) throws Exception {
		return daoProxy.merge(obj);
	}

	@Override
	public int executeSql(String sql, Object... params) {
		return daoProxy.executeSql(sql, params);
	}

	@Override
	public int executeHql(String hql, Object... params) {
		return daoProxy.executeHql(hql, params);
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String delval, String delkey,
			String table) {
		return daoProxy.updateDelFieldByHql(ids, key, delval, delkey, table);
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String table) {
		return daoProxy.updateDelFieldByHql(ids, key, table);
	}

	@Override
	public <T> T queryUniqueResult(String hql, Class<T> clz) {
		return daoProxy.queryUniqueResult(hql, clz);
	}

	@Override
	public <T> List<T> getBySql(String sql, Object... objs) {
		return daoProxy.getBySql(sql, objs);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object execute(ReturningWork work) {
		return daoProxy.execute(work);
	}

	@Override
	public Page<Map<String, Object>> getMapListPage(String sql, HttpServletRequest request) {
		return daoProxy.getMapListPage(sql,request);
	}

	@Override
	public Page<?> getEntityListPage(String sql, HttpServletRequest request, Class<?> entityClz) {
		return daoProxy.getEntityListPage(sql,request,entityClz);
	}

	@Override
	public Page<Object[]> getObjectListPage(String sql, HttpServletRequest request) {
		return daoProxy.getObjectListPage(sql,request);
	}

}
