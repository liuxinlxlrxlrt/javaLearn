package class20_IOStream_FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 IO���ķ��ࣺ 
 	������������
		������	��������
		�����	д������
	������������
		�ֽ���
			�ֽ�������     ��ȡ����	 InputStream
			�ֽ������	д������	  OutputStream
		�ַ���
			�ַ�������     ��ȡ����	  Reader
			�ַ������	д������	  Writer
	ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ������°������������ֵġ�
 * ������Ҫ��һ���ı��ļ�������һ�仰��hello,io.
 * 
 * ������
 * 		A�������������ǲ����ַ��������������أ��ַ������ֽ���֮��ų��֣����ԣ������Ƚ����ֽ�����β���
 * 		B:�����������ļ���дһ�仰����������Ҫ�����ֽ������
 * 
 * ͨ������ķ���������֪��Ҫʹ�ã�OutputStream
 * ����ͨ���鿴API�����Ƿ��ָ���������һ�������࣬����ʵ������
 * ���ԣ�����Ҫ��һ����������ࡣ
 * ������Ҫ�ҵ�������ʲô���ֵ��أ����ʱ�򣬺ܼ򵥣������ǲ���Ҫ���ļ���дһ�仰 
 * �ļ�����һ�����ʣ�File
 * Ȼ���õ��ֽ�������������������ǣ�FileOutputStream
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		xxxOutputStream
 * 		xxxInputStream
 * 		xxxReader
 * 		xxxWriter
 *�鿴FileOutputStream�Ĺ��췽����
 *		FileOutputStream(File file)
		FileOutputStream(String name)
		
     �ֽ�������������裺
		A�������ֽ����������
		B��д����
		C���ͷ���Դ
 */

public class FileOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//�����ֽ������
//			��һ�ַ�ʽ��FileOutputStream(File file)
//			File file = new File("file.txt");
//			FileOutputStream fos = new FileOutputStream(file);
			//�ڶ��ַ�����FileOutputStream(String name)
			FileOutputStream fos = new FileOutputStream("D:\\demo\\fos2.txt");
			/*
			 * �����ֽ�������������˼������飺
			 * A������ϵͳ����ȥ�����ļ�
			 * B:����fos����
			 * C����fos����ָ������ļ�
			 */
			
			//д����
			//write()����ֱ��дһ���ַ�����������ַ���ͨ��getBytes()����ת���ֽ�����
			fos.write("helloWorld.io".getBytes());
			
			//�ͷ���Դ
			fos.close();
			/*
			 * Ϊ��һ��close()�أ�
			 * A�����������������������Ϳ��Ա�����������������
			 * B��֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
			 */
			//fos.write("hello".getBytes());
			//java.io.IOException: Stream Closed
			
		}
}