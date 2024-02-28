package cloud.huazai.tool.basic.data;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * DateUtils 日期时间工具类
 *
 * @author Di Wu
 * @since 2023-12-13
 */

@Slf4j
public class DateUtils implements Serializable {
	private static final long serialVersionUID = 6707548507863313734L;

	// 一月
	public static final int JANUARY = 1;

	// 十二月
	public static final int DECEMBER = 12;

	// 每个月第一天
	public static final int BEGIN_DAY_OF_MONTH = 1;

	// 每天开始的时钟
	public static final int BEGIN_HOUR_OF_DAY = 0;

	// 每小时开始的分钟
	public static final int BEGIN_MINUTE_OF_HOUR = 0;

	// 每分钟开始的秒钟
	public static final int BEGIN_SECOND_OF_MINUTE = 0;

	// 每秒开始的毫秒
	public static final int BEGIN_MILLISECOND_OF_SECOND = 0;

	// 第一周的最小天数
	public static final	int MINIMAL_DAYS_IN_FIRST_WEEK = 1;

	// 每天结束的时钟
	public static final int END_HOUR_OF_DAY = 23;

	// 每小时结束的分钟
	public static final int END_MINUTE_OF_HOUR = 59;

	// 每分钟结束的秒钟
	public static final int END_SECOND_OF_MINUTE = 59;

	// 每秒结束的毫秒
	public static final int END_MILLISECOND_OF_SECOND = 999;


	/**
	 * 获取当前时间
	 * @return Date 当前时间
	 */
	public Date nowDate() {
		return new Date();
	}

	/**
	 * 获取某一年的日期时间
	 *
	 * @param year 年
	 * @return 日期时间
	 */

	public Date getDate(int year) {
		return getDate(year, JANUARY);
	}

	/**
	 * 获取某年某月日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @return 日期时间
	 */
	public Date getDate(int year, int month) {
		return getDate(year, month, BEGIN_DAY_OF_MONTH);
	}

	/**
	 * 获取某年某天某日日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @return 日期时间
	 */
	public Date getDate(int year, int month, int day) {
		return getDate(year, month, day, BEGIN_HOUR_OF_DAY);
	}

	/**
	 * 获取某年某月某日某时日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @return 日期时间
	 */
	public Date getDate(int year, int month, int day, int hour) {
		return getDate(year, month, day, hour, BEGIN_MINUTE_OF_HOUR);
	}

	/**
	 * 获取某年某月某日某时某分日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @return 日期时间
	 */
	public Date getDate(int year, int month, int day, int hour, int minute) {
		return getDate(year, month, day, hour, minute, BEGIN_SECOND_OF_MINUTE);
	}


	/**
	 * 获取某年某月某日某时某分某秒日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @param second 秒
	 * @return 日期时间
	 */
	public Date getDate(int year, int month, int day, int hour, int minute, int second) {
		return getDate(year, month, day, hour, minute, second, BEGIN_MILLISECOND_OF_SECOND);
	}

	/**
	 * 获取某年某月某日某时某分某秒某毫秒日期时间
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @param second 秒
	 * @param millisecond 毫秒
	 * @return 日期时间
	 */
	public Date getDate(int year, int month, int day, int hour, int minute, int second, int millisecond) {
		Calendar calendar = getCalendar(year, month, day, hour, minute, second, millisecond);
		return calendar.getTime();
	}

	/**
	 * 获取日历的日期时间
	 *
	 * @param calendar 日历
	 * @return 日期时间
	 */
	public static Date getDate(Calendar calendar) {
		return calendar.getTime();
	}

