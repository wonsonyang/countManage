package com.efun.util;


import com.efun.pojo.Rate;
import com.efun.service.RateService;
import com.efun.service.impl.RateServiceImpl;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;

/**
 * 目前该汇率工具类只能用在初步校验优惠券使用金额
 * <h3>注意不可用于金流的汇率换算</h3>
 * 
 * @author biwu
 *
 */
public class GateRateUtils {
	private static final Logger logger = Logger.getLogger(GateRateUtils.class);
//	@Autowired
//	private RateService rateService;
	static WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
	static RateService rateService = (RateService) context.getBean("rateService");

	// 台币对美元汇率
	public static final float TWD_USD = 34f;

	// 韩币对美元汇率
	public static final float KRW_USD = 1150f;// 1097f;// 1020f;

	// 韩币对台币汇率
	public static final float KRW_TWD = 34.2812f;// 34f;
	// 台币对gash港币汇率
	public static final float TWD_GASH_HKD = 0.38f;
	/**
	 * 台币兑换美元
	 */
	public static Float twd2Usd(float twd) {
		return twd / 29.9f;
	}

	public static Float getGate(String originMoneyType, String toMoneyType, float money, int decimalNum,
			boolean isRound, String gameCode) {
		float reta = 34f;
		return toGate(originMoneyType, toMoneyType, money, decimalNum, isRound, reta);
	}

	public static Float getGate(String originMoneyType, String toMoneyType, float money, int decimalNum,
			boolean isRound) {
		return toGate(originMoneyType, toMoneyType, money, decimalNum, isRound, 29.9f);
	}

	public static Float getGate(String gameCode, String originCurrency, String exchangeCurrency, float money,
								int decimalNum, boolean isRound, String ip){

		//如果是白名单
		if (WhiteIPUtil.isWhiteIP(ip)){
			System.out.println("我在白名单");
			return toGate(gameCode, originCurrency, exchangeCurrency, money, decimalNum, isRound);
		}else{

			Rate rate = null;

			try {
				rate = rateService.getRateFromList(gameCode, originCurrency, exchangeCurrency);
			}catch (Exception e){
				logger.info(e.getMessage());
			}

			if (rate.getIsTest() == 1){
				//测试用户使用新方法
				return toGate(gameCode, originCurrency, exchangeCurrency, money, decimalNum, isRound);
			}else{
				//玩家使用老方法
				return toGate(originCurrency, exchangeCurrency, money,decimalNum, isRound, 29.9f);
			}

		}

	}
	/**
	 * 各币种汇率：(如有改动，请注明修改时间，保留原先的汇率，增加新汇率) 美元(USD)——>台币(TWD)===1:29.9
	 * 美元(USD)——>韩币(KRW)===1:(37.23*29.9) 美元(USD)——>港币(HKD、AAA)===1:(29.9/3.8)
	 * 美元(USD)——>马来西亚元(MYR)===1:(0.3051)
	 * 
	 * @param originMoneyType
	 *            原币种 (TWD,USD,KRW)
	 * @param toMoneyType
	 *            转换为的币种 (TWD,USD,KRW)
	 * @param money
	 *            金额
	 * @param decimalNum
	 *            保留小数位数 (其中 decimalNum 为-1 时 则对小数部分不进行处理)
	 * @param isRound
	 *            是否四舍五入
	 * @return
	 */
	public static Float toGate(String originMoneyType, String toMoneyType, float money, int decimalNum, boolean isRound,
			float twReta) {
		String finalMoney = money + "";
		if ("TWD".equalsIgnoreCase(toMoneyType)) {
			if ("USD".equalsIgnoreCase(originMoneyType)) { // 美元转台币
				finalMoney = money * twReta + "";
			} else if ("KRW".equalsIgnoreCase(originMoneyType)) { // 韩币转台币
				finalMoney = money / KRW_TWD + "";
			}
		} else if ("USD".equalsIgnoreCase(toMoneyType)) {
			if ("TWD".equalsIgnoreCase(originMoneyType)) { // 台币转美元
				finalMoney = money / twReta + "";
			} else if ("KRW".equalsIgnoreCase(originMoneyType)) { // 韩币转美元
				finalMoney = money / KRW_USD + "";
			}
		} else if ("KRW".equalsIgnoreCase(toMoneyType)) {
			if ("TWD".equalsIgnoreCase(originMoneyType)) { // 台币转韩币
				finalMoney = money * KRW_TWD + "";
			} else if ("USD".equalsIgnoreCase(originMoneyType)) { // 美元转韩币
				finalMoney = money * KRW_USD + "";
			}
		}else{
			return 0f;
		}
		return subDecimalNum(Float.valueOf(finalMoney), decimalNum, isRound);
	}

	/**
	 * @param gameCode 游戏
	 * @param originCurrency 原始币种
	 * @param exchangeCurrency 目标币种
	 * @param money 换算前的钱
	 * @param decimalNum 保留小数点位数(其中 decimalNum 为-1 时 则对小数部分不进行处理)
	 * @param isRound 是否四舍五入
	 * @return
	 */
	public static Float toGate(String gameCode, String originCurrency, String exchangeCurrency, float money, int decimalNum, boolean isRound){

		String finalMoney = money + "";
		Rate rate = null;

		try {
			rate = rateService.getRateFromList(gameCode, originCurrency, exchangeCurrency);
		}catch (Exception e){
			logger.info(e.getMessage());
		}
		System.out.println("toGate: "+rate.getRate());
		finalMoney = money * (rate.getRate()) +"";
		return subDecimalNum(Float.valueOf(finalMoney), decimalNum, isRound);
	}

	/**
	 * 币种类型
	 */
	public enum gateType {
		/**
		 * 台湾币
		 */
		TWD,
		/**
		 * 美金
		 */
		USD,
		/**
		 * 韩币
		 */
		KRW,
		/**
		 * 港币
		 */
		AAA,
		/**
		 * 港币
		 */
		HKD,
		/**
		 * 马来币
		 */
		MYR,
		/**
		 * E点
		 */
		EEE,
		/**
		 * 泰铢
		 */
		THB, IDR, PHP, SGD
	}

	/**
	 * @param number
	 *            原数字字串
	 * @param decimalNum
	 *            保留小数位数
	 * @param isRound
	 *            是否四舍五入
	 * @return
	 */
	public static Float subDecimalNum(float number, int decimalNum, boolean isRound) {
		return Float.valueOf(subDecimalNumToString(number, decimalNum, isRound));
	}

	/**
	 * 
	 * @param number
	 *            原数字字串
	 * @param decimalNum
	 *            保留小数位数
	 * @param isRound
	 *            是否四舍五入
	 * @return
	 */
	public static String subDecimalNumToString(float number, int decimalNum, boolean isRound) {
		if (decimalNum >= 0 && isRound) {
			BigDecimal bigMoney = new BigDecimal(number);
			bigMoney = bigMoney.setScale(decimalNum, BigDecimal.ROUND_HALF_UP);
			return bigMoney.toString();
		} else if (!isRound) {
			String num = number + "";
			if (num.indexOf(".") != -1) {
				String[] m = num.split("\\.");
				String dec = m[1];
				for (int i = 0; i < decimalNum; i++) {
					dec += "0";
				}
				num = m[0] + "." + dec.substring(0, decimalNum);
			} else {
				num = num + ".";
				for (int i = 0; i < decimalNum; i++) {
					num += "0";
				}
			}
			if (decimalNum == 0 && num.indexOf(".") != -1) {
				num = num.substring(0, num.length() - 1);
			}
			return num;
		}
		return number + "";
	}
}
