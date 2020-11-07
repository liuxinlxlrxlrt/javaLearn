package class20_BufferedOutputStream_BufferedInputStream;
/*
 * 通过定义数组的方式确实比前一次读取一个字节的方式快很多，所以，看来有一个缓冲器还是非常好的。
 * 既然是这样的话，那么，java开始在设计的时候，它也考虑了这个问题，就专门提供了带缓冲区的字节类
 * 这种类成为：缓冲区类（高级类）
 * 写数据：BufferedOutputStream
 * 读数据：BufferedInputStream
 * 
 * 构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认缓冲区大小就足够了。
 * 
 * 为什么不传一个文件或者文件路径，而是传递一个OutputStream out对象呢？
 * 原因很简单，字节缓冲区流仅仅提供缓冲区，为高效而设计的，但是呢？真正的读写操作还得靠基本的刘对象实现
 */

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//BufferedOutputStream(OutputStream out) 
//			FileOutputStream fos= new FileOutputStream("bos.txt");
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//简单写法
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
			
			//写数据
			bos.write("hello".getBytes());
			
			//释放资源
			bos.close();
			
			
		}
}
