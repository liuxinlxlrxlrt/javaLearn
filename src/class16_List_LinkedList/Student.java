package class16_List_LinkedList;

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

	//get��set����alt+shift+r+�س����ٻس�
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
	
	//��дtoString������alt+shift+s+s
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
