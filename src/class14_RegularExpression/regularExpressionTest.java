package class14_RegularExpression;
/*
 * ��������һ���ַ���:��91 27 46 38 50��
 * ��д����ʵ�������������ǣ���27 38 46 50 91��
 * 
 * ������
 * 		A������һ���ַ���
 * 		B�����ַ������зָ�õ�һ���ַ�������
 * 		D�����ַ�������任��Int����
 * 		C����Int��������
 * 		E������������������װ���ַ���	
 */

import java.util.Arrays;

public class regularExpressionTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "91 27 46 38 50";
		
		//���ַ������зָ�õ�һ���ַ�������
		String[] strArray = s.split(" ");
		
		//���ַ�������任��Int����
		int [] arr =new int[strArray.length];
		
		for(int x=0;x<arr.length;x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//��Int��������
		Arrays.sort(arr);
		
		//����������������װ���ַ���
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<arr.length;x++) {
			sb.append(arr[x]).append(" ");
		}
		//ת��Ϊ�ַ���
		String result = sb.toString().trim();
		
		//����ַ���
		System.out.println("result��"+result);
	}
}
