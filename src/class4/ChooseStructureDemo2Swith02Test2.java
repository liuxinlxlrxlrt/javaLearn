package class4;
/*
 * ģ�ⵥ��ѡ���⡣
 * 
 * ������
 * 		A����һ��ѡ���⣬ȻŶ������ѡ��
 * 		B������¼��ѡ�������
 * 		C������ѡ����������ѡ��Ľ���
 * 
 */

import java.util.Scanner;

public class ChooseStructureDemo2Swith02Test2 {
	public static void main(String[] args) {
		//��һ��ѡ���⣬Ȼ����ѡ��
		//������������û�취����¼��õ�һ��'A','B'
	    //�����Ķ��������Ǿ���65,66������ֵ����
        //�������ǻ�ȡ��������ֵ�Ժ�ǿ��ת��Ϊ�ַ�����		
		System.out.println("����ļ��������˭��");
		System.out.println("65 ��ԲԲ");	
		System.out.println("66 �����");	
		System.out.println("67 ����");	
		System.out.println("68 ��¹��");	
		
		//����¼��ѡ�������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������ѡ��");
		int choiceNumber = sc.nextInt();
		
		//ǿ��ת��Ϊ�ַ�����
		char choice = (char) choiceNumber;
		
		switch(choice) {
				case 'A':
					System.out.println("��ϲ�㣬ѡ����ȷ");
					break;
				case 'B':
					System.out.println("������˼�����ѡ������");
					break;
				case 'C':
					System.out.println("������˼�����ѡ������");
					break;
				case 'D':
					System.out.println("������˼�����ѡ������");
					break;
				default:
					System.out.println("û�и�ѡ��");
					break;
		}
	}
}
