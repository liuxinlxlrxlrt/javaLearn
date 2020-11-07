package class9_abstractClass;
/*
 * 老师案例
		具体事物：基础班老师，就业班老师
		共性：姓名，年龄，讲课。
    * 分析：从具体到抽象
 * 		基础班的老师：
 * 			成员变量：姓名，年龄
 * 			构造方法：无参，带参
 * 			成员方法：讲课
 * 		就恶意班的老师：
 *  		成员变量：姓名，年龄
 * 			构造方法：无参，带参
 * 			成员方法：讲课
 * 
 * 		抽象动物类：
 * 			成员变量：姓名，年龄
 * 			构造方法： 无参，带参
 * 			成员方法： 讲课();
 * 实现：
 * 	从抽象到具体：
 * 		老师类：
 * 			成员变量：姓名，年龄
 * 			构造方法： 无参，带参
 * 			成员方法： 讲课();
 * 		
 * 		基础班类：
 * 			继承自动物类
 * 			重写讲课();
 * 			
 * 		就业类：
 * 			继承自动物类
 * 			重写讲课();
 */

//定义抽象的老师类
abstract class Teacher {
	// 姓名
	private String name;

	// 年龄
	private int age;

	public Teacher() {
	}

	public Teacher(String name, int age) {
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

	// 定义一个抽象方法
	public abstract void teach();
}

//基础班老师类
class BasicTeacher extends Teacher {
	public BasicTeacher() {
	}

	public BasicTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("基础班老师讲解javaSe");
	}
}

//就业班老师类
class WorkTeacher extends Teacher {
	public WorkTeacher() {
	}

	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("就业班老师讲解javaEE");
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		// 具体的类测试，自己玩

		// 测试（多态）
		Teacher t = new BasicTeacher();
		t.setName("章泽天");
		t.setAge(25);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new BasicTeacher("木村纱织", 26);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new WorkTeacher();
		t.setName("颜丹晨");
		t.setAge(27);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new WorkTeacher("杨铭铭", 28);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
	}
}
