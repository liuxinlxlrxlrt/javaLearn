package class3;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ���ȡ�����������е����ֵ
 */

public class OperatorDemo12Test3 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
								
		System.out.println("���������һ������");
		int x = sc.nextInt();
								
		System.out.println("��������ڶ�������");
		int y = sc.nextInt();
		
		System.out.println("�����������������");
		int z = sc.nextInt();
								
		//��ȡ�����������е����ֵ
		int temp = ((x > y)?x :y);
		int max1 = (temp > z?temp:z);
		System.out.println("max1:"+max1);
		System.out.println("-----------------------------");
		
		int max2 = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("max2:"+max2);

	}

}
