package class14_Date_DateFormat;
/*
 * Date---String(格式化)
 * 		public final String format(Date date)
 * 
 * String---Date(解析)
 * 
 * DateFormat:可以进行日期和字符串的格式化和解析，但是由于抽象类，所以使用具体子类SimpleDateFormat
 * 
 * SimpleDateFormat的构造方法：
 * 			SimpleDateFormat():默认模式
 * 			public SimpleDateFormat(String pattern)：给定模式
 * 					这个模式字符串该如何写呢？
 * 					通过查看API，我们找到了对应的模式
 * 				年：y
 * 				月：M
 * 				日：d
 * 				时：H
 * 				分：m
 * 				秒：s
 * 				2014年12月12日 12:12:12
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		// Date---String
		// 创建日期对象
		Date d = new Date();

		// 创建格式化对象
		// 默认模式
//		SimpleDateFormat sdf = new SimpleDateFormat();
		// 给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);

		// String---Date(解析)
		String str = "2018-08-08 12:12:12";
		// 在把一个字符串解析为日期的时候，请注意格式必须和字符串的格式匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
