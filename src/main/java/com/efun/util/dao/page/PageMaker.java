package com.efun.util.dao.page;

import org.hibernate.SessionFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页
 * 
 * @author 甘谊勇
 *
 *         此类为分页核心类，调用前需要声明一pagepojo对象，并赋需要的值； 接口为findPageMakerHql方法
 *         查询需要用到分页的DAO,则注入pagepojo对象，并对该对象赋予SQL等值即可
 *         request对象中指定查询的offset（分页查询开始位置） spage 为页数
 */
public interface PageMaker {

	public Page<?> findPageMaker(PagePojo pojo, HttpServletRequest request);

	public void setSessionFactory(SessionFactory sessionFactory);

}
