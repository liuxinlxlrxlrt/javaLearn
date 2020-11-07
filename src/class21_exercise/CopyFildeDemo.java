package class21_exercise;
/*
 * 复制文本文件：
 * 
 * 分析：
 * 	复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流
 * 	通过该原料，我们知道我们应该采用字符流更方便一点
 * 	而字符流有5中方式，所以做这个题目我们用5中方式，推荐使用第5种
 * 
 * 数据源：
 *  c:\\a.txt--FileReader--BufferedReader
 *  
 *目的地：
 *	d:\\b.txt--FileWriter--BufferedWriter
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFildeDemo {

	public static void main(String[] args) throws IOException {
		String srcString =  "c:\\a.txt";
		String destString = "d:\\h.txt";
//		method1(srcString,destString);
//		method2(srcString,destString);
//		method3(srcString,destString);
//		method4(srcString,destString);
		method5(srcString,destString);

	}
	//字符缓冲流一次读写一个字符串
	private static void method5(String srcString, String destString) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		String line = null;
		while((line = br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	//字符缓冲流一次读写一个字符数组
	private static void method4(String srcString, String destString) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		int ch =0;
		while((ch= br.read())!=-1) {
			bw.write(ch);
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}
	//字符缓冲流一次读写一个字符
	private static void method3(String srcString, String destString) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		char[] chs = new char[1024];
		int len =0;
		while((len= br.read(chs))!=-1) {
			bw.write(chs,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
	//基本字符流一次读写一个字符数组
	private static void method2(String srcString, String destString) throws IOException {
		FileReader fi = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);
		
		char[] chs = new char[1024];
		int len =0;
		while((len= fi.read(chs))!=-1) {
			fw.write(chs,0,len);
			fw.flush();
		}
		
		fw.close();
		fi.close();
		
	}
	//基本字符流一次读写一个字符
	private static void method1(String srcString, String destString) throws IOException {
		FileReader fi = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);
		
		int ch =0;
		while((ch= fi.read())!=-1) {
			fw.write(ch);
			fw.flush();
		}
		
		fw.close();
		fi.close();
	}

}
