package class22_System;

import java.io.PrintStream;

/*
 * 标准输入输出流
 * System类中两个成员变量：
 *		//可通过类型去访问静态修饰的成员变量，变量是什么类型，返回值就是什么类型
 * 		public static final InputStream in：标准输入流
 * 		public static final PrintStream out：标准输出流
 * 
 * 		InputStream in = System.in
 * 		PrintStream ps = System.out
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		//由这里的讲解什么就知道了，这个输出语句其实本质是IO流操作，把数据输出到控制台
		System.out.println("helloworld");
		
		//这表示获取标准输出流对象
		PrintStream ps = System.out;
		ps.println("helloworld");
		
		ps.println();
//		ps.print();//这个方法不存在
//		System.out.println();
//		System.out.print();
				
	}
}
