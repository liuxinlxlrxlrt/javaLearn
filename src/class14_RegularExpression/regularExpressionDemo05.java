package class14_RegularExpression;
/*
 * �滻����
 * public String replaceAll(String regex,String replacement)
 * ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ���
 */

public class regularExpressionDemo05 {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "helloqq12345worldkh622112345678java";

		// ��Ҫȥ�����е����֣���*�滻��
		// ��\\d+����ʾ��������һ�����Ͼ͸�һ�š�*��
		String regex1 = "\\d+";
		// ��\\d+����ʾ�������־͸�һ�š�*��
		String ss = "*";
		String result1 = s.replaceAll(regex1, ss);
		System.out.println("result1��" + result1);
		// result1��helloqq*worldkh*java
		System.out.println("------------------");
		// ��\\d+����ʾ�������־͸�һ�š�*��
		String regex2 = "\\d";
		String result2 = s.replaceAll(regex2, ss);
		System.out.println("result2��" + result2);
		// result2��helloqq*****worldkh************java
		System.out.println("------------------");
		// �����ָɵ�
		String regex3 = "\\d+";
		String sss = "";
		String result3 = s.replaceAll(regex3, sss);
		System.out.println("result3��" + result3);
		// result3��helloqqworldkhjava
	}
}
