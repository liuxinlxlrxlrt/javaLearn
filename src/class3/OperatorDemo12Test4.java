package class3;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ��Ƚ������������Ƿ����
 */

public class OperatorDemo12Test4 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
								
		System.out.println("���������һ������");
		int x = sc.nextInt();
								
		System.out.println("��������ڶ�������");
		int y = sc.nextInt();
								
		//�Ƚ����������Ƿ����
		boolean flag = (x == y);
		System.out.println("flag: "+flag);

	}

}
