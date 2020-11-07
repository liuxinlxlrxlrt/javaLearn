package class20_IOStream_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *      字节输出流操作步骤：
 *		A：创建字节输入流对象
 *		B：调用read()方法读取数据，并且数据显示在控制台
 *		C：释放资源
 *
 *读取数据的方式：
 *		A：int read():一次读取一个字节
 *		B：int read(byte[] b)：一次读取一个字节数组
 *		
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//FileInputStream(String name)
		//FileInputStream fis = new FileInputStream("fis.txt");//文件短
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		
		//调用read()方法读取数据，并且数据显示在控制台
		//第一次读取
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//第二次读取
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//第三个读取
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//我们发现代码的重复度很高
//		//而用循环，最麻烦的事情就是如何控制循环判断条件呢
//		//第四次读取
//		by = fis.read();
//		System.out.println(by);
//		
//		//第五次读取
//		by = fis.read();
//		System.out.println(by);
		
		//通过测试，我们知道如果读取到的数据是-1.就说明已经读取到末尾了
		//用循环改进
//		int by = fis.read();
//		while(by!=-1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		
		//最终版代码
		int by =0;
		//读取、赋值、判断
		while((by=fis.read())!=-1) {
			//带有中文的输出后，中文不能被识别，因为(char)by读取到字节被转成char类型了，所以需要手动删除中文字符
			System.out.print((char)by);
		}
		//释放资源
		fis.close();
	}

}
