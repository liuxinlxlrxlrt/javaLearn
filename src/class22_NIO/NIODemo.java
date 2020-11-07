package class22_NIO;
/*
 * nio包在JDK4出现，提供了IO流的操作效率，但是目前还不是大范围使用
 * 有空的话了解下，有问题再问我
 * 
 * JDK7的之后的nio
 * Path：路径
 * Paths：有一个静态方法返回一个路径
 * 		public static Path get(URI uri)
 * Files：提供了静态方法供我们使用
 * 		public static long copy(Path source,OutputStream out)
 *		public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 *
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NIODemo {
	public static void main(String[] args) throws IOException, IOException {
		//public static long copy(Path source,OutputStream out):复制文件
		//Files.copy(Paths.get("FileOutputStreamDemo.java"), new FileOutputStream("Copy.java"));
	
		//public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset(编码) cs,OpenOption...(可变参数) options)
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
		
		
	}
}
