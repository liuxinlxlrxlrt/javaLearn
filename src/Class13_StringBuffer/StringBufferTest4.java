package Class13_StringBuffer;
/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 *����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 *
 *������
 *�ж�һ���ַ����Ƿ�Գƣ���ֻ��Ҫ��
 *	��һ�������һ���Ƚ�
 *	�ڶ����͵����ڶ����Ƚ�
 *	...
 *	�ȽϵĴ����ǳ��ȳ���2
 */

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.ISO;

public class StringBufferTest4 {

	public static void main(String[] args) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		// һ��һ���Ƚ�
		boolean b = isSame(s);
		System.out.println("b��" + b);

		// ��StringBuffer�ķ�ת����
		boolean b2 = isSame(s);
		System.out.println("b2��" + b2);

	}

	public static boolean isSame2(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);

	}

	// һ��һ���Ƚ�
//	public static boolean isSame(String s) {
//		//���ַ���ת�����ַ�����
//		char[] chs =s.toCharArray();
//		
//		for(int start=0,end=chs.length-1;start<end;start++;end--) {
//			if(chs[start]!=chs[end]) {
//				return false;
//			}
//		}
//		return true;
//	}
	public static boolean isSame(String s) {
		boolean flag = true;
		// ���ַ���ת�����ַ�����
		char[] chs = s.toCharArray();

		for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
			if (chs[start] != chs[end]) {
				flag = false;
			}
		}
		return flag;
	}
}
