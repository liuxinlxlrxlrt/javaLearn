package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���Բ���ָ�����룬
 * ��ת�����������е㳤�����ԣ�java���ṩ�������๩����ʹ��
 * OutputStreamWriter = FileOutputStream+�����(GBK)
 * FileWriter = FileInputString+�����(GBK)
 * 
 * InputStreamReader = FileInputStream++�����(GBK)
 * FileReader = FileInputStream++�����(GBK)
 * 
 * * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 	c:\\a.txt--��ȡ����--ת���ַ���--InputStreamReader--FileReader
 * 
 * Ŀ�ĵأ�
 * 	c.txt--д������--ת���ַ���--OutputStreamWriter--FileWriter
 */
public class CopyFileDemo03 {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileReader fr = new FileReader("a.txt");
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("c.txt");
		
		//��������
		//һ��һ���ַ�
//		int ch = 0;
//		while((ch = fr.read())!= -1) {
//			fw.write(ch);
//			fw.flush();
//		}
		
		//һ��һ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();

	}

}
