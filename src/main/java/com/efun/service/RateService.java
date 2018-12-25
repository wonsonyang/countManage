package com.efun.service;

import com.efun.pojo.Rate;

public interface RateService {

    /** 获取汇率
     * @param gameCode 游戏
     * @param originCurrency 原始币种
     * @param exchangeCurrency 目标币种
     * @return rate
     */
    float getRate(String gameCode, String originCurrency, String exchangeCurrency, Integer isTest) throws Exception;

    /** 获取isTest
     * @param gameCode
     * @param originCurrency
     * @param exchangeCurrency
     * @return
     * @throws Exception
     */
    int getIsTest(String gameCode, String originCurrency, String exchangeCurrency) throws Exception;

    /** 获取isTest and rate
     * @param gameCode
     * @param originCurrency
     * @param exchangeCurrency
     * @return
     * @throws Exception
     */
    Rate getRateFromList(String gameCode, String originCurrency, String exchangeCurrency) throws Exception;

}
