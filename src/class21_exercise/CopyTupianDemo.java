package class21_exercise;
/*
 *  * 复制文本文件：
 * 
 * 分析：
 * 	复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流
 * 	通过该原理，我们知道我们应该采用字节流更方便一点
 * 	而字节流有4中方式，所以做这个题目我们用4中方式，推荐使用第5种
 * 
 * 数据源：
 *  c:\\杨铭铭.jpg--FileInputStream--BufferedInputStream
 *  
 *目的地：
 *	d:\\杨铭铭.jpg--FileOutputStream--BufferedOutputStream
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTupianDemo {

	public static void main(String[] args) throws IOException {
		//使用字符串作为路径
//		String srcString =  "c:\\杨铭铭.jpg";
//		String destString = "d:\\李嘉欣.jpg";
		//使用File对象作为参数
		File srcFile = new File("c:\\杨铭铭.jpg");
		File destFile1 = new File("d:\\李嘉欣.jpg");
		File destFile2 = new File("d:\\高圆圆.jpg");
		File destFile3 = new File("d:\\刘诗诗.jpg");
		File destFile4 = new File("d:\\钟鹿纯.jpg");
		File destFile5 = new File("d:\\梁小冰.jpg");
//		method1(srcFile,destFile1);
//		method2(srcFile,destFile2);
//		method3(srcFile,destFile3);
		method4(srcFile,destFile4);

	}
	//字节缓冲流写一个读写字节数组
	private static void method4(File srcFile, File destFile4) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile4));
		
		byte[] bys = new byte[1024];
		int len =0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		bis.close();
	}
	//字节缓冲流写一个读写字节
	private static void method3(File srcFile, File destFile3) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile3));
		
		int by= 0;
		while((by = bis.read())!=-1) {
			bos.write(by);
		}
		
		bos.close();
		bis.close();
	}
	//一次读写一个字节数组
	private static void method2(File srcFile, File destFile2) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile2);
		
		byte[] bys = new byte[1024];
		int len =0;
		while((len = fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();
	}
	//一次读写一个字节
	private static void method1(File srcFile, File destFile1) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile1);
		
		int by= 0;
		while((by = fis.read())!=-1) {
			fos.write(by);
		}
		
		fos.close();
		fis.close();
		
	}

}
