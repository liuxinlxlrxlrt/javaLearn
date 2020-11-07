package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * public void write(int c)��дһ���ַ�
 * public void write(char[] cbuf)��дһ���ַ�����
 * public void write(char[] cbuf,int off,int len)��дһ���ַ������һ����
 * public void write(String str)��дһ���ַ���
 * public void write(String str,int off,int len)��дһ���ַ�����һ����
 * 
 * �����⣺close()��flush()������
 * A��close()�������ǣ��ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿����ټ���ʹ��
 * B��flush()����ˢ�»�������ˢ��֮�������󻹿���ʹ�á�
 */
public class OutputStreamWriterDemo02 {

	public static void main(String[] args) throws IOException {
		//��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
		
		//д����
		//public void write(int c)��дһ���ַ�
//		osw.write('a');
//		osw.write(97);
		//Ϊʲô����û�н�ȥ�أ�
		//ԭ���ǣ��ַ�=2�ֽ�
		//�ļ������ݴ洢�Ļ�����λ���ֽ�
		//public void flush()

		
		//public void write(char[] cbuf)��дһ���ַ�����
		char[] chs = {'a','b','c','d','e'};
//		osw.write(chs);
		
		 //public void write(char[] cbuf,int off,int len)��дһ���ַ������һ����
//		osw.write(chs, 1, 3);
		
		//public void write(String str)��дһ���ַ���
//		osw.write("�Ұ�������");
		
		//public void write(String str,int off,int len)��дһ���ַ�����һ����
		osw.write("�Ұ���ԲԲ", 1, 3);
		
		//osw.flush();
		//osw.write("�Ұ������", 1, 3);
		
		//�ͷŻ�����
		osw.close();
		//osw.write("�Ұ���С��", 1, 3);
	}

}
