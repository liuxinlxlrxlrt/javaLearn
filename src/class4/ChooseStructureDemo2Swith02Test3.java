package class4;

/*���������¼����ַ������ж��Ƿ�������Ҫ��ĵģ�����о������
 *������ʾ����
 *String s = sc.nextLine();
 */

import java.util.Scanner;

public class ChooseStructureDemo2Swith02Test3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("��������Ҫ�жϵ��ַ�����");
		String s = sc.nextLine();
		
		switch(s) {
		 	case "hello":
		 		System.out.println("���������hello");		 		
		 		break;
		 	case "world":
		 		System.out.println("���������world");
		 		break;
		 	case "java":
		 		System.out.println("���������java");
		 		break;
		 	default:
		 		System.out.println("û���ҵ������������");
		 		break;
		}
	}
}
