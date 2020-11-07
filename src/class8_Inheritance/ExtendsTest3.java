package class8_Inheritance;

/*
 * 学生案例和老师案例讲解
 * 
 * 学生：
 * 	  成员变量：姓名，年龄
 * 	 构造方法：无参,带参
 * 	 成员方法：getXxx()/setXxx()
 *  老师：
 * 	  成员变量：姓名，年龄
 * 	 构造方法：无参,带参
 * 	 成员方法：getXxx()/setXxx()
 */
//定义学生类
class Student10 {
	// 姓名
	private String name;
	// 年龄
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

//定义老师类
class Teacher10 {
	// 姓名
	private String name;
	// 年龄
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
		// 创建学生对象并测试
		// 方式一
		Student10 s1 = new Student10();
		s1.setName("陶慧敏");
		s1.setAge(25);
		System.out.println(s1.getName() + "-" + s1.getAge());
		// 方式二
		Student10 s2 = new Student10("张迎雪", 22);
		System.out.println(s2.getName() + "-" + s2.getAge());

		// 创建老师对象并测试
		// 方式一
		Teacher10 t1 = new Teacher10();
		s1.setName("张嘉倪");
		s1.setAge(21);
		System.out.println(s1.getName() + "-" + s1.getAge());
		// 方式二
		Teacher10 t2 = new Teacher10("张梓琳", 23);
		System.out.println(s2.getName() + "-" + s2.getAge());
	}
}
