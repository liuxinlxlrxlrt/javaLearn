package class3;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ���ȡ�����������е����ֵ
 */

public class OperatorDemo12Test2 {

	public static void main(String[] args) {
		//����¼���������ݣ���ȡ�����������е����ֵ
		//��������¼�����
		Scanner sc = new Scanner(System.in);
						
		System.out.println("���������һ������");
		int x = sc.nextInt();
						
		System.out.println("��������ڶ�������");
		int y = sc.nextInt();
						
		//�Ѽ���¼������ݽ�����Ӽ���
		int max = (x>y)?x:y;
		System.out.println("max:"+max);
	}

}
