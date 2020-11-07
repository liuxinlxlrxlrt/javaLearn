package class21_exercise;
/*
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ������ͨ����Ŀ����˼���ǿ���ָ�����µ�һ������
 * 		ArrayList�����˴洢���ַ���
 * 		����ArrayLsit���ϣ������ݻ�ȡ��
 * 		Ȼ��洢���ı��ļ���
 * 		�ı��ļ�˵��ʹ���ַ���
 * 
 * ����Դ��
 *		ArrayList<String>--���ÿһ���ַ�������
 *Ŀ�ĵأ�
 *		a.txt--FileWriter--BuuuferWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {

	public static void main(String[] args) throws IOException {
		//��װ�����봴�����϶���
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("ab.txt"));
		
		//��������
		for(String s : array) {
			//д����
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
	}

}
