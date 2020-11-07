package class12_Scanner;

import java.util.Scanner;

/*
 * Scanner:JDK5以后用于获取用户的键盘输入
 * 
 * 前面的时候：
 * 			A：导包
 * 			B：创建对象
 * 			C：调用方法
 * 
 * System类下有一个静态的字段：
 * 		public static final InputStream in;标准的输入流，对应着键盘录入
 * 
 * 		InputStream is = System.in;
 * 
 * class Demo{
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * 
 * int y = Demo.x;
 * Student s = Demo.s 
 * 
 * 构造方法：
 * 		Scanner(InputStream source) 
 */

public class ScannerDemo {
	public static void main(String[] args) {
		//创建对象
		//System.in: System是一个类，in是变量（方法应该是in()必须价格()才是方法）
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("x"+x);
	}
}
