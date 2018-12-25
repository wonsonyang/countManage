package com.efun.service.impl;

import com.efun.dao.RateDao;

import com.efun.pojo.Rate;
import com.efun.service.RateService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service("rateService")
public class RateServiceImpl implements RateService {

    private static final Logger logger = Logger.getLogger(RateServiceImpl.class);
    public static String PREFIX = "GET-BY-"; //获取redis中的汇率的key的前缀

    @Autowired
    private RateDao rateDao;


    @Override
    public float getRate(String gameCode, String originCurrency, String exchangeCurrency, Integer isTest) throws Exception {

        String key = PREFIX + '-' + gameCode + '-' + exchangeCurrency + '-' + originCurrency;
        //String result = RedisUtil.get(PREFIX);
        float rate = 0;

       // if (result == null) {
            String sql = "select rate from t_rate where gameCode = ? and " +
                    "exchangeCurrency = ? and originCurrency = ? and isTest = ?";
            Object[] params = {gameCode, exchangeCurrency, originCurrency, isTest};
            rate = rateDao.getRate(sql, params);
            if (rate <= 0) {
                logger.info("the rate is null or minus···");
                throw new Exception("the rate is null or minus···");
            }
           // RedisUtil.set(PREFIX, String.valueOf(rate));

        return rate;
    }

    @Override
    public int getIsTest(String gameCode, String originCurrency, String exchangeCurrency) throws Exception {

       String key = PREFIX + '-' +gameCode + '-' + exchangeCurrency + '-' + originCurrency;
       int isTest = 0;
       String sql = "select isTest from t_rate where gameCode = ? and  exchangeCurrency = ?" +
               "and originCurrency = ? and isTest = 1";
       Object[] params = {gameCode, exchangeCurrency, originCurrency};

       isTest = rateDao.getIsTest(sql, params);
       if (isTest < 0){
           throw new Exception("no record can match the sql -->" + sql);
       }

        return isTest;
    }

    @Override
    public Rate getRateFromList(String gameCode, String originCurrency, String exchangeCurrency) throws Exception {

        String sql = "select * from t_rate where gameCode = ? and " +
                "exchangeCurrency = ? and originCurrency = ? ";
        Object[] params = {gameCode, exchangeCurrency, originCurrency};
        List<Rate> list = new ArrayList<Rate>();

        list = rateDao.getRateBysql(sql,params);

        if (list == null){
            throw new Exception("no record can match the sql -->" + sql);
        }

        for (int i = 0;i<list.size();i++) {
            if (list.get(i).getIsTest() == 1) {
                return list.get(i);
            }
        }

        return list.get(0);
    }


}
