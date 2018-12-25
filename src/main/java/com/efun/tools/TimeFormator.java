package com.efun.tools;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间操作器
 * 
 * @author Alien
 * 
 */
public class TimeFormator {

	// dat格式为："1900-02-21 12:23:33";
	public static Date fromStrToDate(String dat, String format) {
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = dateformat.parse(dat);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	// dat格式为："1900-02-21 12:23:33";
	public static String fromDateToStr(Date date, String format) {
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		return dateformat.format(date);
	}

	public static int getMonth() {
		return getTheMonthToday();
	}

	public static int getYear() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}

	/**
	 * 获取今天时间
	 * 
	 * @param format
	 *            指定格式
	 * @return
	 */
	public static String getToday(String format) {
		String str = "";
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		str = dateformat.format(new Date());
		return str;
	}

	/**
	 * 获取现在时间 格式： yy-mm-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getNow() {
		String str = "";
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateformat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		str = dateformat.format(c.getTime());
		return str;
	}

	/**
	 * 获取现在时间 格式： yy-mm-dd HH:mm:ss
	 * 
	 * @return TIMESTAMP
	 */
	public static Timestamp getNowTimestamp() {
		String str = "";
		SimpleDateFormat dateformat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		str = dateformat.format(new Date());
		return fromStringToTimestamp(str);
	}

	/**
	 * String 转化为 timestamp
	 * 
	 * @param time
	 * @return
	 */
	private static Timestamp fromStringToTimestamp(String time) {
		Timestamp ts = Timestamp.valueOf(time);
		return ts;
	}

	/**
	 * 获取间隔今天N天的日期 负数为过去
	 * 
	 * @param n
	 * @return
	 */
	public static String getTheDay(int n) {
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		long day = 0;
		long temp = 0;
		String days = "";
		try {
			Date date = new Date();
			day = date.getTime();
			temp = 24 * 60 * 60 * 1000 * (n);
			days = myFormatter.format(day + temp);
		} catch (Exception e) {
			return "";
		}
		return days;
	}

	/**
	 * 获取当前月
	 * 
	 * @return
	 */
	private static int getTheMonthToday() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.MONTH) + 1;
	}

	/**
	 * 
	 * 根据指定的日期增加指定的月份
	 * 
	 * @param sdate
	 * @return
	 */
	public static String addMonth(String date, int amount) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(date));
			c.add(Calendar.MONTH, amount);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return format.format(c.getTime());
	}

	/**
	 * 對傳進來的時間進行小時數的加減
	 * @time 2014-01-14 15:18
	 * @param date
	 *            需要進行加減操作的時間
	 * @param length
	 *            要加減時間的數量，小時減操作的例子：addAndSubtractDate(date, -1, 2)
	 * @param timeType
	 *            要加減的時間類型，0：秒， 1：分鐘， 2：小時， 3：天， 4：周， 5：月， 6：年
	 * @return Date類型
	 */
	public static Date addAndSubtractDate(Date date, int length, int timeType) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			switch (timeType) {
			case 0:
				// 在当前时间上加/减length秒
				calendar.add(Calendar.SECOND, length);
				break;
			case 1:
				// 在当前时间上加/减length分鐘
				calendar.add(Calendar.MINUTE, length);
				break;
			case 2:
				// 在当前时间上加/减length小时
				calendar.add(Calendar.HOUR_OF_DAY, length);
				break;
			case 3:
				// 在当前时间上加/减length天
				calendar.add(Calendar.DAY_OF_WEEK, length);
				break;
			case 4:
				// 在当前时间上加/减length周
				calendar.add(Calendar.WEEK_OF_MONTH, length);
				break;
			case 5:
				// 在当前时间上加/减length月
				calendar.add(Calendar.MONTH, length);
				break;
			case 6:
				// 在当前时间上加/减length年
				calendar.add(Calendar.YEAR, length);
				break;
			default:
				break;
			}

			date = calendar.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获取当前时间(用于数据库时间类型)
	 * 
	 * @return
	 */
	public static Timestamp getTimestampNow() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * 将日期转换为字符格式,转换为字符后的格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String fromDateToStr(Date date) {
		String format = "yyyy-MM-dd HH:mm:ss";
		return fromDateToStr(date, format);
	}

}
