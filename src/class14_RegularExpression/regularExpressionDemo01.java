package class14_RegularExpression;
/*
 * ������ʽ������һ��������ַ���
 */

import java.util.Scanner;

public class regularExpressionDemo01 {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������QQ���룺");
		String qq = sc.nextLine();

		System.out.println("cheakQQ��" + cheakQQ(qq));
	}
	public static boolean cheakQQ(String qq) {
//		String regex = "[1-9] [0-9] {4,14}";
		
		//public boolean matches(String regex)
		//��֪���ַ����Ƿ�ƥ�������������ʽ��
//		boolean flag = qq.matches(regex);
//		return flag;
		
//		return qq.matches("[1-9] [0-9] {4,14}");
		return qq.matches("^[1-9] \\d{4,14}");
	}
}
