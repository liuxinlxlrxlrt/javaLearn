package class7;

/*
 * 标准的代码改进版
 * 
 * this:哪个对象调用那个方法，this就代表那个对象
 */
class Student05 {
	private String name;
	private int age;

	public String getName() {
		return name;// 这里其实隐含了this
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// age =age;
		this.age = age;
	}
}

public class StudentThisTest02 {
	public static void main(String[] args) {
		// 创建一个对象
		Student05 s1 = new Student05();
		s1.setName("刘亦菲");
		s1.setAge(26);
		System.out.println(s1.getName() + "..." + s1.getAge());

		// 创建第二个对象
		Student05 s2 = new Student05();
		s2.setName("佟亚丽");
		s2.setAge(28);
		// 获取数据
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}
