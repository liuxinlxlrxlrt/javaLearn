package class12_Scanner;

import java.util.Scanner;

/*
 * 常用的两个方法：
 * 		public int nextInt()：获取一个Int类型的值
 *      public String nextLine()：获取一个String类型的值
 * 
 * 出现问题：
 * 		先获取一个数值，在获取一个字符串，会出现问题  
 * 		主要原因：就是那个换行符号的问题
 * 
 * 怎么解决呢？
 * 		A：先获取一个数值后，在创建一个新的键盘录入对象获取字符串
 * 		B：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么
 */

public class ScannerDemo3 {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取两个int类型的值
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a:" + a + ",b:" + b);
		System.out.println("---------------");

		// 获取两个String类型的值
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1:" + s1 + ",s2:" + s2);
		System.out.println("---------------");

		// 先获取一个字符串，在获取一个int值
		String s3 = sc.nextLine();
		int c = sc.nextInt();
		System.out.println("s3:" + s3 + ",c:" + c);
		System.out.println("---------------");

		// 先获取一个int值，在获取一个字符串
		int d = sc.nextInt();
		String s4 = sc.nextLine();
		System.out.println("d:" + d + ",s4:" + s4);
		// 结果是：(d:10,s4: )
		// 因为回车是-r-n,给了S2

		// 如何结局呢？
		// 方式一：先获取一个数值后，在创建一个新的键盘录入对象获取字符串
		int e = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		String s5 = sc2.nextLine();
		System.out.println("e:" + e + ",s5:" + s5);

		// 方式二：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么
	}
}
