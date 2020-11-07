package class22_IO_DataStream;
/*
 * 可以读写基本数据类型的数据
 * 数据输入流：DataInputStream
 * 		DataInputStream(InputStream in) 
 * 数据输出流：DataOutputStream
 * 		DataOutputStream(OutputStream out) 
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		//写
		//write();
		
		//读
		read();
	}

	private static void read() throws IOException {
		//DataInputStream(InputStream in) 
		//创建数据输入流对象
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bl = dis.readBoolean();
		
		//释放资源
		dis.close();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
		
		
		
	}

	private static void write() throws IOException {
		//DataOutputStream(OutputStream out) 
		//创建数据输出流
		 DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		 
		 //写数据
		 dos.writeByte(10);
		 dos.writeShort(100);
		 dos.writeInt(1000);
		 dos.writeLong(10000);
		 dos.writeFloat(12.34F);
		 dos.writeDouble(12.56);
		 dos.writeChar('a');
		 dos.writeBoolean(true);
		 
		 //释放资源
		 dos.close();
	}
}
package class20_IOStream_FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 IO流的分类： 
 	按照数据流向
		输入流	读入数据
		输出流	写出数据
	按照数据类型
		字节流
			字节输入流     读取数据	 InputStream
			字节输出流	写出数据	  OutputStream
		字符流
			字符输入流     读取数据	  Reader
			字符输出流	写出数据	  Writer
	注意：一般我们在探讨IO流的时候，如果没有明确说明按哪种分类来说，默认情况下按数据类型来分的。
 * 需求：我要往一个文本文件中输入一句话：hello,io.
 * 
 * 分析：
 * 		A：这个操作最好是采用字符流来做，但是呢？字符流在字节流之后才出现，所以，我们先讲解字节流如何操作
 * 		B:由于我是往文件中写一句话，所以我们要采用字节输出流
 * 
 * 通过上面的分析后我们知道要使用：OutputStream
 * 但是通过查看API，我们发现该流对象是一个抽象类，不能实例化。
 * 所以，我们要找一个具体的子类。
 * 而我们要找的子类是什么名字的呢？这个时候，很简单，我们是不是要往文件中写一句话 
 * 文件是哪一个单词：File
 * 然后用的字节输出流，联想起来就是：FileOutputStream
 * 注意：每种基类的子类都是以父类名作为后缀名。
 * 		xxxOutputStream
 * 		xxxInputStream
 * 		xxxReader
 * 		xxxWriter
 *查看FileOutputStream的构造方法：
 *		FileOutputStream(File file)
		FileOutputStream(String name)
		
     字节输出流操作步骤：
		A：创建字节输出流对象
		B：写数据
		C：释放资源
 */

public class FileOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//创建字节输出流
//			第一种方式：FileOutputStream(File file)
//			File file = new File("file.txt");
//			FileOutputStream fos = new FileOutputStream(file);
			//第二种方法：FileOutputStream(String name)
			FileOutputStream fos = new FileOutputStream("D:\\demo\\fos2.txt");
			/*
			 * 创建字节输出流对象组了几件事情：
			 * A：调用系统功能去创建文件
			 * B:创建fos对象
			 * C：把fos对象指向这个文件
			 */
			
			//写数据
			//write()不能直接写一个字符串，必须把字符串通过getBytes()方法转成字节数组
			fos.write("helloWorld.io".getBytes());
			
			//释放资源
			fos.close();
			/*
			 * 为是一定close()呢？
			 * A：让流对象变成垃圾，这样就可以被垃圾回收器回收了
			 * B：通知系统去释放跟该文件相关的资源
			 */
			//fos.write("hello".getBytes());
			//java.io.IOException: Stream Closed
			
		}
}
学生信息
姓名,语文成绩,数学成绩,英语成绩
李嘉欣,99,98,97
高圆圆,89,88,87
钟鹿纯,79,78,77
张美曦,69,68,67
余声,59,58,57
