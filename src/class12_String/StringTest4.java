package class12_String;

import java.util.Scanner;

/*
 * ����ͳ��һ���ַ������д�д��ĸ�ַ���Сд��ĸ�ַ������ֳ��ֵĴ����������������ַ���
 *������
 *		��Hello123World��
 *
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 * 
 * ������
 * 		A��������ͳ�Ʊ���
 * 			bigCount = 0;
 * 			smallCount = 0;
 * 			numberCount = 0;
 * 		B�������ַ������õ�ÿһ���ַ�
 * 			length()��charAt()���
 * 		C���жϸ��ַ������������������͵�
 * 			��bigCount++
 * 			С��smallCount++
 * 			���֣�numberCount++
 * 
 * 		�����Ŀǰ�ѵ��������ж�ĳ���ַ��Ǵ�ģ�С�Ļ���������
 * 		ASCII���
 * 			0  48
 * 			A  65
 * 			a  97
 * 
 * 		��Ȼ�����ǰ������ֵ����ֱȽ��ǿ��Եģ�����������ˣ��б�������򵥵�
 * 			char ch = s.charAt(x);
 * 			>=��<=��+��-��*��/��ʱ��char�������Ȼ�ת��int����
 * 			if(ch>='0'&& ch<='9') numberCount++
 * 			if(ch>='a'&& ch<='z') smallCount++
 *			if(ch>='A'&& ch<='Z') bigCount++
 *		D������������
 * 
 * 
 * ��ϰ���Ѹ����ַ�����ʽ���Ľ�Ϊ����¼�뷽ʽ
 */

public class StringTest4 {
	public static void main(String[] args) {
		 //����һ���ַ���
		 String s = "Hello123World";
		
		//����¼��
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�������д��Сд���������ֶ��е��ַ�����");
//		String s = sc.nextLine();
		 
		//��������ͳ�Ʊ���
		 int bigCount = 0;
		 int smallCount = 0;
		 int numberCount = 0;
		 
		 //�����ַ������õ�ÿһ���ַ�
		 for(int x=0;x<s.length();x++) {
			 char ch = s.charAt(x);
			 
			 //�жϸ��ַ������������������͵�
			 if(ch>='0'&& ch<='9') {
				 numberCount++;
			}else if(ch>='a'&& ch<='z') {
				smallCount++;
			}else if(ch>='A'&& ch<='Z') {
				bigCount++;
			}
		 }
		 //������
		 System.out.println("��д��ĸ"+bigCount+"��");
		 System.out.println("Сд��ĸ"+smallCount+"��");
		 System.out.println("����"+numberCount+"��");
	}
}
