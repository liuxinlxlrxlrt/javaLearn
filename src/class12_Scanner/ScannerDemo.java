package class12_Scanner;

import java.util.Scanner;

/*
 * Scanner:JDK5�Ժ����ڻ�ȡ�û��ļ�������
 * 
 * ǰ���ʱ��
 * 			A������
 * 			B����������
 * 			C�����÷���
 * 
 * System������һ����̬���ֶΣ�
 * 		public static final InputStream in;��׼������������Ӧ�ż���¼��
 * 
 * 		InputStream is = System.in;
 * 
 * class Demo{
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * 
 * int y = Demo.x;
 * Student s = Demo.s 
 * 
 * ���췽����
 * 		Scanner(InputStream source) 
 */

public class ScannerDemo {
	public static void main(String[] args) {
		//��������
		//System.in: System��һ���࣬in�Ǳ���������Ӧ����in()����۸�()���Ƿ�����
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("x"+x);
	}
}
