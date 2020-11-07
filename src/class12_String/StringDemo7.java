package class12_String;
/*
 * String��Ļ�ȡ����:
		int length()����ȡ�ַ����ĳ���
		char charAt(int index)����ȡָ������λ�õ��ַ�
		int indexOf(int ch)������ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
			Ϊʲô������Int���ͣ�������char���� 
			ԭ��'a'��97��ʵ�����Դ���'a'
		int indexOf(String str)������ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		int indexOf(int ch,int fromIndex)������ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		int indexOf(String str,int fromIndex)������ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		String substring(int start)����ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
		String substring(int start,int end)����ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���

 */

public class StringDemo7 {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "helloworld";

		// int length()����ȡ�ַ����ĳ���
		System.out.println("s.length:" + s.length());
		System.out.println("---------------");

		// char charAt(int index)����ȡָ������λ�õ��ַ�
		System.out.println("s.charAt:" + s.charAt(7));
		System.out.println("---------------");

		// int indexOf(int ch)������ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("s.indexOf:" + s.indexOf('l'));
		System.out.println("---------------");

		// int indexOf(String str)������ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("s.indexOf:" + s.indexOf("owo"));// ��������ĸ������
		System.out.println("---------------");

		// int indexOf(int ch,int fromIndex)������ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("s.indexOf:" + s.indexOf('o', 5));
		System.out.println("s.indexOf:" + s.indexOf('k', 5));// -1
		System.out.println("s.indexOf:" + s.indexOf('o', 40));// -1
		System.out.println("---------------");

		// int indexOf(String str,int fromIndex)������ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("s.indexOf:" + s.indexOf("owo", 4));
		System.out.println("s.indexOf:" + s.indexOf("kjm", 5));// -1
		System.out.println("s.indexOf:" + s.indexOf("owo", 40));// -1
		System.out.println("---------------");

		// String substring(int start)����ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ������start
		System.out.println("s.substring:" + s.substring(5));// ����5,world
		System.out.println("s.substring:" + s.substring(0));// ����0,helloworld
		// StringIndexOutOfBoundsException
		// System.out.println("s.substring:"+s.substring(40));
		System.out.println("---------------");

		// String substring(int start,int end)����ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���,����start�������ǲ�����end����
		System.out.println("s.substring:" + s.substring(3, 8));// ����3������8,//lowor
		System.out.println("s.substring:" + s.substring(0, s.length()));// helloworld
	}
}
