package class17_Set_TreeSet;
/*
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A���������������
 * 		B������һ��Set����
 * 		C���жϼ��ϳ����ǲ���С��10
 * 				�ǣ��ʹ���һ����������
 * 				�񣺲�������
 * 		D:����Set����
 */

import java.util.HashSet;
import java.util.Random;

public class HashSetDemoHW {
	public static void main(String[] args) {
		//�������������
		Random r = new Random();
		
		//����һ��Set����
		HashSet<Integer> ts = new HashSet<Integer>();
		
		//�жϼ��ϳ����ǲ���С��10
		while(ts.size()<10) {
			int num = r.nextInt(20)+1;
			ts.add(num);
		}
		//����Set����
		for(Integer i: ts) {
			System.out.println(i);
			}
		}
		
}
