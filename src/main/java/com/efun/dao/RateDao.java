package com.efun.dao;

import com.efun.pojo.Rate;

import java.util.List;

public interface RateDao {

    public float getRate(String sql, Object[] params);

    public Integer getIsTest(String sql, Object[] params);

    public List<Rate> getRateBysql(String sql, Object[] params);
}
