package class14_RegularExpression;
/*
 * �ָ����ϰ
 */

public class regularExpressionDemo04 {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s1 = "aa,bb,cc";

		// ֱ�ӷָ�
		String[] strArray = s1.split(",");

		for (int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]);
		}
		System.out.println("--------------");

		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");

		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("--------------");

		String s3 = "aa    bb       cc";
		String[] str3Array = s3.split(" +");

		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("--------------");
		// Ӳ���ϵ�·��������Ӧ����\\���\
		String s4 = "D:\\1-ѧϰ\\2-Java_Learning_video\\BaiduNetdiskDownload\\day14\\avi";
		String[] str4Array = s4.split("\\\\");

		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
	}
}
