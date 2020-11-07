package class7;
/*
 * 一个标准的代码最终版
 * 
 * 学生类：
 * 		成员变量：
 * 			name,age
 * 		构造方法：
 * 			无参，带两个参
 * 		成员方法：
 * 			getXxx()/setXxx()
 * 			show():输出该类的所有成员变量值
 * 
 * 给成员变量赋值:
 * 		A：setXxx()方法
 * 		B：构造方法
 * 
 * 输出成员变量值的方式：
 * 		A：通过getXxx()分别获取然后拼接
 * 		B：通过调用show方法搞定
 */
class Student11{
	//姓名
	private String name;
	//年龄
	private int age;
	//无参构造方法
	public Student11(){
	}
	//带参构造
	public Student11(String name,int age) {
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
	
	//输出所有的成员变量值
	public void show() {
		System.out.println(name+"---"+age);
	}
}

public class StudentTest03 {

	public static void main(String[] args) {
		//方式1给成员变量赋值
		//无参构造+setXxx()
		Student11 s1 = new Student11();
		s1.setName("陈德容");
		s1.setAge(32);
		//输出值
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		//方式是2给成员变量赋值
		Student11 s2 = new Student11("徐璐",26);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
	}
}
