package class12_Scanner;

import java.util.Scanner;

/*
 * ���õ�����������
 * 		public int nextInt()����ȡһ��Int���͵�ֵ
 *      public String nextLine()����ȡһ��String���͵�ֵ
 * 
 * �������⣺
 * 		�Ȼ�ȡһ����ֵ���ڻ�ȡһ���ַ��������������  
 * 		��Ҫԭ�򣺾����Ǹ����з��ŵ�����
 * 
 * ��ô����أ�
 * 		A���Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ���
 * 		B�������е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô
 */

public class ScannerDemo3 {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡ����int���͵�ֵ
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a:" + a + ",b:" + b);
		System.out.println("---------------");

		// ��ȡ����String���͵�ֵ
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1:" + s1 + ",s2:" + s2);
		System.out.println("---------------");

		// �Ȼ�ȡһ���ַ������ڻ�ȡһ��intֵ
		String s3 = sc.nextLine();
		int c = sc.nextInt();
		System.out.println("s3:" + s3 + ",c:" + c);
		System.out.println("---------------");

		// �Ȼ�ȡһ��intֵ���ڻ�ȡһ���ַ���
		int d = sc.nextInt();
		String s4 = sc.nextLine();
		System.out.println("d:" + d + ",s4:" + s4);
		// ����ǣ�(d:10,s4: )
		// ��Ϊ�س���-r-n,����S2

		// ��ν���أ�
		// ��ʽһ���Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ���
		int e = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		String s5 = sc2.nextLine();
		System.out.println("e:" + e + ",s5:" + s5);

		// ��ʽ���������е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô
	}
}
