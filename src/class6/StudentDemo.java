package class6;
/*
 * ��һ��java�ļ���д�����ࣺһ���������࣬һ��������
 * ע�⣺�ļ����Ͳ�����һ��
 * 
 * ���ʹ���أ�
 * 	 	��������ʹ��
 * 
 * ���紴�������أ�
 * 		��ʽ������  ������ = new ����();
 * 
 * ���ʹ�ó�Ա�����أ�
 * 		������.������
 * ���ʹ�ó�Ա�����أ�
 * 		������.������
 */

public class StudentDemo {
	public static void main(String[] args) {
		//��ʽ������  ������ = new ����();
		Student  s = new Student();
		
		//�����Ա����ֵ
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.address);
		//�Ľ�д��
		System.out.println(s.name+"..."+s.age+"..."+s.address);
		
		//����Ա������ֵ
		s.name ="�ܱ^�";
		s.age = 23;
		s.address = "����";
		//��ֵ������
		System.out.println(s.name+"..."+s.age+"..."+s.address);
		
		//���÷���
		s.study();
		s.eat();
		s.sleep();
	}
}
