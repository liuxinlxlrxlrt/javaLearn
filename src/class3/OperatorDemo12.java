package class3;

import java.util.Scanner;

/*
 * Ϊ���ó�������Ͽ��������ݣ����Ǽ����˼���¼��
 * �ó�������һ��
 * 
 * ��ô���������ʵ�ּ���¼���أ�
 *    A������
 *       ��ʽ����import java.util.Scanner;
 *       λ�ã�
 *       ��class����
 *    B:��������¼�����
 *       ��ʽ��
 *       Scanner sc = new Scanner(System.in);
 *    C:ͨ�������ȡ����
 *       ��ʽ��  
 *        int x = sc.nextInt();
 *        
 *     
 * 
 */

public class OperatorDemo12 {

	public static void main(String[] args) {
		//��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);
        
		System.out.println("��������һ������");
		int x = sc.nextInt();
		System.out.println("������������ǣ�"+x);
	}

}
