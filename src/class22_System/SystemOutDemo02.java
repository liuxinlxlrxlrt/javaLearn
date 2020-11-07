package class22_System;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

//转换流的应用

public class SystemOutDemo02 {

	public static void main(String[] args) throws IOException {
		//获取标准输出流
//		PrintStream ps = System.out;
//		OutputStream os = ps;
		
//		OutputStream os = System.out;//多态
//		
//		//我能不能按照刚才使用的标准输入流的方式一样吧数据输出到控制台呢？
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello");
		bw.newLine();
//		bw.flush();
		bw.write("world");
		bw.newLine();
//		bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
