package class17_Set_TreeSet;

/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 * 
 *  需求1：请按年龄从小到大排序
 */
//学生和学生比，所以Comparable<T>泛型是Comparable<Student>
public class Student implements Comparable<Student>{
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
	// 需求1：请按年龄从小到大排序
	@Override
	public int compareTo(Student s) {
		//return 0;
		//return 1;
		//return -1;
	
		//这里返回什么，其实应该根据我的排序规则来做
		//主要条件：按照年龄排序(添加哪个对象的时候那个对象就要this)
		int num = this.age - s.age;
		//次要条件
		
		//年龄相同的时候，还得去看姓名是否相同
		//如果年龄和姓名相同，才叫同一个元素
		int num2 = num ==0 ? this.name.compareTo(s.name):num;
		return num2;
	}
}
