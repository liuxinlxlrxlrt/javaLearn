package class18_Map_TreeMap;

/*
 *  学生：Student
 *  成员变量：name,age
 *  成员方法：无参，带参
 *  成员方法：getxx()setxx()
 *  
 */

public class Student {
	//成员变量
	private String name;
	private int age;

	//构造方法
	//有参构造函数alt+shift+s+o
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//（无参构造函数alt+shift+s+c）
	public Student() {
		super();
	}

	//get和set方法alt+shift+s+r+回车，再回车
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
