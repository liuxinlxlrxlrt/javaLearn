package class22_RandomAccessFile_SequenceStream;
/*
 * 序列化流：把对象按流一样的方式存入文本文件或者在网络中传输。对象--流数据：ObjectOutputStream
 * 反序列化：把文本文件中的流对象数据或者网络中的流对象还原成对象。流数据--对象：ObjectInputStream
 * 
 * 注意：
 * 		我一个类中可能有很多的成员变量，有些我不想进行序列化，请问怎么办呢？
 * 		使用transient关键字声明不需要系列化的成员变量
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//由于我们要对对象序列化，所以我们自定义一个类
		//序列化数据其实就是把对象写到文本文件
//		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		//创建反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		//还原对象
		Object obj = ois.readObject();
		
		//释放资源
		ois.close();
		
		//输出对象
		System.out.println(obj);
		
		
	}

	private static void write() throws IOException {
		//创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//创建对象
		Person p = new Person("白冰",27);
		
		//public final void writeObject(Object obj)
		oos.writeObject(p);
		
		//释放资源
		oos.close();
	}
}
