package class8;

import java.util.Random;

/*
 * Math�����������ִ�л�����ѧ����ķ���
 * 
  * ����Math��java.lang�£����Բ���Ҫ����
 * �ص㣺
 * 	û�й��췽������Ϊ���ĳ�Աȫ���Ǿ�̬�ġ�
 * 
 * �����и�������
 * 		��ȡ�����
 * 		public static double random()
 * 		���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0������ֵ��һ��α���ѡ�����
 */

public class MathDemo {
	public static void main(String[] args) {
		//��ȡ�����
		double d = Math.random();
		System.out.println(d);
		
		//������Ҫȡһ��1-100֮������������ô�죿
		//������ķ�Χ�Ǵ��ڵ��� 0.0 ��С�� 1.0�����������*100�ķ�Χ��0-99
		//����ȡһ��1-100֮�����������������*100��+1
		for(int x=0;x<100;x++) {
			int number = (int)(Math.random()*100)+1;
			System.out.println(number);	
		}
	}
}
