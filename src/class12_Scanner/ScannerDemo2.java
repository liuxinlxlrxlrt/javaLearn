package class12_Scanner;

import java.util.Scanner;

/*
 * ������ʽ��
 * 		public boolean hasNextXxx();�ж��Ƿ���ĳ�����͵�Ԫ��
 * 		public Xxx nextXxx();��ȡ��Ԫ��
 * 
 * ��������int���͵ķ�������
 * 		public boolean hasNextInt()
 * 		public Int nextInt()
 */

public class ScannerDemo2 {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��ȡ����
		if(sc.hasNextInt()) {
		int x = sc.nextInt();
		System.out.println("x"+x);
		}else {
			System.out.println("���������������");
		}
	}
}
