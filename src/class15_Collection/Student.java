package class15_Collection;

/*
 *  学生：Student
 *  成员变量：name,age
 *  成员方法：无参，带参
 *  成员方法：getxx()setxx()
 *  
 */

public class Student {
	// 成员变量
	private String name;
	private int age;

	// 构造方法
	// 有参构造函数alt+shift+s+o
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// （无参构造函数alt+shift+s+c）
	public Student() {
		super();
	}

	// get和set方法alt+shift+s+r+回车，再回车
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

	// 重写toString方法，alt+shift+s+s
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// 重写hashCode()和equals()方法，alt+shift+s+h
//	@Override(不要)
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

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
