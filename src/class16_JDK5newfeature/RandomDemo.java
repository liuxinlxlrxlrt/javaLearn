package class16_JDK5newfeature;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ��
 * ��������ʹ�ü���ʵ��
 * 
 * ������
 * 		A����������������Ķ���
 * 		B������һ���洢������ļ���
 * 		C������һ��ͳ�Ʊ�������0��ʼ
 * 		D���ж�ͳ�Ʊ����Ƿ�С��10
 * 				�ǣ��Ȳ���һ����������жϸ�������Ƿ����
 * 						��������ڣ�����ӣ�ͳ�Ʊ���++
 * 						������ڣ��Ͳ�������
 * 				�񣺲�������
 * 		E����������
 */

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// ��������������Ķ���
		Random r = new Random();

		// ����һ���洢������ļ���
		ArrayList<Integer> array = new ArrayList<Integer>();

		// ����һ��ͳ�Ʊ�������0��ʼ
		int count = 0;

		// �ж�ͳ�Ʊ����Ƿ�С��10
		while (count < 10) {
			// r.nextInt(20)������0-19
			int number = r.nextInt(20) + 1;

			// �жϸ�������Ƿ����
			if (!array.contains(number)) {
				// ��������ڣ�����ӣ�ͳ�Ʊ���++
				array.add(number);
				count++;
			}
		}
		// ��������
		for (Integer i : array) {
			System.out.println(i);
		}
	}
}
