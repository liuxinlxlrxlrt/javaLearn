package class14_Math;
/*
 * ���������һ������������ʵ�ֻ�ȡ���ⷶΧ�������
 * 
 * ������
 * 		A������¼��������
 */

import java.util.Scanner;

public class MathDemo02 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = sc.nextInt();
		System.out.println("�������������");
		int end = sc.nextInt();

		for (int x = 0; x < 100; x++) {
			// ���ù���
			int num = getRandom(start, end);
			// ������
			System.out.println(num);
		}
	}

	/*
	 * дһ�����ܣ�
	 *  ������ȷ�� 
	 * ����ֵ���ͣ�int 
	 * �����б�int start,int end
	 */
	public static int getRandom(int start, int end) {
		// �������ǽ�����1-100֮��������
//		int number = (int)(Math.random())*100)+1;
//		int number = (int)(Math.random()*end)+start;
		// �����������ˣ���ô���أ�
		int number = (int) (Math.random() * (end - start + 1)) + start;

		return number;
	}
}
