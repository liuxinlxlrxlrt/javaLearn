package class3;

import java.util.Scanner;

/*
 * ����¼��������ϰ
 *    ����¼���������ݣ�����������������ͣ��������
 *    ����¼���������ݣ���ȡ�����������е����ֵ
 * 
 */

public class OperatorDemo12Test1 {

	public static void main(String[] args) {
		//����¼���������ݣ�����������������ͣ��������
				//��������¼�����
				Scanner sc = new Scanner(System.in);
				
				System.out.println("���������һ������");
				int x = sc.nextInt();
				
				System.out.println("��������ڶ�������");
				int y = sc.nextInt();
				
				//�Ѽ���¼������ݽ�����Ӽ���
				int sum = (x+y);
				System.out.println("sum:"+sum);

	}

}