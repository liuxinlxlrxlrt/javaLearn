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
 */
//����ѧ����
class Student10 {
	// ����
	private String name;
	// ����
	private int age;

	public Student10() {
	}

	public Student10(String name, int age) {
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

//������ʦ��
class Teacher10 {
	// ����
	private String name;
	// ����
	private int age;

	public Teacher10() {
	}

	public Teacher10(String name, int age) {
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

public class ExtendsTest3 {
	public static void main(String[] args) {
		// ����ѧ�����󲢲���
		// ��ʽһ
		Student10 s1 = new Student10();
		s1.setName("�ջ���");
		s1.setAge(25);
		System.out.println(s1.getName() + "-" + s1.getAge());
		// ��ʽ��
		Student10 s2 = new Student10("��ӭѩ", 22);
		System.out.println(s2.getName() + "-" + s2.getAge());

		// ������ʦ���󲢲���
		// ��ʽһ
		Teacher10 t1 = new Teacher10();
		s1.setName("�ż���");
		s1.setAge(21);
		System.out.println(s1.getName() + "-" + s1.getAge());
		// ��ʽ��
		Teacher10 t2 = new Teacher10("������", 23);
		System.out.println(s2.getName() + "-" + s2.getAge());
	}
}
