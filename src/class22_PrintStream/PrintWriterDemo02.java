package class22_PrintStream;
/*
 * 可以操作任意类型的数据
 * 		print()
 * 		println()
 * 2.启动自动刷新：
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
 * 		还必须使用println()的方法才可以
 * 		这个时候不仅仅自动刷新了，还实现了数据的换行
 * 
 * 		println()
 * 		其实等价于
 * 		bw.write()
 * 		bw.newLine()
 * 		bw.close()
 * 
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo02 {

	public static void main(String[] args) throws IOException {
		//创建打印流对象
//		PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
		//writer()是搞不定的，怎么办呢、
		//我们就看看其他方法
//		pw.print(true);
//		pw.print(100);
//		pw.print("hello");
		
		pw.println("hello");
		pw.println(true);
		pw.println(100);
		
//		pw.close();
		
	}

}
