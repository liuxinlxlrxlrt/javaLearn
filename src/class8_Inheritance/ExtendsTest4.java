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
 * 
 * 看上面两个类的成员，发现了很多相同的东西，所以我们就考虑抽取一个共性的类
 * 人：
 * 	  成员变量：姓名，年龄
 * 	 构造方法：无参,带参
 * 	 成员方法：getXxx()/setXxx()
 * 
 *  学生 继承 人
 *  老师 继承 人
 */
//定义人类
class Person2{
	//姓名
		private String name;
		//年龄
		private int age;
		
		public Person2 () {
		}
		
		public Person2(String name,int age) {
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

class Student11 extends Person2{
	public Student11() {}
	
	public Student11(String name,int age) {
//		this.name = name;
//		this.age = age;
		super(name,age);
	}
}
class Teacher11 extends Person2{
	public Teacher11() {}
	public Teacher11(String name,int age) {
//		this.name = name;
//		this.age = age;
		super(name,age);
	}
}

public class ExtendsTest4 {
	public static void main(String[] args) {
		//创建学生对象并测试
		//方式一
		Student11 s1 = new Student11();
		s1.setName("陶慧敏");
		s1.setAge(25);
		System.out.println(s1.getName()+"-"+s1.getAge());
		//方式二
		Student11 s2 = new Student11("张迎雪",22);
		System.out.println(s2.getName()+"-"+s2.getAge());
		
		//创建老师对象并测试
		//方式一
		Teacher11 t1 = new Teacher11();
		s1.setName("张嘉倪");
		s1.setAge(21);
		System.out.println(s1.getName()+"-"+s1.getAge());
		//方式二
		Teacher11 t2 = new Teacher11("张梓琳",23);
		System.out.println(s2.getName()+"-"+s2.getAge());
	}
}
