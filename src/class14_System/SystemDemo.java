package class14_System;
/*
 * System �����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 * 
 * ��Ա������
 * public static void gc()����������������
 * public static void exit(int status)
 * public static long currentTimeMillis()
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("�����", 26);
		System.out.println(p);

		p = null;// ��p����ָ����ڴ�
		System.gc();
	}
}
