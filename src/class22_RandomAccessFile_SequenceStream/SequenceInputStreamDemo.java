package class22_RandomAccessFile_SequenceStream;
/*
 * 以前的操作：
 * a.txt-->b.txt
 * c.txt-->d.txt
 * 
 * 现在想要：
 * a.txt+b.txt-->c.txt
 */

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//SequenceInputStream(InputStream s1, InputStream s2) 
		//需求：把DataStreamDemo.java和FileOutputStreamDemo.java的内容复制到Copy.java中
		InputStream s1 = new FileInputStream("DataStreamDemo.java");
		InputStream s2 = new FileInputStream("FileOutputStreamDemo.java");
		
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));
		
		//如何读写呢？其实很简单，你就按照以前怎么读写，现在就怎么读写
		byte[] bys = new byte[1024];
		int len = 0;
		while((len= sis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		sis.close();
		
	}

}
