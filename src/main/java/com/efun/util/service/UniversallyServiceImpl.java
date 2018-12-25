package com.efun.util.service;

import com.efun.util.dao.BaseDao;
import com.efun.util.dao.page.Page;
import org.hibernate.jdbc.ReturningWork;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UniversallyServiceImpl implements UniversallyService {

	private BaseDao dynamicBaseDao;

	@Override
	public Page<Map<String, Object>> getMapListPage(String sql, HttpServletRequest request) {
		return dynamicBaseDao.getMapListPage(sql,request);
	}

	/**
	 * 分页查询
	 * 
	 * @param hql
	 */
	@Override
	public void findByHql(String hql, HttpServletRequest request) {
		dynamicBaseDao.findByHql(hql, request);
	}

	/**
	 * 分页查询
	 * 
	 * @param sql
	 */
	@Override
	public void findBySql(String sql, HttpServletRequest request) {
		dynamicBaseDao.findBySql(sql, request);
	}

	/**
	 * 分页查询
	 * 
	 * @param sql
	 */
	@Override
	public void findBySql(String sql, HttpServletRequest request, Map<String, Class<?>> map) {
		dynamicBaseDao.findBySql(sql, request, map);
	}

	/**
	 * 分页查询
	 * 
	 * @param sql
	 */
	@Override
	public void findBySql(String sql, HttpServletRequest request, Class<?> clz) {
		dynamicBaseDao.findBySql(sql, request, clz);
	}

	@Override
	public List<Map<String, Object>> queryMapList(String sql, Object[] params) {
		return dynamicBaseDao.queryMapList(sql, params);
	}

	@Override
	public <T> T getEntityById(int id, Class<T> clz) {
		return dynamicBaseDao.getById(clz, id);
	}

	@Override
	public <T> T getEntityById(String id, Class<T> clz) {
		return dynamicBaseDao.getById(clz, id);
	}

	@Override
	public <T> T getEntityById(long id, Class<T> clz) {
		return dynamicBaseDao.getById(clz, id);
	}

	@Override
	public <T> List<T> getList(String hql) {
		return dynamicBaseDao.getByHql(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getListByHqlLimit(String hql, int firstResult, int maxResults) {
		return dynamicBaseDao.getByHqlLimit(hql, firstResult, maxResults);
	}

	/**
	 * 批量查询
	 * 
	 * @param sql
	 *            预编译SQL语句
	 * @param objs
	 *            预编译参数
	 * @author lujiang
	 * @date 2015年4月14日11:31:18
	 * @return List
	 */
	@Override
	public <T> List<T> getBySql(String sql, Object... objs) {
		return dynamicBaseDao.getBySql(sql, objs);
	}

	@Override
	public int save(Object obj) {
		try {
			dynamicBaseDao.saveOrUpdate(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return 1;
	}

	@Override
	public <T> int saveAll(Collection<T> list) {
		try {
			dynamicBaseDao.saveAll(list);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return 1;
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String delval, String delkey,
			String table) {
		return dynamicBaseDao.updateDelFieldByHql(ids, key, delval, delkey, table);
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String table) {
		return dynamicBaseDao.updateDelFieldByHql(ids, key, table);
	}

	@Override
	public int executeHql(String hql, Object... params) {
		return dynamicBaseDao.executeHql(hql, params);
	}

	@Override
	public int executeSql(String sql, Object... params) {
		return dynamicBaseDao.executeSql(sql, params);
	}

	@Override
	public <T> T getUniqueResult(String hql, Class<T> clz) {
		return dynamicBaseDao.queryUniqueResult(hql, clz);
	}

	@SuppressWarnings("rawtypes")
	public Object execute(ReturningWork work) {
		return dynamicBaseDao.execute(work);
	}

	@Override
	public BaseDao getDynamicDao() {
		return getDynamicBaseDao();
	}

	public BaseDao getDynamicBaseDao() {
		return dynamicBaseDao;
	}

	public void setDynamicBaseDao(BaseDao dynamicBaseDao) {
		this.dynamicBaseDao = dynamicBaseDao;
	}

}
