package class4;

/*
 * switch����ʽ��
 *     switch(���ʽ) {
 *	      case ֵ1��
 *			�����1;
 *			break;
 *		    case ֵ2��
 *			�����2;
 *			break;
 *		    ��
 *		    default��	
 *			�����n+1;
 *			break;
 *    }
 *    
 * ��ʽ����:
 *     switch��ʾ����switch���
 *     ���ʽ��ȡֵ��byte,short,int,char
 *     JDK5�Ժ������ö��
 *     JDK7�Ժ�������ַ���String
 *     case���������Ҫ�ͱ��ʽ���бȽϵ�ֵ
 *     ����岿�ֿ�����һ����������
 *     break��ʾ�жϣ���������˼�����Խ���switch���
 *     default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else����
 *     
 *�����⣺
 *    byte������Ϊswith�ı��ʽ �𣿿���
 *    long������Ϊswith�ı��ʽ �𣿲�����
 *    string������Ϊswith�ı��ʽ �𣿿��ԣ�JDK7�Ժ�������ַ���
 *    
 *  ������
 *      ����¼��һ������:����������ݣ����������Ӧ�����ڣ�
 *         ����¼��1����Ӧ�������һ��
 *         ������
 *         ����¼��7����Ӧ��������գ�
 *         
 * ������
 *    1.����¼�룬��Scannerʵ��
 *    2.�ж����Ǽȿ���ʹ��if��� ��Ҳ����ʹ������Ҫ�����swith���
 * 
 * ע��:
 *    A:���������������һ��tab��λ��
 *    B:�������Ǻܴ��������
 */

import java.util.Scanner;

public class ChooseStructureDemo2Swith01 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ�����ݣ�1-7����");
		int week = sc.nextInt();
		
		//swith�ж����
		switch(week){
			case 1:
			System.out.println("����һ");
			break;
			case 2:
			System.out.println("���ڶ�");
			break;
			case 3:
			System.out.println("������");
			break;
			case 4:
			System.out.println("������");
			break;
			case 5:
			System.out.println("������");
			break;
			case 6:
			System.out.println("������");
			break;
			case 7:
			System.out.println("������");
			break;
			default:
		    System.out.println("���������������");	
			break;	
		}
	}
}
