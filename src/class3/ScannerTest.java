package class3;
/*
 * ����¼����ϰ��
 * 		����¼���������ݣ�����������������ͣ��������
 */

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//����¼���������ݣ�����������������ͣ��������
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		//�Ѽ���¼���������Ӽ���
		int sum = (x + y);
		System.out.println("sum"+sum);
	}
}
