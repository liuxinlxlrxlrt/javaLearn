package class4;

import java.util.Scanner;

/*��switch���ʵ�ּ���¼���·ݣ������Ӧ�ļ���
 * 
 * ������
 * 		A������¼��һ���·ݣ���scannerʵ��
 * 		B����switch���ʵ�ּ���
 * 
 * if�����switch��������
 * 		if���ʹ�ó�����
 *    		��Խ����boolean���͵��жϣ�switch������boolean�жϣ�byte,short,char,int,ö�٣���
 *			���һ����Χ���жϣ�90-1000֮�䣬92.5��switch��������
 *			��Լ�������ֵ���ж�
 *		switch���ʹ�ó�����
 *			��Լ�������ֵ���жϣ������̶�ֵ�����ڣ���ѡ��������һ����Χ���ж�switch���������ÿ���
 */

public class ChooseStructureDemo2Swith02Test4 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("��¼���·�(1-12):");
		int month = sc.nextInt();
		
		/*switch(month) {
		 		case 1:
		 			System.out.println("����");
		 			break;
		 		case 2:
		 			System.out.println("����");
		 			break;
		 		case 3:
		 			System.out.println("����");
		 			break;
		 		case 4:
		 			System.out.println("����");
		 			break;
		 		case 5:
		 			System.out.println("����");
		 			break;
		 		case 6:
		 			System.out.println("�ļ�");
		 			break;
		 		case 7:
		 			System.out.println("�ļ�");
		 			break;
		 		case 8:
		 			System.out.println("�ļ�");
		 			break;
		 		case 9:
		 			System.out.println("�＾");
		 			break;
		 		case 10:
		 			System.out.println("�＾");
		 			break;
		 		case 11:
		 			System.out.println("�＾");
		 			break;
		 		case 12:
		 			System.out.println("����");
		 			break;
		 		default:
		 			System.out.println("��������·�����");
		 			break;
	           }*/
		//����д̫�鷳�ˣ�����ʹ��һ�����ǲ�̫��ʹ�õĶ�������͸
		
	switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		default:
			System.out.println("��������·�����");
			break;
	  }
	}
}
