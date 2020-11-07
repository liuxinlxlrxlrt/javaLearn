package class22_NIO;
/*
 * nio����JDK4���֣��ṩ��IO���Ĳ���Ч�ʣ�����Ŀǰ�����Ǵ�Χʹ��
 * �пյĻ��˽��£�������������
 * 
 * JDK7��֮���nio
 * Path��·��
 * Paths����һ����̬��������һ��·��
 * 		public static Path get(URI uri)
 * Files���ṩ�˾�̬����������ʹ��
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
		//public static long copy(Path source,OutputStream out):�����ļ�
		//Files.copy(Paths.get("FileOutputStreamDemo.java"), new FileOutputStream("Copy.java"));
	
		//public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset(����) cs,OpenOption...(�ɱ����) options)
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
		
		
	}
}
