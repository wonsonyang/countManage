package com.efun.dao.impl;

import com.efun.dao.RateDao;
import com.efun.pojo.Rate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("rateDao")
public class RateDaoImpl implements RateDao {

    private static final Logger logger = Logger.getLogger(RateDaoImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public float getRate(String sql, Object[] params) {

        float rate = 0;

        try {
           rate = jdbcTemplate.queryForObject(sql, params, Float.class);
        }catch (Exception e){
            logger.info("[RateDao]:"+e.getMessage());
            return -1.0f;
        }

        if (rate <= 0.0 ){
            logger.info("[RateDao]: the rate in db is minus or is null -->rate=" + rate);
            return -1.0f;
        }

        return rate;
    }

    @Override
    public Integer getIsTest(String sql, Object[] params) {

        int isTest = 0;

        try {
            isTest = jdbcTemplate.queryForObject(sql, params, Integer.class);
        }catch (Exception e){
            logger.info("[RateDao]:getIsTest-->"+e.getMessage());
            return -1;
        }

        return isTest;
    }

    @Override
    public List<Rate> getRateBysql(String sql, Object[] params) {

        List<Rate> list = new ArrayList<Rate>();
        Rate rate ;

        try {
            list = jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<Rate>(Rate.class));
           // System.out.println(list.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        return list;
    }


}
