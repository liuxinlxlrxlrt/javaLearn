package class11_ObjectCalss;
/*
 * Object����Object�����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ����
 * �����඼ֱ�ӻ��߼�ӵļ̳��Ը���
 * 
 * Object�ķ���  ��
 *      public int hashCode()�����ظö���Ĺ�ϣ��ֵ
 * 		  ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨�������һ��ֵ�����ֵ�͵�ֵַ�йأ������ǵ�ֵַ
 * 				��������Ϊ��ֵַ
 * 		
 * 		public final Class getClass()
 * 			class��ķ�����
 * 				public String getName()���� String ����ʽ���ش� Class ��������ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ� 
 */

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		//����ǣ�865113938
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		//����ǣ�1442407170
		
		Student s3 = new Student();
		System.out.println(s3.hashCode());
		//����ǣ�1028566121
		System.out.println("---------------");
		Student s4 = new Student();
		Class c = s4.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//��ʽ���
		String str2 = s.getClass().getName();
		System.out.println(str2);
	}
}
