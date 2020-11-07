package class17_Set_TreeSet;
/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 * 
 *  需求2：请按照姓名的长度排序
 */

public class Student1 implements Comparable<Student1>{
	//成员变量
	private String name;
	private int age;

	//构造方法
	//有参构造函数alt+shift+s+o
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//（无参构造函数alt+shift+s+c）
	public Student1() {
		super();
	}

	//get和set方法alt+shift+r+回车，再回车
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
	public int compareTo(Student1 s) {
		//主要条件:请按照姓名的长度排序
		int num = this.name.length()-s.name.length();
		//姓名的长度相同,不代表姓名的内容相同
		int num2 =num ==0? this.name.compareTo(s.name):num;
		
		//姓名的长度相同,不代表年龄相同，所以还得继续判断年龄
		int num3 = num2 == 0 ? this.age-s.age : num2;
		return num3;
	}

}

