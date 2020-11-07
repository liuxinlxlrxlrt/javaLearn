package class14_System;
/*
 * System 类包含一些有用的类字段和方法。它不能被实例化
 * 
 * 成员方法：
 * public static void gc()：运行垃圾回收器
 * public static void exit(int status)：终止运行当前正在运行的JAVA虚拟机，参数用作状态码：根据惯例，非0的状态表示异常终止
 * public static long currentTimeMillis()：返回以毫秒为单位的当前时间
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDemo02 {
	public static void main(String[] args) {
//		System.out.println("我们喜欢李嘉欣");
//		System.exit(0);
//		System.out.println("我们也喜欢关之琳");
		// 结果：我们喜欢李嘉欣
//		System.out.println("----------------");

		System.out.println(System.currentTimeMillis());

		// 单独得到这样的时间意义不大
		// 那么。它到底有什么用呢？
		// 需求请大家给我统计这段程序的运行时间
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();

		System.out.println("共耗时" + (end - start) + "毫秒");
	}
}
