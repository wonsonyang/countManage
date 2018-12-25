package com.efun.util.service;

import com.efun.util.dao.BaseDao;
import com.efun.util.dao.page.Page;
import org.hibernate.jdbc.ReturningWork;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 
 * 通用的一些业务类，（包括：查询，保存，修改，删除）
 * 
 * @date 2014-02-15
 * @author GanYiYong
 *
 */
public interface UniversallyService {

	/**
	 * 获取List<Map<String,Object>>格式的分页数据
	 */
	Page<Map<String, Object>> getMapListPage(String sql, HttpServletRequest request);

	/**
	 * 分页查询
	 * 
	 * @param hql
	 * @param request
	 */
	public void findByHql(String hql, HttpServletRequest request);

	/**
	 * 分页查询
	 * 
	 * @param sql
	 * @param request
	 */
	public void findBySql(String sql, HttpServletRequest request);

	/**
	 * 多实体查询
	 * 
	 * @param sql
	 * @param request
	 * @param map
	 */
	public void findBySql(String sql, HttpServletRequest request, Map<String, Class<?>> map);

	/**
	 * 分页查询
	 * 
	 * @param sql
	 */
	public void findBySql(String sql, HttpServletRequest request, Class<?> clz);

	/**
	 * 數據查詢,返回List<Map<String,Obect>>
	 * 
	 * @param sql
	 * @return
	 */
	public List<Map<String, Object>> queryMapList(String sql, Object[] params);

	/**
	 * 根据HQL语句获取列表
	 * 
	 * @param hql
	 * @return
	 */
	public <T> List<T> getList(String hql);

	/**
	 * 根据HQL语句获取列表
	 */
	public <T> List<T> getListByHqlLimit(String hql, int firstResult, int maxResults);

	/**
	 * 保存数据
	 * 
	 * @param obj
	 * @return
	 */
	public int save(Object obj);

	/**
	 * 批量保存
	 * 
	 * @param <T>
	 * @param list
	 * @return
	 */
	public <T> int saveAll(Collection<T> list);

	/**
	 * 根据ID查询数据
	 * 
	 * @param id
	 * @param clz
	 * @param <T>
	 * @return
	 */
	public <T> T getEntityById(int id, Class<T> clz);

	/**
	 * 根据ID查询数据
	 * 
	 * @param id
	 * @param clz
	 * @param <T>
	 * @return
	 */
	public <T> T getEntityById(long id, Class<T> clz);

	/**
	 * 根据ID查询数据
	 * 
	 * @param id
	 * @param clz
	 * @param <T>
	 * @return
	 */
	public <T> T getEntityById(String id, Class<T> clz);

	/**
	 * 执行HQL语句
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public int executeHql(String hql, Object... params);

	/**
	 * 执行SQL语句
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeSql(String sql, Object... params);

	/**
	 * 根据HQL查询语句获取唯一的数据
	 * 
	 * @param <T>
	 * @param hql
	 * @param clz
	 * @return
	 */
	public <T> T getUniqueResult(String hql, Class<T> clz);

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
	 * 批量查询
	 * 
	 * @param sql
	 *            预编译SQL语句
	 * @param objs
	 *            预编译参数
	 * @author lujiang
	 * @date 2015年4月14日11:20:08
	 * @return List
	 */
	public <T> List<T> getBySql(String sql, Object... objs);

	public BaseDao getDynamicDao();

	/**
	 * 执行
	 *
	 * @param work
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Object execute(ReturningWork work);

}
