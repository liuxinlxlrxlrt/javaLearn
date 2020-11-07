package class22_RandomAccessFile_SequenceStream;
/*
 * ��ǰ�Ĳ�����
 * a.txt-->b.txt
 * c.txt-->d.txt
 * 
 * ������Ҫ��
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
		//���󣺰�DataStreamDemo.java��FileOutputStreamDemo.java�����ݸ��Ƶ�Copy.java��
		InputStream s1 = new FileInputStream("DataStreamDemo.java");
		InputStream s2 = new FileInputStream("FileOutputStreamDemo.java");
		
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));
		
		//��ζ�д�أ���ʵ�ܼ򵥣���Ͱ�����ǰ��ô��д�����ھ���ô��д
		byte[] bys = new byte[1024];
		int len = 0;
		while((len= sis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		sis.close();
		
	}

}
