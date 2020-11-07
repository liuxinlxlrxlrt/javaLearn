package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * public void write(int c)：写一个字符
 * public void write(char[] cbuf)：写一个字符数组
 * public void write(char[] cbuf,int off,int len)：写一个字符数组的一部分
 * public void write(String str)：写一个字符串
 * public void write(String str,int off,int len)：写一个字符串的一部分
 * 
 * 面试题：close()和flush()的区别？
 * A：close()的作用是：关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以再继续使用
 * B：flush()仅仅刷新缓冲区，刷新之后，流对象还可以使用。
 */
public class OutputStreamWriterDemo02 {

	public static void main(String[] args) throws IOException {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
		
		//写数据
		//public void write(int c)：写一个字符
//		osw.write('a');
//		osw.write(97);
		//为什么数据没有进去呢？
		//原因是：字符=2字节
		//文件中数据存储的基本单位是字节
		//public void flush()

		
		//public void write(char[] cbuf)：写一个字符数组
		char[] chs = {'a','b','c','d','e'};
//		osw.write(chs);
		
		 //public void write(char[] cbuf,int off,int len)：写一个字符数组的一部分
//		osw.write(chs, 1, 3);
		
		//public void write(String str)：写一个字符串
//		osw.write("我爱杨铭铭");
		
		//public void write(String str,int off,int len)：写一个字符串的一部分
		osw.write("我爱高圆圆", 1, 3);
		
		//osw.flush();
		//osw.write("我爱李嘉欣", 1, 3);
		
		//释放缓冲区
		osw.close();
		//osw.write("我爱梁小冰", 1, 3);
	}

}
