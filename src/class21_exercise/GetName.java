package class21_exercise;
/*
 * ��������һ���ı��ļ��д洢�˼������ƣ�����дһ������ʵ�������ȡһ���˵�����
 * 
 * ������
 * 	A�����ı��ļ������ݴ洢��������
 * 	B���������һ������
 * 	C�����ݸ�������ȡһ��ֵ
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GetName {

	public static void main(String[] args) throws IOException {
		//���ı��ļ������ݴ洢��������
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		ArrayList<String> array = new ArrayList<String>();
		
		String line = null;
		while((line = br.readLine())!=null) {
			array.add(line);
		}
		br.close();
		//�������һ������
		Random r = new Random();
		int index =  r.nextInt(array.size());
		
		//���ݸ�������ȡһ��ֵ
		String name = array.get(index);
		System.out.println("���������ǣ�"+name);
		
		
		
	}

}
