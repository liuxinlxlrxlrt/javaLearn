package class5;

import java.util.Scanner;

/*
 * ������(���ݼ���¼������,���Ҷ�Ӧ����)
 * 		��˼�ǣ�string[] strArray = {"����һ","���ڶ�",...};
 */

public class ArrayDemoTest04 {
	public static void main(String[] args) {
		//����һ���ַ���������
		String[] strArray = {"����һ","���ڶ�","���ڶ�","������","������","������","������","������"};
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������(0-6):");
		int index = sc.nextInt();
		
		System.out.println("��Ҫ���ҵ������ǣ�"+strArray[index]);
	}
	
		public static String getString(String[] strArray,int index) {
				return strArray[index];
		}
}
