package class11_ObjectCalss;

public class Student4 implements Cloneable{
	private String name;
	private int age;
	
	public Student4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student4(String name, int age) {
		super();
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
