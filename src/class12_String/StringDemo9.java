package class12_String;
/*
 * String�����������:
   1.�滻����
	String replace(char old,char new)
	String replace(String old,String new)
   2.ȥ���ַ�������(ǰ��)�ո�	
	String trim()
   3.���ֵ�˳��(a-z)�Ƚ������ַ���(�ȴ�С)  
	int compareTo(String str)
	int compareToIgnoreCase(String str) 
 */

public class StringDemo9 {
	public static void main(String[] args) {
//	   1.�滻����
//		String replace(char old,char new)
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		System.out.println(s1);
		System.out.println(s2);
//		String replace(String old,String new)
		String s3 = s1.replace("owo", "ak47");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("--------------");
//	   2.ȥ���ַ�������(ǰ��)�ո�	
//		String trim()
		String s4 = " hello world ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");
		System.out.println("s5:" + s5 + "---");
//	   3.���ֵ�˳��(a-z)�Ƚ������ַ���(�ȴ�С)  
//		int compareTo(String str)
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "hdllo";
		String s11 = "hfllo";
		// ��һ����ĸh-h=0����2����ĸ��...���һ����ĸ�ȣ���һ��������0
		System.out.println(s6.compareTo(s7));// 0
		// ��һ����ĸ��ͬ���ڶ�����ĸ��ͬ��ASCII���ֵ���e-d
		System.out.println(s6.compareTo(s10));// 1
		// ��һ����ĸ��ͬ���ڶ�����ĸ��ͬ��ASCII���ֵ���(ǰ��-����)e-f
		System.out.println(s6.compareTo(s11));// -1
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16
//		int compareToIgnoreCase(String str) 
	}
}
