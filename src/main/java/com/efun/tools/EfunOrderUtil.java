package com.efun.tools;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.util.Random;

/**
 * 
*    
* 类名称：EfunOrderUtil   <br>
* 类描述：Efun订单生成工具类   <br>
* 创建人：lengchengzhen  <br>
* 创建时间：2015-3-9 上午10:34:07  <br> 
* 修改人：lengchengzhen   <br>
* 修改时间：2015-3-9 上午10:34:07   <br>
* 修改备注：   <br>
* @version    
*
 */
public class EfunOrderUtil {

	private static final Logger logger = Logger.getLogger(EfunOrderUtil.class);
	private static final String KEY="efun";	
	private static final String BASE_TIME;
	private static final String PREFIX_RANDOM;
	private static final String[] BASE_CHARS = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };
	private static final String[] LETTER = new String[] { "A", "B", "C", "D",
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	static {
		long tempTime = System.nanoTime();
		int baseLength = 0;
		if (tempTime <= 0L) {
			tempTime = System.currentTimeMillis();
			baseLength = 9;
		} else {
			baseLength = 10;
		}
		BASE_TIME = loadSerialNo(TentoN(tempTime, 36), baseLength);
		int max = ((int) Math.pow(36, 13 - baseLength)) - 1;
		int random = new Random().nextInt(max) + 1;
		if (random <= ((int) Math.pow(36, 12 - baseLength)) - 1) {
			random += ((int) Math.pow(36, 12 - baseLength)) - 1;
		}
		PREFIX_RANDOM = loadSerialNo(TentoN(random, 36), 13 - baseLength);

		logger.info("Sequence base time:" + BASE_TIME + " length:" + baseLength);
		logger.info("Sequence random:" + PREFIX_RANDOM + " length:"
				+ (13 - baseLength));
	}

	/**
	 * 生成efun order id gameCode + currentTime + userId 長度最長20
	 * 
	 * @return  efun订单号
	 */
	public static String generateOrderId(String gameCode, String userId) {
		logger.info("CommonUtilsuuuugenerateOrderId::gameCode:" + gameCode
				+ "::userId::" + userId);
		String reg = "[0-9]*";
		if (StringUtils.isEmpty(userId) || !userId.matches(reg)) {
			userId = RandomUtils.nextInt(10000) + "";
		}
		String orderid = gameCode.toUpperCase().replace("_", "")
				+ (System.currentTimeMillis() + Long.valueOf(userId));
		for (int j = 0; j < 5; j++) {
			orderid = orderid + LETTER[RandomUtils.nextInt(26)];
		}
		if (orderid.length() >= 20) {
			orderid = orderid.substring(0, 19);
		}
		orderid = orderid + LETTER[RandomUtils.nextInt(26)];
		return orderid;
	}
	
	
	/**
	 * 交易id生成规则 yyyyMMddHHmmss+时间戳后3位+干扰数字2位+时间戳(3位)+随机数4位+验证码4位(去掉扰码后的数字加密取后四位而来)
	 * @return
	 */
	public static String generateTransactionId(){
		String timemillis=System.currentTimeMillis()+"";
		String timestampend=timemillis.substring(timemillis.length()-3);//三位时间戳
		
		int randomNum=RandomUtils.nextInt(8999)+1000;//4位随机数字
		
		String transactionIdTemep= TimeFormator.getToday("yyyyMMddHHmmss")+""+timestampend+""+randomNum;
		
		String sign=Md5.toMd5(transactionIdTemep+KEY);
		
		int disturbNum=RandomUtils.nextInt(89)+10;
		
		String transactionIdTemep2= TimeFormator.getToday("yyyyMMddHHmmss")+disturbNum+""+timestampend+""+randomNum;
		String transactionId=(transactionIdTemep2+sign.substring(0, 4)).toUpperCase();
		return transactionId;
	}

	/**
	 * 2-36进制转换
	 * 
	 * @param value
	 * @param number
	 * @return
	 */
	private static StringBuilder TentoN(StringBuilder strBuilder, long value,
			int number) {
		if (number <= 1 || number > BASE_CHARS.length) {
			throw new RuntimeException("Failed");
		}
		if (strBuilder == null) {
			strBuilder = new StringBuilder();
		}
		// 负数处理
		if (value < 0) {
			TentoN(strBuilder, 0 - value, number);
			return strBuilder.insert(0, "-");
		}
		if (value < number) {
			return strBuilder.insert(0, BASE_CHARS[(int) value]);
		} else {
			long n = value % (long) number;
			strBuilder.insert(0, BASE_CHARS[(int) n]);
			return TentoN(strBuilder, value / number, number);
		}
	}

	/**
	 * 2-36进制转换
	 * 
	 * @param value
	 * @param number
	 * @return
	 */
	private static String TentoN(long value, int number) {
		// 负数处理
		if (value < 0) {
			StringBuilder strBuilder = new StringBuilder();
			TentoN(strBuilder, 0 - value, number);
			return strBuilder.insert(0, "-").toString();
		} else {
			return TentoN(new StringBuilder(), value, number).toString();
		}
	}

	/**
	 * 加载固定位数的字符串
	 * 
	 * @param base
	 * @param fixed
	 * @return
	 */
	private static final String loadSerialNo(String base, int fixed) {
		return loadSerialNo(new StringBuilder(base), fixed).toString();
	}

	/**
	 * 加载固定位数的字符串
	 * 
	 * @param base
	 * @param fixed
	 * @return
	 */
	private static final StringBuilder loadSerialNo(StringBuilder strBuilder,
			int fixed) {
		if (strBuilder == null) {
			strBuilder = new StringBuilder();
		}
		while (strBuilder.length() < fixed) {
			strBuilder.insert(0, "0");
		}
		while (strBuilder.length() > fixed) {
			strBuilder.deleteCharAt(0);
		}
		return strBuilder;
	}

}
