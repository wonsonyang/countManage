package com.efun.util.dao.page;

import org.hibernate.SessionFactory;

/**
 * 分页查询DAO
 * 
 * @author 甘谊勇
 *
 */
public interface PageDao {

	public Page<?> getPageList(PagePojo pojo);

	public void setSessionFactory(SessionFactory sessionFactory);

}
