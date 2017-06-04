package com.check.auth.g3.core.checkauth.utils.tools;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期转换工具类
 */
public class DateUtil {
	
	public static String DATE_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss"; // 年/月/日
	public static String DATE_FORMAT_DATE = "yyyy-MM-dd"; // 年/月/日

    /**
     * yyyy-MM-dd格式的日期格式化类
     */
    public static final SimpleDateFormat YMD = new SimpleDateFormat("yyyy-MM-dd");
    
    public static final String DATE_FORMAT_CHINESE = "yyyy年MM月dd日"; 
	
	/** 
	 * 根据日期获得星期 
	 * @param date 
	 * @return 
	 */ 
	public static Integer getWeekOfDate(Date date) { 
	  Calendar calendar = Calendar.getInstance(); 
	  calendar.setTime(date);
	  int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
	  if (week == 0) {
		  week = 7;
	  }
	  return week;
	}

    /**
     * 根据日期获得星期
     * @param date
     * @return
     */
    public static Integer getWeekOfDate(String date) {
        return getWeekOfDate(parse(date));
    }

	/**
	 * 返回当天日期加上或减去（-1）指定天数的日期
	 * 
	 * @param day
	 * @return
	 */
	public static Date getCurDateByDay(int day) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, day);
		return c.getTime();
	}
	
	/**
	 * 返回当天日期加上或减去（-1）指定天数的日期
	 * @return
	 */
	public static Date getCurWeekDateByDay() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //获取本周一的日期
		return c.getTime();
	}
	
	
	public static Date getCurMonthDateByDay(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1); //获取当月第一天
		return c.getTime();
	}

	
	
	/**
	 * 返回格式化后的日期
	 * 
	 * @param day
	 * @return
	 */
	public static String getFormatDateByDay(int day) {
		return longDate(getCurDateByDay(day));
	}
	
	/**
	 * 返回当月第一天
	 * @return
	 */
	public static String getCurrentMonthDateByDay() {
		return longDate(getCurMonthDateByDay());
	}

	/**
	 * 返回格式化后的日期
	 * @return
	 */
	public static String getCurrentWeekDayByDay() {
		return longDate(getCurWeekDateByDay());
	}
	/** YYYY-MM-DD */
	public static String longDate(Date date) {
		return FastDateFormat.getInstance("yyyy-MM-dd").format(date);
	}
	
	/**
	 * @param date
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String wholeDate(Date date) {
		return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(date);
	}


	/**
	 * @param dateString 格式：20060100,20051231,20060101 yyyy-MM-dd/yyyyMMdd/yyyyMM
	 * @return
	 */
	public static Date parse(String dateString) {
		try {
			if (dateString == null || dateString.length() == 0) {
				return null;
			} else if (dateString.length() <= 6) {
				return new SimpleDateFormat("yyyyMM").parse(dateString);
			} else if (dateString.indexOf("-") < 0) {
				return new SimpleDateFormat("yyyyMMdd").parse(dateString);
			} else if (dateString.length() == 7 && dateString.indexOf("-") > 0) {
				return new SimpleDateFormat("yyyy-MM").parse(dateString);

			} else {
				return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
     * @param minute
     * date 返回现在X分钟前的时间
     */
    public static Date parseLast15minute(int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MINUTE, minute);
        return cal.getTime();
    }

    /**
     * @param minute date 返回现在X分钟前的时间
     */
    public static Date parseLastminute(int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MINUTE, minute);
        return cal.getTime();
    }
    
    /**
     * 获取特定时间之后的N天
     * @param date
     * @param day
     * @return
     */
    public static Date getDateByDay(Date date, int day){
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	cal.add(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
    }
    /**
     * 格式化日期
     * @param date
     * @param pattern
     * @return
     */
    public static String formatDate(Date date,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
    

    /**
     * 解析日期
     * @param dateStr
     * @param parrern
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String dateStr,String parrern) throws ParseException{
        return DateUtils.parseDate(dateStr, new String[]{parrern});
    }
    
    /**
     * 解析日期
     * @param dateStr
     * @param parrerns
     * @return
     * @throws ParseException
     */
    public static Date parseDate(String dateStr,String[] parrerns) throws ParseException{
        return DateUtils.parseDate(dateStr, parrerns);
    }
    
    /**
     * 比较量日期日期差
     * @param sourcedate
     * @param subDate
     * @return
     */
    public static int diffDay(Date sourcedate,Date subDate){
        Calendar sourceCal = Calendar.getInstance();
        sourceCal.setTime(sourcedate);
        Calendar subCal = Calendar.getInstance();
        subCal.setTime(subDate);
        
        sourceCal.set(Calendar.HOUR_OF_DAY, 0);
        sourceCal.set(Calendar.MINUTE, 0);
        sourceCal.set(Calendar.SECOND, 0);
        sourceCal.set(Calendar.MILLISECOND, 0);
        
        subCal.set(Calendar.HOUR_OF_DAY, 0);
        subCal.set(Calendar.MINUTE, 0);
        subCal.set(Calendar.SECOND, 0);
        subCal.set(Calendar.MILLISECOND, 0);

        long diffTime = sourceCal.getTimeInMillis() - subCal.getTimeInMillis();
        long days = diffTime/(24*60*60*1000);
        return (int)days;
    }

    /**
     * 增加天数
     * @param date
     * @param offDays
     * @return
     */
    public static Date addDays(Date date, int offDays) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, offDays);
        return cal.getTime();
    }

    /**
     * 返回加上指定小时之后的时间
     * @param date
     * @param hour
     * @return
     */
    public static Date addHour(Date date ,int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hour);
        return calendar.getTime();
    }

    /**
     * 获取当月
     *
     * @return
     */
    public static Integer getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取当年度
     *
     * @return
     */
    public static Integer getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.YEAR);
    }

    /**
     * 通过指定格式 yyyy-mm-dd 的日期获取月份
     */
    public static Integer getMonthOfTheDate(String date) {
        if (date.indexOf("-") > 0 && date.lastIndexOf("-") > 0) {
            String month = date.substring(date.indexOf("-") + 1, date.lastIndexOf("-"));
            return Integer.valueOf(month);
        } else {
            return null;
        }
    }

    /**
     * 通过指定格式 yyyy-mm-dd 的日期获取周（注意：周一是一周的开始）
     */
    public static Integer getWeekOfTheDate(String date) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        try {
            c.setTime(YMD.parse(date));
            return c.get(Calendar.WEEK_OF_YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得传值所在的日期（yyyy-MM-dd 返回dd）
     * @param date
     * @return
     */
    public static Integer getDayOfDate(String date){
        if (date.indexOf("-") > 0 && date.lastIndexOf("-") > 0) {
            String day = date.substring(date.lastIndexOf("-")+1,date.length());
            return Integer.valueOf(day);
        } else {
            return null;
        }
    }

    /**
     * 获得日期所属星期
     * @param date
     * @return
     */
    public static String getWeekOfDay(Date date){
        final String dayNames[] = { "周日", "周一", "周二", "周三", "周四", "周五", "周六" };
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return dayNames[dayOfWeek - 1];
    }
    
    /**
     * 获取指定月份时间
     * @param date
     * @param month
     * @return
     */
    public static Date getAppointMonthByDate(Date date,int month){
    	Calendar c=Calendar.getInstance();
    	c.setTime(date);
    	c.add(Calendar.MONTH,month);
    	return c.getTime();
    }
    
    public static String getChinesDateString(Date date){
    	return new SimpleDateFormat(DATE_FORMAT_CHINESE).format(date);
    }
}
