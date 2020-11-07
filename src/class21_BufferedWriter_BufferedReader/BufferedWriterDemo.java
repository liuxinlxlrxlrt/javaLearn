package class21_BufferedWriter_BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ�������
 * BufferedWriter���ַ����������
 * BufferedReader���ַ�����������
 * 
 *  ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ�
 * 
 * 
 */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		//BufferedWriter(Writer out) 
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("hello\r\n");
		bw.write("world\r\n");
		bw.write("java");
		bw.flush();
		
		bw.close();
	}

}
