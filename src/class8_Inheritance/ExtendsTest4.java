package class8_Inheritance;
/*
 * ѧ����������ʦ��������
 * 
 * ѧ����
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 *  ��ʦ��
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 * 
 * ������������ĳ�Ա�������˺ܶ���ͬ�Ķ������������ǾͿ��ǳ�ȡһ�����Ե���
 * �ˣ�
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 * 
 *  ѧ�� �̳� ��
 *  ��ʦ �̳� ��
 */
//��������
class Person2{
	//����
		private String name;
		//����
		private int age;
		
		public Person2 () {
		}
		
		public Person2(String name,int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}

class Student11 extends Person2{
	public Student11() {}
	
	public Student11(String name,int age) {
//		this.name = name;
//		this.age = age;
		super(name,age);
	}
}
class Teacher11 extends Person2{
	public Teacher11() {}
	public Teacher11(String name,int age) {
//		this.name = name;
//		this.age = age;
		super(name,age);
	}
}

public class ExtendsTest4 {
	public static void main(String[] args) {
		//����ѧ�����󲢲���
		//��ʽһ
		Student11 s1 = new Student11();
		s1.setName("�ջ���");
		s1.setAge(25);
		System.out.println(s1.getName()+"-"+s1.getAge());
		//��ʽ��
		Student11 s2 = new Student11("��ӭѩ",22);
		System.out.println(s2.getName()+"-"+s2.getAge());
		
		//������ʦ���󲢲���
		//��ʽһ
		Teacher11 t1 = new Teacher11();
		s1.setName("�ż���");
		s1.setAge(21);
		System.out.println(s1.getName()+"-"+s1.getAge());
		//��ʽ��
		Teacher11 t2 = new Teacher11("������",23);
		System.out.println(s2.getName()+"-"+s2.getAge());
	}
}