	/**
	 * 获取当地日期的日期时间
	 *
	 * @param localDate 当地日期
	 * @return 日期时间
	 */
	public static Date getDate(LocalDate localDate){
		return Date.from(getLocalDateTime(localDate).atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * 获取当地日期时间的日期时间
	 *
	 * @param localDateTime 当地日期时间
	 * @return 日期时间
	 */
	public static Date getDate(LocalDateTime localDateTime) {
		return  Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	/**
	 * 获取当前日历
	 *
	 * @return 日历
	 */
	public static Calendar nowCalendar() {
		return getCalendar();
	}

	/**
	 * 获取某年的日历
	 *
	 * @param year 年
	 * @return 日历
	 */
	public static Calendar getCalendar(int year) {
		return getCalendar(year, JANUARY);
	}

	/**
	 * 获取某年某月的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month) {
		return getCalendar(year, month, BEGIN_DAY_OF_MONTH);
	}

	/**
	 * 获取某年某月某日的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month, int day) {
		return getCalendar(year, month, day, BEGIN_HOUR_OF_DAY);
	}

	/**
	 * 获取某年某月某日某时的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month, int day, int hour) {
		return getCalendar(year, month, day, hour, BEGIN_MINUTE_OF_HOUR);
	}

	/**
	 * 获取某年某月某日某时某分的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month, int day, int hour, int minute) {
		return getCalendar(year, month, day, hour, minute, BEGIN_SECOND_OF_MINUTE);
	}

	/**
	 * 获取某年某月某日某时某分某秒的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @param second 秒
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month, int day, int hour, int minute, int second) {
		return getCalendar(year, month, day, hour, minute, second, BEGIN_MILLISECOND_OF_SECOND);
	}

	/**
	 * 获取某年某月某日某时某分某秒某毫秒的日历
	 *
	 * @param year 年
	 * @param month 月
	 * @param day 日
	 * @param hour 时
	 * @param minute 分
	 * @param second 秒
	 * @param millisecond 毫秒
	 * @return 日历
	 */
	public static Calendar getCalendar(int year, int month, int day, int hour, int minute, int second, int millisecond) {

		Calendar calendar = getCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month > Calendar.JANUARY ? month - JANUARY : Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	/**
	 * 获取日期时间的日历
	 *
	 * @param date 日期时间
	 * @return 日历
	 */
	public static Calendar getCalendar(Date date) {
		Calendar calendar = getCalendar();
		calendar.setTime(date);
		return calendar;
	}


	public static Calendar getCalendarOfWeekOfYear( int year, int weekOfYear,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		Calendar calendar = getCalendar(year);
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
		}
		calendar.set(Calendar.WEEK_OF_YEAR, weekOfYear);
		return calendar;
	}
	public static Calendar getCalendarOfWeekOfMonth( int year, int month, int weekOfMonth,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {

		Calendar calendar = getCalendar(year,month);
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
		}
		calendar.set(Calendar.WEEK_OF_MONTH, weekOfMonth);
		return calendar;
	}

	public static String format(Date date, String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}

	public static String format(LocalDateTime localDateTime,String dateFormat) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
		return dateTimeFormatter.format(localDateTime);
	}

	public static String format(LocalDate localDate,String dateFormat) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);

		return dateTimeFormatter.format(localDate);
	}

