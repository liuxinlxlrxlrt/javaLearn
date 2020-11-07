package class22_PrintStream;
/*
 * ��ӡ������
 * �ֽ�����ӡ��:PrintStream
 * �ַ���ӡ��:PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A��ֻ��д���ݣ����ܶ�ȡ���ݣ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ
 * 		B�����Բ����������͵�����
 * 		C������������Զ�ˢ�£��ܹ��Զ�ˢ��
 * 		D�����Բ����ļ�����
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ����أ�
 * 				FileInputStream
 * 				FileOutputStream
 * 				FileReader
 * 				FileWriter
 * 				PrintStream
 * 				PrintWriter
 * 				��API����������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ���
 * 				
 * 			����
 * 				���������ܹ�ֱ���ܹ���д�ļ���
 * 				�߼������ڻ������������ṩ��һЩ�����Ĺ���
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo {
		public static void main(String[] args) throws IOException {
			//��ΪWriter������ʹ��
			PrintWriter pw = new PrintWriter("pw.txt");
			
			pw.write("hello");
			pw.write("world");
			pw.write("java");
			
			pw.close();
		}
}
