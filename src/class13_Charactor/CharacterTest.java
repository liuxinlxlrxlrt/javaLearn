package class13_Charactor;
/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������������ַ���
 * 
 * ����:
 * 		A����������ͳ�Ʊ���
 * 				int bigCount
 * 				int smallCount
 * 				int numberCount
 * 		B������¼��һ���ַ���
 * 		C�����ַ���ת��Ϊ�ַ�����
 * 		D�������ַ������ȡ��ÿһ���ַ�
 * 		E���жϸ��ַ��ǣ�
 * 				��д��bigCount++;
 * 				Сд��smallCount++;
 * 				���֣�numberCount++;
 * 		F������������
 */

import java.util.Scanner;

public class CharacterTest {
	public static void main(String[] args) {
		// A����������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// ����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = line.toCharArray();

		// �����ַ������ȡ��ÿһ���ַ�
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];

			// �жϸ��ַ�
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}
		// ����������
		System.out.println("��д�ַ���" + bigCount + "��");
		System.out.println("Сд�ַ���" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}
