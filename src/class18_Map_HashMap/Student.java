package class18_Map_HashMap;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
