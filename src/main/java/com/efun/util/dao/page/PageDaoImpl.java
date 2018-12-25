package com.efun.util.dao.page;

import com.efun.tools.KVEntity;
import com.efun.tools.KVEntityComparator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 分页查询DAO
 *
 * @author 甘谊勇
 */
public class PageDaoImpl extends HibernateDaoSupport implements PageDao {

	@SuppressWarnings("rawtypes")
	private Page page;

	private PagePojo pojo;

	private List<?> getWithPage() {

		List<?> list = null;

		final int fromIndex = pojo.getOffset();
		final int toIndex = pojo.getPageSize();
		final String type = pojo.getType();

		final String sql = pojo.getSql();

		list = (List<?>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session) throws HibernateException {
				Query query = null;
				SQLQuery sqlquery = null;
				if ("sql".equals(type)) {
					if (null != pojo.getEntityClass()) {
						sqlquery = session.createSQLQuery(sql).addEntity(pojo.getEntityClass());
					} else if (null != pojo.getEntityClassMap()) {
						sqlquery = session.createSQLQuery(sql);
						Map<String, Class<?>> map = pojo.getEntityClassMap();

						List<KVEntity> list2 = new ArrayList<KVEntity>();
						for (String key : map.keySet()) {
							int index = sql.indexOf(key + ".*");
							list2.add(new KVEntity(index, key));
						}

						// 通过KVEntity排序进行一次排序
						Collections.sort(list2, new KVEntityComparator(KVEntityComparator.ASC));

						for (KVEntity kvEntity : list2) {
							String mapkey = kvEntity.getValue() + "";
							Class<?> mapValue = map.get(mapkey);
							sqlquery.addEntity(mapkey, mapValue);
						}

					} else {
						sqlquery = session.createSQLQuery(sql);
					}
					query = sqlquery;
				} else {
					query = session.createQuery(sql);
				}

				if (pojo.getParams() != null) {
					Object[] params = pojo.getParams();

					for (int k = 0; k < params.length; k++) {
						query.setParameter(k, params[k]);
					}
				}

				return query.setFirstResult(fromIndex).setMaxResults(toIndex).list();
			}
		});

		return list;
	}

	/**
	 * 获取指定Hql语句查询结果条数
	 */
	private Long getTheMountSize() {

		List<?> list = null;

		String sql = pojo.getSql();
		String temp = sql.toLowerCase().trim();
		final String type = pojo.getType();

		if (temp.indexOf("union all") > 0) {
			sql = "select count(*) from ( " + sql + " ) t_union";
		} else if (temp.indexOf("select") == 0) {
			sql = "select count(*) " + sql.substring(temp.indexOf(" from ") + 1);
		} else {
			sql = "select count(*) " + sql;
		}

		try {
			final String innerSql = sql;
			list = (List<?>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {
				public Object doInHibernate(Session session) throws HibernateException {
					Query query = null;
					if ("sql".equals(type)) {
						query = session.createSQLQuery(innerSql);
					} else {
						query = session.createQuery(innerSql);
					}

					if (pojo.getParams() != null) {
						Object[] params = pojo.getParams();

						for (int k = 0; k < params.length; k++) {
							query.setParameter(k, params[k]);
						}
					}

					query.setReadOnly(true);
					return query.list();
				}
			});

			Integer size = list.size();
			if (size == 0) {
				return 0L;
			}

			if (size > 1) {
				return size.longValue();
			}

			return (Long) list.get(0);
		} catch (ClassCastException e) {
			return ((BigInteger) list.get(0)).longValue();
		} catch (Exception e) {
			e.printStackTrace();
			return ((BigInteger) list.get(0)).longValue();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Page getPageList(PagePojo pojo) {

		page = new Page();
		this.pojo = pojo;

		long total = getTheMountSize();

		List<?> list = getWithPage();

		page.setList(list);
		page.setTotal(total);
		page.setPageSize(pojo.getPageSize());

		return page;
	}

	@SuppressWarnings("rawtypes")
	public Page getPage() {
		return page;
	}

	@SuppressWarnings("rawtypes")
	public void setPage(Page page) {
		this.page = page;
	}

	public PagePojo getPojo() {
		return pojo;
	}

	public void setPojo(PagePojo pojo) {
		this.pojo = pojo;
	}

}
