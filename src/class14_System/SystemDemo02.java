package class14_System;
/*
 * System �����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 * 
 * ��Ա������
 * public static void gc()����������������
 * public static void exit(int status)����ֹ���е�ǰ�������е�JAVA���������������״̬�룺���ݹ�������0��״̬��ʾ�쳣��ֹ
 * public static long currentTimeMillis()�������Ժ���Ϊ��λ�ĵ�ǰʱ��
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDemo02 {
	public static void main(String[] args) {
//		System.out.println("����ϲ�������");
//		System.exit(0);
//		System.out.println("����Ҳϲ����֮��");
		// ���������ϲ�������
//		System.out.println("----------------");

		System.out.println(System.currentTimeMillis());

		// �����õ�������ʱ�����岻��
		// ��ô����������ʲô���أ�
		// �������Ҹ���ͳ����γ��������ʱ��
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();

		System.out.println("����ʱ" + (end - start) + "����");
	}
}
