package class4;

import java.util.Scanner;

/*
 * switch����ע�����
 * 	  A:case����ֻ���ǳ����������Ǳ��������ң����
 *    B:default����ʡ����?
 *        ����ʡ�ԡ�һ�㲻���顣��Ϊ���������ǶԲ���ȷ�����������ʾ��
 *        ���������
 *             case���԰�ֵ�̶�
 *             A,B,C,D(��ѡ�����ʱ����Բ�дdefault,���ǲ�����)
 *    C:break����ʡ����?��break���жϵ���˼��
 *       	����ʡ�ԣ����ǽ�����ܲ���������Ҫ��
 *    		�����һ��С����case��͸
 *    		�������ǽ��鲻Ҫʡ�ԣ����һ��break����ʡ�Եģ�
 *    D:defaultһ��Ҫ�������
 *      	���ǣ�����������λ�ã����ǽ��������
 *    E:switch���Ľ�������
 *    		a:����break������
 *    		b:ִ�е����ͽ�����
 */

public class ChooseStructureDemo2Swith02 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
				
		//���Ƽ���¼������
		System.out.println("������һ�����ݣ�1-7����");
		int week = sc.nextInt();
		
		//int num = 3;case����ֻ���ǳ����������Ǳ���
		
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
