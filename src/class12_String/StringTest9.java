package class12_String;
/*
 * �ַ�����ת
 * ����������¼�롰abc��
 * �����cba��
 * 
 * ������
 * 		A����������һ���ַ���
 * 		B�����ű����ַ������õ�ÿһ���ַ�
 * 			a��length()��charAt()���
 * 			b�����ַ���ת�����ַ�����
 * 		C�������ַ�����ÿһ���ַ���ƴ������
 * 		D�������´�
 */

import java.util.Scanner;

public class StringTest9 {

	public static void main(String[] args) {
		//��������һ���ַ���
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
		
		//����һ���ַ���
		String result ="";
		
		//���ַ���ת�����ַ�����
		char[] chs = line.toCharArray();
		
		//���ű����ַ������õ�ÿһ���ַ�
		for(int x=chs.length-1;x>=0;x--) {
			//�����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		//�����ַ�����ÿһ���ַ���ƴ������
		//�����´�
		System.out.println("��ת��Ľ���ǣ�"+result);
		
		//�Ľ�Ϊ����ʵ��
		String s = myReverse(line);
		System.out.println("ʵ�ֹ��ܺ�Ľ���ǣ�"+s);
	}

/*
 * ������ȷ��
 * ����ֵ���ͣ�String
 * �������ͣ�String
 */

public static String myReverse(String s ) {
	//����һ���ַ���
			String result ="";
			
			//���ַ���ת�����ַ�����
			char[] chs = s.toCharArray();
			
			//���ű����ַ������õ�ÿһ���ַ�
			for(int x=chs.length-1;x>=0;x--) {
				//�����ַ�����ÿһ���ַ�ƴ������
				result += chs[x];
			}
			return result;
}
}
