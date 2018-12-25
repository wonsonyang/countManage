package com.efun.util.dao;

import com.efun.util.dao.page.Page;
import com.efun.util.dao.page.PageMaker;
import com.efun.util.dao.page.PagePojo;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.servlet.http.HttpServletRequest;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.sql.*;
import java.util.*;

public class BaseDaoBean extends HibernateDaoSupport implements BaseDao {

	private PageMaker pageMaker;

	private final String DELETE_FILED = "deleted";

	private final String DELETE_VALUE = "1";

	@Override
	public Page<Map<String, Object>> getMapListPage(String sql, HttpServletRequest request) {
		Page<Map<String, Object>> page = new Page<Map<String, Object>>();
		page.initPage(request);
		String countSql = "select count(*) from (" + sql + ") t";
		sql += " limit ?,?";
		page.setTotal(this.getCount(countSql));
		page.setList(this.queryMapList(sql, new Object[] { page.getCurrPage(), page.getPageSize() }));
		return page;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Page<?> getEntityListPage(String sql, HttpServletRequest request, Class<?> entityClz) {
		Page<Map<String, Object>> page = this.getMapListPage(sql, request);
		page.setList(transferResult(page.getList(), entityClz));
		return page;
	}

	/**
	 * 将map中的值转换为Bean
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List transferResult(List<Map<String, Object>> list, Class<?> clz) {
		List entityList = new ArrayList<>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(clz);
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (Map<String, Object> map : list) {
				Object entity = clz.newInstance();
				entityList.add(entity);
				for (PropertyDescriptor property : propertyDescriptors) {
					String key = property.getName();
					if (!key.equals("class")) {
						property.getWriteMethod().invoke(entity, map.get(key));
					}
				}
			}
			return entityList;
		} catch (Exception e) {
			e.printStackTrace();
			return entityList;
		}
	}

	@Override
	public Page<Object[]> getObjectListPage(String sql, HttpServletRequest request) {
		Page<Object[]> page = new Page<Object[]>();
		page.initPage(request);
		String countSql = "select count(*) from (" + sql + ") t";
		sql += " limit ?,?";
		page.setTotal(this.getCount(countSql));
		page.setList(this.getBySql(sql, new Object[] { page.getCurrPage(), page.getPageSize() }));
		return page;
	}

	private Long getCount(String sql) {
		List<Object> countList = this.getBySql(sql);
		if (countList.size() > 0) {
			return Long.parseLong(countList.get(0).toString());
		} else {
			return 0L;
		}
	}

	@Override
	public void findByHql(String hql, HttpServletRequest request) {
		PagePojo pojo = new PagePojo();
		pojo.setSql(hql);
		pojo.setType("hql");
		Page<?> page = pageMaker.findPageMaker(pojo, request);

		request.setAttribute("page", page);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request) {
		PagePojo pojo = new PagePojo();
		pojo.setSql(sql);
		pojo.setType("sql");
		Page<?> page = pageMaker.findPageMaker(pojo, request);

		request.setAttribute("page", page);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request, Map<String, Class<?>> map) {
		PagePojo pojo = new PagePojo();
		pojo.setSql(sql);
		pojo.setType("sql");
		pojo.setEntityClassMap(map);
		Page<?> page = pageMaker.findPageMaker(pojo, request);

		request.setAttribute("page", page);
	}

	@Override
	public void findBySql(String sql, HttpServletRequest request, Class<?> claz) {
		PagePojo pojo = new PagePojo();
		pojo.setSql(sql);
		pojo.setType("sql");
		pojo.setEntityClass(claz);
		Page<?> page = pageMaker.findPageMaker(pojo, request);

		request.setAttribute("page", page);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> queryMapList(String sql, Object[] params) {
		return (List<Map<String, Object>>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException {
				return (List<Map<String, Object>>) session.doReturningWork(new ReturningWork<Object>() {
					public Object execute(Connection con) throws SQLException {
						PreparedStatement preStmt = null;
						ResultSet rs = null;
						List<Map<String, Object>> lists1 = new ArrayList<Map<String, Object>>();
						try {
							preStmt = con.prepareStatement(sql);
							if (null != params && params.length > 0) {
								for (int i = 0; i < params.length; i++) {
									preStmt.setObject(i + 1, params[i]);// 下标从1开始
								}
							}

							rs = preStmt.executeQuery();
							ResultSetMetaData rsmd = rs.getMetaData();
							int columnCount = rsmd.getColumnCount();
							while (rs.next()) {
								Map<String, Object> map = new HashMap<String, Object>();
								for (int i = 0; i < columnCount; i++) {
									String name = rsmd.getColumnLabel(i + 1);
									Object value = rs.getObject(name);
									map.put(name, value);
								}
								lists1.add(map);
							}
						} finally {
							if (rs != null) {
								try {
									rs.close();
								} catch (Exception e) {
								}
							}
							if (preStmt != null) {
								try {
									preStmt.close();
								} catch (Exception e) {
								}
							}
						}
						return lists1;
					}
				});
			}
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object getById(Class clas, Serializable id) {
		Object obj = getHibernateTemplate().get(clas, id);
		return obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getByHql(String hql) {
		try {
			return (List<T>) this.getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getByHql(String hql, Object... params) {
		return this.getHibernateTemplate().find(hql, params);
	}

	/**
	 * 保存
	 */
	@Override
	public void save(Object obj) {
		this.getHibernateTemplate().save(obj);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void saveAll(Collection objs) {
		for (Object obj : objs) {
			this.getHibernateTemplate().saveOrUpdate(obj);
		}
	}

	@Override
	public Object merge(Object obj) {
		return this.getHibernateTemplate().merge(obj);
	}

	@Override
	public void saveOrUpdate(Object obj) {
		try {
			this.getHibernateTemplate().saveOrUpdate(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int executeSql(String sql, Object... params) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Integer>() {
				public Integer doInHibernate(Session session) throws HibernateException {
					SQLQuery query = session.createSQLQuery(sql);

					if (params != null && params.length > 0) {
						for (int i = 0; i < params.length; i++) {
							query.setParameter(i, params[i]);
						}
					}

					return query.executeUpdate();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int executeHql(String hql, Object... params) {
		try {
			return getHibernateTemplate().execute(new HibernateCallback<Integer>() {
				public Integer doInHibernate(Session session) throws HibernateException {
					Query query = session.createQuery(hql);

					if (params != null && params.length > 0) {
						for (int i = 0; i < params.length; i++) {
							query.setParameter(i, params[i]);
						}
					}
					return query.executeUpdate();
				}
			});
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void update(Object obj) {
		this.getHibernateTemplate().update(obj);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getByHqlLimit(String hql, int firstResult, int maxResults) {
		return doGetByHqlLimit(hql, firstResult, maxResults);
	}

	private List<?> doGetByHqlLimit(final String hql, final int firstResult, final int maxResults,
			final Object... params) {
		return (List<?>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException {
				Query q = session.createQuery(hql).setFirstResult(firstResult).setMaxResults(maxResults);
				if (params != null) {
					int i = 0;
					for (Object param : params) {
						q.setParameter(i++, param);
					}
				}
				return q.list();
			}
		});
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String delval, String delkey, String table) {
		String sql = "Update from " + table + " t set t." + delkey + " = '" + delval + "' where t." + key + " in ("
				+ ids + ")";
		try {
			this.executeHql(sql);
		} catch (HibernateException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;
	}

	@Override
	public int updateDelFieldByHql(String ids, String key, String table) {
		String sql = "Update from " + table + " t set t." + DELETE_FILED + " = '" + DELETE_VALUE + "' where t." + key
				+ " in (" + ids + ")";
		try {
			this.executeHql(sql);
		} catch (HibernateException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T queryUniqueResult(String hql, Class<T> clz) {
		try {
			List<?> list = getHibernateTemplate().find(hql);

			if (list != null && list.size() > 0) {
				return (T) list.get(0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 批量查询
	 *
	 * @param sql
	 *            预编译SQL语句
	 * @param objs
	 *            预编译参数
	 * @return List
	 * @author lujiang
	 * @date 2015年4月14日11:31:42
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getBySql(String sql, Object... objs) {
		return (List<T>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException {
				SQLQuery query = session.createSQLQuery(sql);
				if (objs != null && objs.length > 0) {
					for (int i = 0; i < objs.length; i++) {
						query.setParameter(i, objs[i]);
					}
				}
				return query.list();
			}
		});
	}

	public PageMaker getPageMaker() {
		return pageMaker;
	}

	public void setPageMaker(PageMaker pageMaker) {
		this.pageMaker = pageMaker;
	}

	public void setPageSessionFactory() {
		this.pageMaker.setSessionFactory(getSessionFactory());
	}

	/**
	 * 执行
	 * 
	 * @param work
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object execute(ReturningWork work) {
		return this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@SuppressWarnings("unchecked")
			public Object doInHibernate(Session session) throws HibernateException {
				return session.doReturningWork(work);
			}

		});
	}

}
