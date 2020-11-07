package class22_Properties;
/*
 * ����ļ��ϱ�����Properties���ϣ�
 * public void load(Reader reader)�����ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comments)���Ѽ����е����ݴ洢���ļ�
 * 
 * ��������Ϸ��
 * 		�ٶȱ���ͼ���
 * 		����������������־
 * 		
 * 		¬��=1
 * 		���컭�=1
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo03 {
	public static void main(String[] args) throws IOException {
			myload();
			myStore();
		
	}

	private static void myStore() throws IOException {
		//������϶���
		Properties prop = new Properties();
		
		prop.setProperty("��������", "25");
		prop.setProperty("�·���", "27");
		prop.setProperty("���ʶ�", "26");
		System.out.println("prop"+prop);
		//public void store(Writer writer,String comments)���Ѽ����е����ݴ洢���ļ�
		Writer w = new FileWriter("name.txt");
//		prop.store(w, "null");
//		prop.store(w, "����");
		prop.store(w, "display");
		w.close();
		
	}

	private static void myload() throws IOException {
		Properties prop = new Properties();
		
		//public void load(Reader reader)�����ļ��е����ݶ�ȡ��������
		//ע�⣺����ļ������ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();
		
		System.out.println("prop:"+prop);
	}
}
