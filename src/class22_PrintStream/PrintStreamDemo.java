package class22_PrintStream;
/*
 * 打印流概述
 * 字节流打印流:PrintStream
 * 字符打印流:PrintWriter
 * 
 * 打印流的特点：
 * 		A：只能写数据，不能读取数据，只能操作目的地，不能操作数据源
 * 		B：可以操作任意类型的数据
 * 		C：如果启动了自动刷新，能够自动刷新
 * 		D：可以操作文件的流
 * 			哪些流对象是可以直接操作文本文件的呢？
 * 				FileInputStream
 * 				FileOutputStream
 * 				FileReader
 * 				FileWriter
 * 				PrintStream
 * 				PrintWriter
 * 				看API，查流对象的构造方法，如果同时有File类型和String类型的参数，一般来说就是可以直接操作文件的
 * 				
 * 			流：
 * 				基本流：能够直接能够读写文件的
 * 				高级流：在基本流基础上提供了一些其他的功能
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo {
		public static void main(String[] args) throws IOException {
			//作为Writer的子类使用
			PrintWriter pw = new PrintWriter("pw.txt");
			
			pw.write("hello");
			pw.write("world");
			pw.write("java");
			
			pw.close();
		}
}
