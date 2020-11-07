package class14_Date_DateFormat;
/*
 * 算一下你来到这个世界多少天?
 * 
 * 分析：
 * 		A：把你出生的年月日给键盘录入
 * 		B：把该字符串转换为一个日期
 * 		C：通过该日期转换为一个毫秒值
 * 		D：获取当前时间的毫秒值
 * 		E：用D-C得到一个毫秒值
 * 		F：把E的毫秒值换换位年
 * 				/1000/60/60/24
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		// 把你出生的年月日给键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日：");
		String line = sc.nextLine();

		// 把该字符串转换为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// 通过该日期转换为一个毫秒值
		long myTime = d.getTime();

		// 获取当前时间的毫秒值
		long nowTime = System.currentTimeMillis();

		// 用D-C得到一个毫秒值
		long time = nowTime - myTime;

		// 把E的毫秒值换换位年
		long day = time / 1000 / 60 / 60 / 24;
		long year = time / 1000 / 60 / 60 / 24 / 365;

		System.out.println("你来到这个世界：" + day + "天");
		System.out.println("你来到这个世界：" + year + "年");
	}
}
