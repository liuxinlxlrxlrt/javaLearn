package class20_IOStream_FileOutputStream;
/*
 * 字节流写数据常见问题:
 * 	1.创建字节输出流到底做了哪些事情?
 * 		A：调用系统功能去创建文件
 * 		B: 创建fos对象
 * 		C：把fos对象指向这个文件
 * 
 *	2.数据写成功后，为什么要close()?
 *		A：让流对象变成垃圾，这样就可以被垃圾回收器回收了
 *		B：通知系统去释放跟该文件相关的资源
 *
 *  3.如何实现数据的换行?
 *  	为什么现在没有换行呢？因为你只写了字节数据，没有写入换行符号。
 *  	如何实现呢？写入换行符号即可。
 *  	刚才我们看到了有些文本文件打开时可以的，通过windows自带的那个不行，为什么呢？
 *  	windows:\r\n
 *  	linux:\n
 *  	Mac:\r
 *  	而一些常见的几个高级记事本，是可以识别任意换行符号的。
 *  
 *	4.如何实现数据的追加写入?
 *		用构造方法带第二个参数是true的情况即可
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {

	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("fos3.txt");
		//
		FileOutputStream fos4 = new FileOutputStream("fos4.txt",true);		
		//写数据
		for(int x=0;x<10;x++) {
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		
		for(int x=0;x<10;x++) {
			fos4.write(("hello"+x).getBytes());
			fos4.write("\r\n".getBytes());
		}
		
		//释放资源
		fos.close();

	}

}
