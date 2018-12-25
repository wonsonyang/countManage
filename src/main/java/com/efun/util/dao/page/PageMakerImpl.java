package com.efun.util.dao.page;

import org.hibernate.SessionFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 实现分页查询功能
 * 
 * @author 甘谊勇
 *
 */
public class PageMakerImpl implements PageMaker {

	private PageDao pageDao;

	private final String PAGE_OFFSET = "pager.offset";

	private final String PAGE_SIZE = "pagesize";

	public PageMakerImpl() {
		pageDao = new PageDaoImpl();
	}

	public Page<?> findPageMaker(PagePojo pojo, HttpServletRequest request) {

		int offset = getOffset(request);
		int psize = getPagesize(request);

		pojo.setOffset(offset);
		pojo.setPageSize(psize);

		callBackParams(request);
		request.setAttribute("pagesize", psize);
		return pageDao.getPageList(pojo);
	}

	/**
	 * 回写参数
	 * 
	 * @param request
	 */
	private void callBackParams(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();

		Enumeration<?> nameLists = request.getParameterNames();
		while (nameLists.hasMoreElements()) {

			String name = nameLists.nextElement().toString();
			if (PAGE_OFFSET.equals(name)) {
				continue;
			}

			String value = request.getParameter(name);
			if (value != null && !"".equals(value)) {
				params.put(name, value);
			}
		}

		request.setAttribute("params", params);
	}

	private int getOffset(HttpServletRequest request) {
		int fromIndex = 0;
		String offset = request.getParameter(PAGE_OFFSET);
		if (offset != null && !"".equals(offset)) {
			fromIndex = Integer.parseInt(offset);
		} else {
			fromIndex = 0;
		}

		return fromIndex;
	}

	private int getPagesize(HttpServletRequest request) {
		int pagesize = 0;
		String psize = request.getParameter(PAGE_SIZE);
		if (psize != null && !"".equals(psize)) {
			pagesize = Integer.parseInt(psize);
		} else {
			pagesize = 15;
		}
		return pagesize;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		pageDao.setSessionFactory(sessionFactory);
	}

}
