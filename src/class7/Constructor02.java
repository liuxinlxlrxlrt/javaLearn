package class7;

/*
 * 我们一直在使用构造方法，但是我们缺没有定义构造方法，用的是哪里来的呢？
 * 
 * 构造方法的注意事项：
 * 		A:如果你不提供构造方法，系统会给出默认构造方法
 * 		B:如果你提供了构造方法，系统将不再提供默认的无参构造方法
 * 			注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出，建议永远自己给处无参构造方法
 * 
 * 		C:构造方法也是可以重载的
 * 
 *	给成员变量赋值有两种方式：
 *		A：setXxx()
 * 		B:构造方法
 */
class Student07 {
	private String name;
	private int age;

	public Student07() {
		// System.out.println("我给了，你还给不");
		System.out.println("这是一个无参构造方法");

	}

	// 构造方法的重载格式
	public Student07(String name) {
		System.out.println("这是带一个String类型的构造方法");
		this.name = name;
	}

	public Student07(int age) {
		System.out.println("这是带一个int类型的构造方法");
		this.age = age;
	}

	public Student07(String name, int age) {
		// 这是一个带多个参数的构造方法
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(name + "---" + age);
	}
}

public class Constructor02 {

	public static void main(String[] args) {
		// 创建对象
		Student07 s = new Student07();
		s.show();
		System.out.println("--------");

		// 创建对象s2
		Student07 s2 = new Student07("古力娜扎");
		s2.show();
		System.out.println("--------");

		// 创建对象s3
		Student07 s3 = new Student07(26);
		s3.show();
		System.out.println("--------");

		// 创建对象
		Student07 s4 = new Student07("杨子姗", 23);
		s4.show();
		System.out.println("--------");
	}
}
