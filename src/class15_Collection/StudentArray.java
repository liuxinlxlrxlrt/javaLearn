package class15_Collection;

public class StudentArray {
	// 成员变量
	private String name;
	private int age;

	// 构造方法
	public StudentArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentArray(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 成员方法
	// getXxx()/setXxx()
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
	public String toString() {
		return "StudentArray [name=" + name + ", age=" + age + "]";
	}
}
