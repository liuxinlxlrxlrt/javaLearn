package class18_Map_TreeMap;

/*
 *  ѧ����Student
 *  ��Ա������name,age
 *  ��Ա�������޲Σ�����
 *  ��Ա������getxx()setxx()
 *  
 */

public class Student {
	//��Ա����
	private String name;
	private int age;

	//���췽��
	//�вι��캯��alt+shift+s+o
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//���޲ι��캯��alt+shift+s+c��
	public Student() {
		super();
	}

	//get��set����alt+shift+s+r+�س����ٻس�
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
