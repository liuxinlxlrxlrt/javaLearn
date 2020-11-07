package class22_RandomAccessFile_SequenceStream;
/*
 * ��ǰ�Ĳ�����
 * a.txt-->b.txt
 * c.txt-->d.txt
 * 
 * ������Ҫ��
 * a.txt+b.txt+c.txt-->d.txt
 */


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


public class SequenceInputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		//���󣺰�����������ļ������ݸ��Ƶ�Copy02.java
		//DataStreamDemo.java��FileOutputStreamDemo.java��student.txt
		//SequenceInputStream(Enumeration<? extends InputStream> e) 
	
		//SequenceInputStream(Enumeration e)
		//ͨ���򵥵Ļع�����֪����Enumeration��Vector�е�һ�������ķ���ֵ����
		//Enumeration<E> elements() 
		Vector<InputStream> v = new Vector<InputStream>();
		InputStream s1 = new FileInputStream("DataStreamDemo.java");
		InputStream s2 = new FileInputStream("FileOutputStreamDemo.java");
		InputStream s3 = new FileInputStream("student.txt");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy02.java"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
		
		
	}

}
