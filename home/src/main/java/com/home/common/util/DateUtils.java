package com.home.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 时间工具类
 * @author wxt
 *
 */
public class DateUtils {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Logger.class);

	public final static String DATA_PATTERN = "yyyy-MM-dd";
	
	public final static String DATA_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 时间转换
	 * @param date
	 * @return
	 */
	public static String format(Date date){
		return format(date,DATA_PATTERN);
	}
	
	/**
	 * 日期转换
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date,String pattern){
		if (date!=null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.format(date);
		}
		return null;
	}
	
	/**
	 * 获取date到当前时间的间隔
	 * @return
	 */
	public static String getTimeBefore(Date date){
		Date now = new Date();
		long l = now.getTime()-date.getTime();
		int day = (int) (l/24*60*60*1000);
		int hour = (int) (l/(60*60*1000)-day*24);
		int min = (int) (l/(60*1000)-day*24*60-hour*60);
		String result = "";
		if (day>0) {
			result+="距离现在有"+day+"天";
		}
		return result;
	}
}
