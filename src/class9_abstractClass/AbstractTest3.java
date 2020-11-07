package class9_abstractClass;
/*
 * 学生案例
			具体事务：基础班学员，就业班学员
			共性：姓名，年龄，班级，学习，吃饭
			
     * 分析：从具体到抽象
 * 		基础班的老师：
 * 			成员变量：姓名，年龄，班级
 * 			构造方法：无参，带参
 * 			成员方法：学习和吃饭
 * 		就恶意班的老师：
 *  		成员变量：姓名，年龄，班级
 * 			构造方法：无参，带参
 * 			成员方法：学习和吃饭
 * 
 * 		得到一个学员类：
 *  		成员变量：姓名，年龄，班级
 * 			构造方法：无参，带参
 * 			成员方法：学习和吃饭
 * 
 * 实现：
 * 		学员类：
 * 		基础班学员
 * 		就业班学员
 */

abstract class Student {
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 班级
	private String grade;

	public Student() {
	}

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// 学习
	public abstract void study();

	// 吃饭
	public void eat() {
		System.out.println("学习累了，就该吃饭了");
	}
}

//基础班学员类
class BasicStudent extends Student {
	public BasicStudent() {
	}

	public BasicStudent(String name, int age, String grade) {
		super(name, age, grade);
	}

	public void study() {
		System.out.println("基础班学员学习的是JavaSe");
	}
}

//就业班学员类
class WrokStudent extends Student {
	public WrokStudent() {
	}

	public WrokStudent(String name, int age, String grade) {
		super(name, age, grade);
	}

	public void study() {
		System.out.println("就业班学员学习的是JavaEE");
	}
}

public class AbstractTest3 {
	public static void main(String[] args) {
		// 我仅仅测试基础班学员
		// 按照多态的方式测试
		Student s = new BasicStudent();
		s.setName("余声");
		s.setAge(21);
		s.setGrade("1111");
		System.out.println(s.getName() + "-" + s.getAge() + "-" + s.getGrade());
		s.study();
		s.eat();

		System.out.println("----------------");
		s = new BasicStudent("左小青", 23, "1123");
		System.out.println(s.getName() + "-" + s.getAge() + "-" + s.getGrade());
		s.study();
		s.eat();
		// 就业测试留给自己玩
	}
}
