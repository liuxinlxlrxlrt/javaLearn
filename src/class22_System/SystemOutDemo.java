package class22_System;

import java.io.PrintStream;

/*
 * ��׼���������
 * System����������Ա������
 *		//��ͨ������ȥ���ʾ�̬���εĳ�Ա������������ʲô���ͣ�����ֵ����ʲô����
 * 		public static final InputStream in����׼������
 * 		public static final PrintStream out����׼�����
 * 
 * 		InputStream in = System.in
 * 		PrintStream ps = System.out
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		//������Ľ���ʲô��֪���ˣ������������ʵ������IO�����������������������̨
		System.out.println("helloworld");
		
		//���ʾ��ȡ��׼���������
		PrintStream ps = System.out;
		ps.println("helloworld");
		
		ps.println();
//		ps.print();//�������������
//		System.out.println();
//		System.out.print();
				
	}
}
