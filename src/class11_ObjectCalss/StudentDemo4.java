package class11_ObjectCalss;
/*
 * protected void finalize():������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷���,�����������գ�����ʲôʱ����ղ�ȷ����
 * 
 *  protected Object clone()�����������ش˶����һ��������
 *		A:��д�÷���
 *
 *Cloneable:����ʵ���� Cloneable �ӿڣ���ָʾ Object.clone() �������ԺϷ��ضԸ���ʵ�����а��ֶθ��ơ�
 *		����ӿ��Ǳ�ǽӿڣ���������ʵ�ָýӿڵ���Ϳ���ʵ�ֶ���ĸ�����
 */

public class StudentDemo4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// ����ѧ������
		Student4 s = new Student4();
		s.setName("������");
		s.setAge(25);
		// ��¡ѧ������
		Object obj = s.clone();
		Student4 s2 = (Student4) obj;
		System.out.println("---------------");
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		// ��ǰ������
		Student4 s3 = s;
		System.out.println(s3.getName() + "---" + s3.getAge());
		System.out.println("---------------");
		// ��ʵ���������
		s3.setName("��Ƹ��");
		s3.setAge(26);
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println(s3.getName() + "---" + s3.getAge());
	}
}
