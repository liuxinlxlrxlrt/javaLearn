package class17_Set_TreeSet;
/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 * 无参构造进行自然排序，自然排序就必须让对象所属的类实现comparable接口
 *  比较器排序
 *  这两种排序取决于构造方法
 *  需求2：请按照姓名的长度排序
 *  
 */

public class Student2 {
	//成员变量
	private String name;
	private int age;

	//构造方法
	//有参构造函数alt+shift+s+o
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//（无参构造函数alt+shift+s+c）
	public Student2() {
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

}

