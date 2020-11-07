package class14_Date_DateFormat;
/*
 * 成员方法
* public long getTime():获取时间，以毫秒为单位
* public void setTime(long time)：设置时间
* 
* 从Date得到毫秒值
* 			setTime()
* 把一个毫秒值转换为Date
* 			构造方法：
* 			setTime(long time)
 */

import java.util.Date;

public class DateDemo02 {
	public static void main(String[] args) {
		// 创建对象
		Date d = new Date();

		// 获取时间
		long time = d.getTime();
		System.out.println(time);
		// System.out.println(System.currentTimeMillis());

		System.out.println("d：" + d);
		// 设置时间
		d.setTime(1000);
//		Date d2 =  new Date(time);
		System.out.println("d：" + d);
	}
}
