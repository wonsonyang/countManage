package com.efun.util.dao.page;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page <T> {

    private final String PAGE_OFFSET = "pager.offset";

    private final String PAGE_SIZE = "pagesize";

    private Long total;

    private int pageSize;

    private int currPage;

    private List<T> list;

    public void initPage(HttpServletRequest request){
        this.setPageSize(request);
        this.setCurrentPage(request);
        this.callBackParams(request);
    }


    private void setPageSize(HttpServletRequest request){
        String psize = request.getParameter(PAGE_SIZE);
        if(StringUtils.isNotBlank(psize)) {
            pageSize = Integer.parseInt(psize);
        } else {
            pageSize = 15;
        }
    }

    public void setCurrentPage(HttpServletRequest request){
        String offset = request.getParameter(PAGE_OFFSET);
        if(StringUtils.isNotBlank(offset)) {
            currPage = Integer.parseInt(offset);
        } else {
            currPage = 0;
        }
    }

    /**
     * 回写参数
     */
    private void callBackParams(HttpServletRequest request) {
        Map<String, String> params = new HashMap<String, String>();

        Enumeration<?> nameLists = request.getParameterNames();
        while(nameLists.hasMoreElements()) {

            String name = nameLists.nextElement().toString();
            if(PAGE_OFFSET.equals(name)) {
                continue;
            }

            String value = request.getParameter(name);
            if(value!=null&&!"".equals(value)) {
                params.put(name, value);
            }
        }

        request.setAttribute("params", params);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

}

