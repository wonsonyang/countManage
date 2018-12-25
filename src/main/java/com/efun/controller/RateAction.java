package com.efun.controller;

import com.alibaba.fastjson.JSONObject;
import com.efun.service.RateService;
import com.efun.util.GateRateUtils;
import com.efun.util.WhiteIPUtil;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * 汇率
 */
@Controller
@Scope("prototype")
public class RateAction extends PayBaseAction {
    private static final Logger logger = Logger.getLogger(RateAction.class);
    @Autowired
    private RateService rateService;
    GateRateUtils gateRateUtils = new GateRateUtils();

    @RequestMapping("getRate")
    public Float getRate() throws Exception{
        System.out.println("进来第一个方法···");
        Map<String, Object> map = new HashMap<String, Object>();
        String gameCode = request.getParameter("gameCode");
        String originCurrency = request.getParameter("originCurrency");
        String exchangeCurrency = request.getParameter("exchangeCurrency");
        float rate = 0;
        JSONObject jsonObject = new JSONObject();
        if (StringUtils.isEmpty(gameCode) || StringUtils.isEmpty(originCurrency) || StringUtils.isEmpty(exchangeCurrency)){
            jsonObject.put("result","0001");
            jsonObject.put("message","params could not be null····");
            logger.info(jsonObject.toString());
        }
        if (StringUtils.isBlank(gameCode) || StringUtils.isBlank(originCurrency) || StringUtils.isBlank(exchangeCurrency)){
            jsonObject.put("result","0001");
            jsonObject.put("message","params could not be null····");
            logger.info(jsonObject.toString());
        }
        //rate = rateService.getRate(gameCode, originCurrency, exchangeCurrency);
        if (rate <0){
            logger.info("something error to get rate·····");
        }

        map.put("rate",String.valueOf(rate));
        System.out.println("map: "+map);
        return rate;

    }

    @RequestMapping("get")
    public void get(){

        System.out.println("进来了····");
        //float rate = GateRateUtils.getRate()
        //先是测试 白名单
        if (WhiteIPUtil.isWhiteIP("14.18.155.130")){
            System.out.println("white ip ");
        }else{
            System.out.println("no white ip");
        }
        float finalMoney = GateRateUtils.getGate("thds", "TWD","USD",0.1f,6,true,"14.18.155.130");
        System.out.println(finalMoney);
    }
}
