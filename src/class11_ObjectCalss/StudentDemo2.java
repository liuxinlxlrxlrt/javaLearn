package class11_ObjectCalss;
/*
 * public String toString()
 * 
 * Integer���µ�һ����̬����:
 * 		public static String toHexString(int i):��һ������ת��һ��ʮ�����Ʊ�ʾ���ַ���
 * 
 * �����Ϣ��������ǽ�������ˣ����������Ϣ��û���κ�����ģ����Խ����������඼��д�÷���
 * 
 * ��ô��д�أ�
 * 		�Ѹ�������г�Ա����ֵ��ɷ��ؼ���
 * 
 * ��д���Զ��淽�������Զ�����toString()����
 * 
 *ע�⣺
 *   ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()����
 */

public class StudentDemo2 {
	public static void main(String[] args) {
		Student2 s5 = new Student2();
		System.out.println(s5.hashCode());
		System.out.println(s5.getClass());
		System.out.println(s5.getClass().getName());
		System.out.println("-------------");
		System.out.println(s5.toString());
		//����ǣ�class11_ObjectCalss.Student@33909752
		System.out.println("-------------");
		//toString()������ֵ�ȼ�����
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//this.getClass().getName()+'@'+Integer.toHexString(hashCode())
		System.out.println(s5.getClass().getName()+'@'
				+Integer.toHexString(s5.hashCode()));
		System.out.println("-------------");
		System.out.println(s5.toString());
		
		//ֱ��������������
		System.out.println(s5);
	}
}
