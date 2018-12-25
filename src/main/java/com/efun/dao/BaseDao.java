package com.efun.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BaseDao {
	/**
	 * 查询单个对象
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @param params
	 *            参数数组
	 * @param classType
	 *            类
	 * @return 返回单个对象
	 * @throws SQLException
	 */
	public <T> T findOne(String sql, Object[] params, Class<T> classType) throws SQLException;

	/**
	 * 查询多个对象
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @param params
	 *            参数数组
	 * @param classType
	 *            类
	 * @return 返回对象组成的list
	 * @throws SQLException
	 */
	public <T> List<T> findList(String sql, Object[] params, Class<T> classType) throws SQLException;

	/**
	 * 保存和更新
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @param parmas
	 *            参数数组
	 * @return 返回更新成功的条数
	 */
	public long saveOrUpdate(String sql, Object[] parmas);

	/**
	 * 保存单个对象，并返回对象的主键值
	 * 
	 * @param obj
	 *            要保存的对象
	 * @param tableName
	 *            表名
	 * @param keyColumns
	 *            要返回的主键字段名
	 * @return 返回主键值
	 */
	public long updateLast(Object obj, String tableName, String keyColumns);

	/**
	 * 批量操作
	 */
	public int[] batchUpdate(String sql, List<Object[]> params);

	/**
	 * 查询
	 * 
	 * @param jdbcTemplate
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> find(String sql, Object[] obs) throws SQLException;
	
	public <T> T query(String sql, Object[] params, Class<T> classType);
}
