package class7;

/*
 * ��׼�Ĵ���Ľ���
 * 
 * this:�ĸ���������Ǹ�������this�ʹ����Ǹ�����
 */
class Student05 {
	private String name;
	private int age;

	public String getName() {
		return name;// ������ʵ������this
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// age =age;
		this.age = age;
	}
}

public class StudentThisTest02 {
	public static void main(String[] args) {
		// ����һ������
		Student05 s1 = new Student05();
		s1.setName("�����");
		s1.setAge(26);
		System.out.println(s1.getName() + "..." + s1.getAge());

		// �����ڶ�������
		Student05 s2 = new Student05();
		s2.setName("١����");
		s2.setAge(28);
		// ��ȡ����
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}
