package class14_Calendar;


/*
 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历来操作
 * public final void set(int year,int month,int date)：设置当前日历的年月日
 */

import java.util.Calendar;
public class CalendarDemo02 {
	public static void main(String[] args) {
		// 获取当前的日历时间
		Calendar c = Calendar.getInstance();

		// 获取年
		int year = c.get(Calendar.YEAR);
		// 获取月
		int month = c.get(Calendar.MONTH);
		// 获取日
		int date = c.get(Calendar.DATE);

		System.out.println(year + "年" + month + "月" + date + "日");

		// 三年前的今年
		c.add(Calendar.YEAR, -3);
		// 获取年
		int year3 = c.get(Calendar.YEAR);
		// 获取月
		int month3 = c.get(Calendar.MONTH);
		// 获取日
		int date3 = c.get(Calendar.DATE);

		System.out.println(year3 + "年" + month3 + "月" + date3 + "日");

		// 5年后的10天前
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		// 获取年
		int year5 = c.get(Calendar.YEAR);
		// 获取月
		int month5 = c.get(Calendar.MONTH);
		// 获取日
		int date5 = c.get(Calendar.DATE);

		System.out.println(year5 + "年" + month5 + "月" + date5 + "日");
		System.out.println("-------------");

		c.set(2011, 11, 11);
		// 获取年
		int year11 = c.get(Calendar.YEAR);
		// 获取月
		int month11 = c.get(Calendar.MONTH);
		// 获取日
		int date11 = c.get(Calendar.DATE);

		System.out.println(year11 + "年" + month11 + "月" + date11 + "日");
	}
}