	public static LocalDateTime parseLocalDateTime(String localDateTime, String dateFormat) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
		try {
			return LocalDateTime.parse(localDateTime, dateTimeFormatter);
		} catch (Exception e) {
			log.error("localDateTime {} with dateFormat {} unconformity", localDateTime, dateFormat);
			throw new RuntimeException(e);
		}
	}

	public static LocalDate parseLocalDate(String localDate, String dateFormat) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
		try {
			return LocalDate.parse(localDate, dateTimeFormatter);
		} catch (Exception e) {
			log.error("localDate {} with dateFormat {} unconformity", localDate, dateFormat);
			throw new RuntimeException(e);
		}
	}

	public static Date parse(String date, String dateFormat) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
			return simpleDateFormat.parse(date);
		} catch (Exception e) {
			log.error("date {} with dateFormat {} unconformity", date, dateFormat);
			throw new RuntimeException(e);
		}
	}


	// ---------------------------Year-------------------------------------

	// 获取年份
	public static int getThisYear() {
		return getYear(getCalendar());
	}

	public static int getYear(Date date) {
		Calendar calendar = getCalendar(date);
		return getYear(calendar);
	}

	public static int getYear(Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}

	// 获取年开始时间

	public static Date beginOfThisYear() {
		Calendar calendar = getCalendar();
		return beginOfYear(calendar);
	}

	public static Date beginOfYear(Date date) {
		Calendar calendar = getCalendar(date);
		calendar.setTime(date);
		return beginOfYear(calendar);
	}

	public static Date beginOfYear(Calendar calendar) {
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		return beginOfMonth(calendar);

	}


	public static Date beginOfYear(int year) {
		Calendar calendar = getCalendar(year);
		return beginOfYear(calendar);
	}


	// 获取年结算时间

	public static Date endOfThisYear() {
		Calendar calendar = getCalendar();
		return endOfYear(calendar);
	}

	public static Date endOfYear(Date date) {
		Calendar calendar = getCalendar(date);
		return endOfYear(calendar);
	}

	public static Date endOfYear(int year) {
		Calendar calendar = getCalendar(year);
		return endOfYear(calendar);
	}

	public static Date endOfYear(Calendar calendar) {

		int monthsOfYear = calendar.getActualMaximum(Calendar.MONTH);
		calendar.set(Calendar.MONTH, monthsOfYear);
		return endOfMonth(calendar);

	}


	// ---------------------------Month-------------------------------------


	public static int getThisMonth() {
		return getMonth(getCalendar());
	}

	public static int getMonth(Date date) {
		return getMonth(getCalendar(date));
	}


	public static int getMonth(Calendar calendar) {
		return calendar.get(Calendar.MONTH) + JANUARY;
	}


	public static Date beginOfThisMonth() {
		return beginOfMonth(getCalendar());

	}

	public static Date beginOfMonth(Date date) {
		return beginOfMonth(getCalendar(date));
	}

	public static Date beginOfMonth(int year, int month) {
		return beginOfMonth(getCalendar(year, month));
	}

	public static Date beginOfMonth(Calendar calendar) {
		calendar.set(Calendar.DAY_OF_MONTH, BEGIN_DAY_OF_MONTH);
		return beginOfDay(calendar);
	}


	public static Date endOfThisMonth() {
		return endOfMonth(getCalendar());
	}

	public static Date endOfMonth(Date date) {
		return endOfMonth(getCalendar(date));
	}

	public static Date endOfMonth(int year, int month) {
		return endOfMonth(getCalendar(year, month));
	}

	public static Date endOfMonth(Calendar calendar) {
		int daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, daysOfMonth);
		return endOfDay(calendar);
	}

	// ----------------------------Week------------------------------------

	public static int getThisWeekOfYear(boolean isMondayBeginOfWeek) {
		return getThisWeekOfYear( isMondayBeginOfWeek,MINIMAL_DAYS_IN_FIRST_WEEK);
	}

	public static int getThisWeekOfYear(boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		Calendar calendar = getCalendar();
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		return getWeekOfYear(calendar, isMondayBeginOfWeek);
	}

	public static int getWeekOfYear(Date date,boolean isMondayBeginOfWeek) {
		return	getWeekOfYear(date, isMondayBeginOfWeek, MINIMAL_DAYS_IN_FIRST_WEEK);
	}

	public static int getWeekOfYear(Date date,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		Calendar calendar = getCalendar(date);
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		return getWeekOfYear(calendar, isMondayBeginOfWeek);
	}

	public static int getWeekOfYear(int year, int month, int day,boolean isMondayBeginOfWeek) {
		return getWeekOfYear(year, month, day, isMondayBeginOfWeek,MINIMAL_DAYS_IN_FIRST_WEEK);
	}

	public static int getWeekOfYear(int year, int month, int day,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return getWeekOfYear(getCalendar(year, month, day), isMondayBeginOfWeek,minimalDaysInFirstWeek);
	}

	public static int getWeekOfYear(Calendar calendar,boolean isMondayBeginOfWeek) {
		return getWeekOfYear(calendar,isMondayBeginOfWeek,MINIMAL_DAYS_IN_FIRST_WEEK);
	}

	public static int getWeekOfYear(Calendar calendar,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
		}

		return calendar.get(Calendar.WEEK_OF_YEAR);
	}



	public static int getThisWeekOfMonth(boolean isMondayBeginOfWeek) {
		return	getWeekOfMonth(getCalendar(), isMondayBeginOfWeek);
	}

	public static int getThisWeekOfMonth(boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return getWeekOfMonth(getCalendar(), isMondayBeginOfWeek,minimalDaysInFirstWeek);
	}
	public static int getWeekOfMonth(Date date, boolean isMondayBeginOfWeek) {
		return getWeekOfMonth(getCalendar(date), isMondayBeginOfWeek);
	}

	public static int getWeekOfMonth(Date date, boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return getWeekOfMonth(getCalendar(date), isMondayBeginOfWeek, minimalDaysInFirstWeek);
	}


	public static int getWeekOfMonth(int year,int month,int day, boolean isMondayBeginOfWeek) {
		return getWeekOfMonth(getCalendar(year, month, day), isMondayBeginOfWeek);
	}

	public static int getWeekOfMonth(int year,int month,int day, boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return getWeekOfMonth(getCalendar(year, month, day), isMondayBeginOfWeek,minimalDaysInFirstWeek);
	}

	public static int getWeekOfMonth(Calendar calendar,boolean isMondayBeginOfWeek){
		return getWeekOfMonth(calendar, isMondayBeginOfWeek, MINIMAL_DAYS_IN_FIRST_WEEK);
	}

	public static int getWeekOfMonth(Calendar calendar,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek){
		calendar.setMinimalDaysInFirstWeek(minimalDaysInFirstWeek);
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
		}
		return calendar.get(Calendar.WEEK_OF_MONTH);
	}

	// 按每年最大周数计算周数
	public static int maximumWeekOfYear(Date date, boolean isMondayBeginOfWeek) {
		Calendar calendar = getCalendar(date);
		return maximumWeekOfYear(calendar,isMondayBeginOfWeek);
	}

	public static int maximumWeekOfYear(Calendar calendar, boolean isMondayBeginOfWeek) {
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
		}
			return calendar.getMaximum(Calendar.WEEK_OF_YEAR);

	}



	public static Date beginOfThisWeek(boolean isMondayBeginOfWeek) {
		return beginOfWeek(getCalendar(), isMondayBeginOfWeek);

	}

	public static Date beginOfWeek(int year,int weekOfYear, boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return beginOfWeek(getCalendarOfWeekOfYear(year,weekOfYear,isMondayBeginOfWeek,minimalDaysInFirstWeek), isMondayBeginOfWeek);
	}



	public static Date beginOfWeek(Date date, boolean isMondayBeginOfWeek) {
		return beginOfWeek(getCalendar(date), isMondayBeginOfWeek);
	}



	public static Date beginOfWeek(int year,int month, boolean isMondayBeginOfWeek,int weekOfMonth,int minimalDaysInFirstWeek) {
		return beginOfWeek(getCalendarOfWeekOfMonth(year,month,weekOfMonth,isMondayBeginOfWeek,minimalDaysInFirstWeek), isMondayBeginOfWeek);
	}



	public static Date beginOfWeek(int year, int month, int day, boolean isMondayBeginOfWeek) {
		return beginOfWeek(getCalendar(year, month, day), isMondayBeginOfWeek);
	}

	public static Date beginOfWeek(Calendar calendar, boolean isMondayBeginOfWeek) {
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		} else {
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		}
		return beginOfDay(calendar);
	}


	public static Date endOfThisWeek(boolean isMondayBeginOfWeek) {
		return endOfWeek(getCalendar(), isMondayBeginOfWeek);
	}

	public static Date endOfWeek(int year,int weekOfYear,boolean isMondayBeginOfWeek,int minimalDaysInFirstWeek) {
		return endOfWeek(getCalendarOfWeekOfYear(year,weekOfYear,isMondayBeginOfWeek,minimalDaysInFirstWeek), isMondayBeginOfWeek);
	}


	public static Date endOfWeek(Date date, boolean isMondayBeginOfWeek) {
		return endOfWeek(getCalendar(date), isMondayBeginOfWeek);
	}

	public static Date endOfWeek(int year, int month,boolean isMondayBeginOfWeek,int weekOfMonth,int minimalDaysInFirstWeek) {
		return endOfWeek(getCalendarOfWeekOfMonth(year,month,weekOfMonth,isMondayBeginOfWeek,minimalDaysInFirstWeek), isMondayBeginOfWeek);
	}

	public static Date endOfWeek(int year, int month, int day, boolean isMondayBeginOfWeek) {
		return endOfWeek(getCalendar(year, month, day), isMondayBeginOfWeek);
	}

	public static Date endOfWeek(Calendar calendar, boolean isMondayBeginOfWeek) {
		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		} else {
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		}
		return endOfDay(calendar);
	}


	// ---------------------------Day-------------------------------------


	public static int getThisDayOfYear() {
		return getDayOfYear(getCalendar());
	}

	public static int getDayOfYear(Date date) {
		return getDayOfYear(getCalendar(date));
	}

	public static int getDayOfYear(int year, int month, int day) {
		return getDayOfYear(getCalendar(year, month, day));
	}

	public static int getDayOfYear(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_YEAR);
	}

	public static int getThisDayOfMonth() {
		return getDayOfMonth(getCalendar());
	}

	public static int getDayOfMonth(Date date) {
		return getDayOfMonth(getCalendar(date));
	}

	public static int getDayOfMonth(int year, int month, int day) {
		return getDayOfMonth(getCalendar(year, month, day));
	}

	public static int getDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}


	public static int getThisDayOfWeek(boolean isMondayBeginOfWeek) {
		return getDayOfWeek(getCalendar(), isMondayBeginOfWeek);
	}

	public static int getDayOfWeek(Date date, boolean isMondayBeginOfWeek) {
		return getDayOfWeek(getCalendar(date), isMondayBeginOfWeek);
	}

	public static int getDayOfWeek(int year, int month, int day, boolean isMondayBeginOfWeek) {
		return getDayOfWeek(getCalendar(year, month, day), isMondayBeginOfWeek);
	}

	public static int getDayOfWeek(Calendar calendar, boolean isMondayBeginOfWeek) {

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		if (isMondayBeginOfWeek) {
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
			dayOfWeek -= 1;
			if (dayOfWeek == 0) {
				dayOfWeek = 7;
			}
		}
		return dayOfWeek;
	}



	public static Date beginOfThisDay() {
		return beginOfDay(getCalendar());
	}

	public static Date beginOfDay(Date date) {
		return beginOfDay(getCalendar(date));
	}

	public static Date beginOfDay(int year, int month, int day) {
		return beginOfDay(getCalendar(year, month, day));
	}


	public static Date beginOfDay(Calendar calendar) {
		return beginOfHour(calendar);
	}


	public static Date endOfThisDay() {
		return endOfDay(getCalendar());
	}

	public static Date endOfDay(Date date) {
		return endOfDay(getCalendar(date));
	}

	public static Date endOfDay(int year, int month, int day) {
		return endOfDay(getCalendar(year, month, day));
	}


	public static Date endOfDay(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, END_HOUR_OF_DAY);
		return endOfHour(calendar);
	}





	// ---------------------------Hour-------------------------------------
	public static int getHourOfDay(Date date) {
		return getHourOfDay(getCalendar(date));
	}

	public static int getHourOfDay(Calendar calendar) {
		return 	calendar.get(Calendar.HOUR_OF_DAY);
	}

	public static Date beginOfHour(Date date) {
		return beginOfHour(getCalendar(date));
	}

	public static Date beginOfHour(Calendar calendar) {
		calendar.set(Calendar.MINUTE,BEGIN_MINUTE_OF_HOUR);
		return beginOfMinute(calendar);
	}

	public static Date endOfHour(Date date) {
		return endOfHour(getCalendar(date));
	}

	public static Date endOfHour(Calendar calendar) {
		calendar.set(Calendar.MINUTE,END_MINUTE_OF_HOUR);
		return endOfMinute(calendar);
	}



	// ---------------------------Minute-------------------------------------
	public static int getMinuteOfHour(Date date) {
		return getMinuteOfHour(getCalendar(date));
	}

	public static int getMinuteOfHour(Calendar calendar) {
		return 	calendar.get(Calendar.MINUTE);

	}

	public static Date beginOfMinute(Date date) {
		return beginOfMinute(getCalendar(date));
	}
	public static Date beginOfMinute(Calendar calendar) {
		calendar.set(Calendar.SECOND,BEGIN_SECOND_OF_MINUTE);
		return beginOfSecond(calendar);
	}

	public static Date endOfMinute(Date date) {
		return endOfMinute(getCalendar(date));
	}
	public static Date endOfMinute(Calendar calendar) {
		calendar.set(Calendar.SECOND,END_SECOND_OF_MINUTE);
		return endOfSecond(calendar);
	}

	// ---------------------------Second-------------------------------------
	public static int getSecondOfMinute(Date date) {
		return getSecondOfMinute(getCalendar(date));
	}

	public static int getSecondOfMinute(Calendar calendar) {
		return 	calendar.get(Calendar.SECOND);
	}

	public static Date beginOfSecond(Date date) {
		return beginOfSecond(getCalendar(date));
	}
	public static Date beginOfSecond(Calendar calendar) {
		calendar.set(Calendar.MILLISECOND, BEGIN_MILLISECOND_OF_SECOND);
		return calendar.getTime();
	}

	public static Date endOfSecond(Date date) {
		return endOfSecond(getCalendar(date));
	}
	public static Date endOfSecond(Calendar calendar) {
		calendar.set(Calendar.MILLISECOND, END_MILLISECOND_OF_SECOND);
		return calendar.getTime();
	}

	// ---------------------------Millisecond-------------------------------------
	public static int getMillisecondOfSecond(Date date) {
		return getMillisecondOfSecond(getCalendar(date));
	}
	public static int getMillisecondOfSecond(Calendar calendar) {
		return 	calendar.get(Calendar.MILLISECOND);
	}

	public static Date beginMillisecondOfSecond(Date date) {
		return beginMillisecondOfSecond(getCalendar(date));
	}

	public static Date beginMillisecondOfSecond(Calendar calendar) {
		calendar.set(Calendar.MILLISECOND, BEGIN_MILLISECOND_OF_SECOND);
		return calendar.getTime();
	}

	public static Date endMillisecondOfSecond(Date date) {
		return endMillisecondOfSecond(getCalendar(date));
	}

	public static Date endMillisecondOfSecond(Calendar calendar) {
		calendar.set(Calendar.MILLISECOND, END_MILLISECOND_OF_SECOND);
		return calendar.getTime();
	}


	public static Date offsetYear(Date date,int offset){
		return offset(getCalendar(date), offset, Calendar.YEAR);
	}

	public static Date offsetYear(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.YEAR);
	}

	public static Date offsetMonth(Date date,int offset) {
		return offset(getCalendar(date), offset, Calendar.MONTH);
	}

	public static Date offsetMonth(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.MONTH);
	}

	public static Date offsetDay(Date date, int offset) {
		return offset(getCalendar(date), offset, Calendar.DAY_OF_MONTH);
	}

	public static Date offsetDay(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.DAY_OF_MONTH);
	}

	public static Date offsetHour(Date date, int offset) {
		return offset(getCalendar(date), offset, Calendar.HOUR);
	}

	public static Date offsetHour(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.HOUR);
	}

	public static Date offsetMinute(Date date, int offset) {
		return offset(getCalendar(date), offset, Calendar.MINUTE);
	}

	public static Date offsetMinute(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.MINUTE);
	}

	public static Date offsetSecond(Date date, int offset) {
		return offset(getCalendar(date), offset, Calendar.SECOND);
	}

	public static Date offsetSecond(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.SECOND);
	}

	public static Date offsetMillisecond(Date date, int offset) {
		return offset(getCalendar(date), offset, Calendar.MILLISECOND);
	}

	public static Date offsetMillisecond(Calendar calendar, int offset) {
		return offset(calendar, offset, Calendar.MILLISECOND);
	}


	// ------------------------LocalDate----------------------------------------


	public static LocalDate nowLocalDate() {
		return LocalDate.now();
	}


	public static LocalDate getLocalDate(LocalDateTime localDateTime) {
		return localDateTime.toLocalDate();
	}

	public static LocalDate getLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	// ------------------------LocalTime----------------------------------------

	public static LocalTime nowLocalTime() {
		return LocalTime.now();
	}


	public static LocalTime getLocalTime(LocalDateTime localDateTime) {
		return localDateTime.toLocalTime();
	}

	public static LocalTime getLocalTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}



	// ------------------------LocalDateTime----------------------------------------

	public static LocalDateTime nowLocalDateTime() {
		return LocalDateTime.now();
	}


	public static LocalDateTime getLocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	public static LocalDateTime getLocalDateTime(LocalDate localDate) {
		return localDate.atStartOfDay();
	}

	public static LocalDateTime getLocalDateTime(LocalTime localTime) {
		return localTime.atDate(nowLocalDate());
	}

	public static LocalDateTime getLocalDateTime(LocalDate localDate,LocalTime localTime) {
		return localDate.atTime(localTime);
	}

	public static LocalDateTime getLocalDateTime(LocalDate localDate, int hour, int minute, int second) {
		return localDate.atTime(hour, minute, second);
	}



	// ---------------------between-------------------------------------------

	public static int betweenYear(Date beginDate, Date endDate) {
		return betweenYear(getLocalDate(beginDate), getLocalDate(endDate));

	}

	public static int betweenYear(LocalDate beginDate, LocalDate endDate){
		Period period = Period.between(beginDate, endDate);

		return period.getYears();
	}
	public static int betweenYear(LocalDateTime beginDate, LocalDateTime endDate){
		return betweenYear(beginDate.toLocalDate(), endDate.toLocalDate());
	}

	public static int betweenMonth(Date beginDate,Date endDate){
		return betweenMonth(getLocalDate(beginDate), getLocalDate(endDate));
	}

	public static int betweenMonth(LocalDate beginDate, LocalDate endDate){
		Period period = Period.between(beginDate, endDate);
		return period.getYears() * DECEMBER + period.getMonths() ;
	}

	public static int betweenMonth(LocalDateTime beginDate, LocalDateTime endDate){
		return betweenMonth(beginDate.toLocalDate(),endDate.toLocalDate());
	}


	public static long betweenDay(Date beginDate, Date endDate) {
		return betweenDay(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}
	public static long betweenDay(LocalDate beginDate, LocalDate endDate){
		return betweenDay(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}
	public static long betweenDay(LocalDateTime beginDate, LocalDateTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toDays();
	}


	public static long betweenHours(Date beginDate, Date endDate){
		return betweenHours(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static long betweenHours(LocalDate beginDate, LocalDate endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toHours();
	}

	public static long betweenHours(LocalTime beginDate, LocalTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toHours();
	}

	public static long betweenHours(LocalDateTime beginDate, LocalDateTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toHours();
	}

	public static long betweenMinutes(Date beginDate, Date endDate){
		return betweenMinutes(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static long betweenMinutes(LocalDate beginDate, LocalDate endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toMinutes();
	}

	public static long betweenMinutes(LocalTime beginDate, LocalTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toMinutes();
	}

	public static long betweenMinutes(LocalDateTime beginDate, LocalDateTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.toMinutes();
	}

	public static long betweenSeconds(Date beginDate, Date endDate){
		return betweenSeconds(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static long betweenSeconds(LocalDate beginDate, LocalDate endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.getSeconds();
	}

	public static long betweenSeconds(LocalTime beginDate, LocalTime endDate){
		Duration duration = Duration.between(beginDate, endDate);
		return duration.getSeconds();
	}

	public static long betweenSeconds(LocalDateTime beginDate, LocalDateTime endDate) {
		Duration duration = Duration.between(beginDate, endDate);
		return duration.getSeconds();

	}


	public static DateTimeDiff between(LocalDateTime beginDate, LocalDateTime endDate) {

		DateTimeDiff dateTimeDiff;
		if (endDate.isBefore(beginDate)) {
			dateTimeDiff = between(endDate, beginDate, false);
		}else {
			dateTimeDiff = between(beginDate, endDate, true);
		}

		return dateTimeDiff;
	}

	private static DateTimeDiff between(LocalDateTime beginDate, LocalDateTime endDate ,boolean isPositiveNumber){
		DateTimeDiff dateTimeDiff = new DateTimeDiff();

		Period period = Period.between(DateUtils.getLocalDate(beginDate), DateUtils.getLocalDate(endDate));

		Duration duration = Duration.between(beginDate, endDate);

		Duration hoursDuration = duration.minusDays(duration.toDays());
		long hours = hoursDuration.toHours();
		Duration minutesDuration = hoursDuration.minusHours(hours);
		long minutes = minutesDuration.toMinutes();
		Duration secondsDuration = minutesDuration.minusMinutes(minutes);
		long seconds = secondsDuration.getSeconds();

		Duration duration1 = secondsDuration.minusSeconds(seconds);
		long millis = duration1.toMillis();

		if (isPositiveNumber) {
			dateTimeDiff.setYears(period.getYears());
			dateTimeDiff.setMonths(period.getMonths());
			dateTimeDiff.setDays(period.getDays());
			dateTimeDiff.setHours(hours);
			dateTimeDiff.setMinutes(minutes);
			dateTimeDiff.setSeconds(seconds);
			dateTimeDiff.setMilliseconds(millis);
		}else {
			dateTimeDiff.setYears(Math.negateExact(period.getYears()));
			dateTimeDiff.setMonths(Math.negateExact(period.getMonths()));
			dateTimeDiff.setDays(Math.negateExact(period.getDays()));
			dateTimeDiff.setHours(Math.negateExact(hours));
			dateTimeDiff.setMinutes(Math.negateExact(minutes));
			dateTimeDiff.setSeconds(Math.negateExact(seconds));
			dateTimeDiff.setMilliseconds(Math.negateExact(millis));
		}
		return dateTimeDiff;
	}

	public static DateTimeDiff between(LocalDate beginDate, LocalDate endDate) {
		return between(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static DateTimeDiff between(LocalTime beginDate, LocalTime endDate) {
		return between(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static DateTimeDiff between(Date beginDate, Date endDate) {
		return between(getLocalDateTime(beginDate), getLocalDateTime(endDate));
	}

	public static DateTimeDiff between(Calendar beginCalendar, Calendar endCalendar) {
		return between(getLocalDateTime(getDate(beginCalendar)), getLocalDateTime(getDate(endCalendar)));
	}


	private static Calendar getCalendar() {
		return Calendar.getInstance();
	}


	private static Date offset(Calendar calendar, int offset, int unit) {
		calendar.add(unit, offset);
		return calendar.getTime();
	}

}
