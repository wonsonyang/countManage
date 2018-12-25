package com.efun.util.dao;

import com.efun.util.dao.page.Page;
import org.hibernate.jdbc.ReturningWork;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 该类仅用于最常用的CRUD（查询，删除，添加，更新等基作）
 * 
 * @author GanYiYong
 *
 */
public interface BaseDao {

	/**
	 * 分页查询
	 * 
	 * @param hql
	 */
	public void findByHql(String hql, HttpServletRequest request);

	/**
	 * 分页查询
	 * 
	 * @param sql
	 */
	public void findBySql(String sql, HttpServletRequest request);

	public void findBySql(String sql, HttpServletRequest request, Map<String, Class<?>> map);

	public void findBySql(String sql, HttpServletRequest request, Class<?> claz);

	/**
	 * 数据查询,返回List<Map<String,Object>>
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> queryMapList(String sql, Object[] params);

	/**
	 * 根据实体ID加载实体
	 * 
	 * @param clas
	 * @param id
	 * @return
	 */
	public <T> T getById(Class<T> clas, Serializable id);

	/**
	 * 根据Hql查询,有参数尽量使用带参数的重载方法
	 * 
	 * @param hql
	 * @return
	 */
	public <T> List<T> getByHql(String hql);

	/**
	 * 根据Hql查询
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List getByHql(String hql, Object... params);

	/**
	 * 根据hql查询,从firstResult取最多maxResults条记录
	 */
	@SuppressWarnings("rawtypes")
	public List getByHqlLimit(String hql, int firstResult, int maxResults);

	/**
	 * 更新方法，对于有id且数据库无匹配的数据跑出异常
	 * 
	 * @param obj
	 * @return
	 */
	public void update(Object obj) throws Exception;

	/**
	 * 保存
	 * 
	 * @param obj
	 * @return
	 */
	public void save(Object obj);

	/**
	 * 保存或新增，对于有id且数据库无匹配的数据执行添加
	 * 
	 * @param obj
	 * @return
	 */
	public void saveOrUpdate(Object obj) throws Exception;

	/**
	 * 保存全部实体 saveOrUpdate
	 * 
	 * @param objs
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public void saveAll(Collection objs) throws Exception;

	/**
	 * merge操作，抛出异常
	 * 
	 * @param obj
	 * @throws Exception
	 */
	public Object merge(Object obj) throws Exception;

	/**
	 * 执行sql语句
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeSql(String sql, Object... params);

	/**
	 * 执行HQL语句
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public int executeHql(String hql, Object... params);

	/**
	 * 逻辑删除数据，使用HQL语句执行
	 * 
	 * @param ids
	 *            删除条件的值
	 * @param key
	 *            主键字段名
	 * @param delval
	 *            标识删除的值
	 * @param delkey
	 *            删除的字段名称
	 * @param table
	 *            表名
	 * @return
	 */
	public int updateDelFieldByHql(String ids, String key, String delval, String delkey, String table);

	/**
	 * 逻辑删除数据，使用HQL语句执行
	 * 
	 * @param ids
	 *            删除条件的值
	 * @param key
	 *            主键字段名
	 * @param table
	 *            表名
	 * @return
	 */
	public int updateDelFieldByHql(String ids, String key, String table);

	/**
	 * 根据查询语句获取唯一的数据
	 * 
	 * @param <T>
	 * @param hql
	 * @param clz
	 * @return
	 */
	public <T> T queryUniqueResult(String hql, Class<T> clz);

	/**
	 * 批量查询
	 * 
	 * @param sql
	 *            预编译SQL语句
	 * @param objs
	 *            预编译参数
	 * @author lujiang
	 * @date 2015年4月14日11:31:35
	 * @return List
	 */
	public <T> List<T> getBySql(String sql, Object... objs);

	/**
	 * 执行
	 *
	 * @param work
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Object execute(ReturningWork work);

	/**
	 * 获取List<Map<String,Object>>格式的分页数据
	 */
	Page<Map<String, Object>> getMapListPage(String sql, HttpServletRequest request);

	/**
	 * 使用Sql语句获取自动转换为对象的分页数据
	 */
	Page<?> getEntityListPage(String sql, HttpServletRequest request, Class<?> entityClz);

	/**
	 * 获取List<Object[]>元素结构的分页数据
	 */
	Page<Object[]> getObjectListPage(String sql, HttpServletRequest request);

}