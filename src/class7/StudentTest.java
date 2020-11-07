package class7;

/*
 * 封装和private的应用：
 * 		A：把成员变量用private修饰
 * 		B：提高对用的getXxx()和setXxx()方法
 * 
 */
//定义学生类
class Student03 {
	// 姓名
	private String name;
	// 年龄
	private int age;

	// 姓名获取值
	public String getName() {
		return name;
	}

	// 姓名设置值
	public void setName(String n) {
		name = n;
	}

	// 年龄获取值
	public int getAge() {
		return age;
	}

	// 年龄 赋值
	public void setAge(int a) {
		age = a;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student03 s = new Student03();

		// 使用成员变量
		// 错误：被私有修饰了，外界不能访问了
		// System.out.println(s.name+s.age);
		// System.out.println(s.getName()+"..."+s.getAge());

		// 给成员变量赋值
		// s.name = "林青霞";
		// s.age = 27;

		s.setName("高圆圆");
		s.setAge(27);
		System.out.println(s.getName() + "..." + s.getAge());
	}
}
