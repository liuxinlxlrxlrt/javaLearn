package class3;
/*
 * ����¼����ϰ��
 *		����¼���������ݣ���ȡ�����������е����ֵ
 */

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		//��ȡ����������е����ֵ
		int max = (a > b)?a:b;
		System.out.println("max"+max);
	}
}
