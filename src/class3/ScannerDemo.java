package class3;
/*
 * Ϊ���ó�������ݸ����Ͽ��������ݣ����Ǿͼ����˼���¼�롣
 * �ó�������һ�¡�
 * 
 * ��ô���������ʵ�ּ������ݵ�¼���أ�
 * 		A������
 * 			��ʽ��
 * 				import java.util.Scanner;
 * 			λ�ã�
 * 				��class����
 * 		B����������¼�����
 * 			��ʽ��
 * 				Scanenr sc = new Scanner(System.in);
 * 		C:ͨ�������ȡ���ݣ�
 * 			��ʽ��
 * 				int x = sc.nextInt();
 */

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		 //��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ݣ�");
		int x = sc.nextInt();
		System.out.println("������������ǣ�"+x);
	}
}
