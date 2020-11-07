package class7;

/*
 * 一个标准代码的最终版：
 * 学生类：
 * 		成员变量
 * 			name,age
 * 		构造方法：
 * 			无参，带两个参数
 * 		成员方法：
 * 			getXxx()/setXxx()
 * 			show():输出该类的所有成员变量值
 * 
 * 给成员变量赋值：
 * 		A：setXxx()方法
 * 		B：构造方法
 * 输出成员变量赋值的方式：
 * 		A：通过getXxx()分别获取然后拼接
 * 		B：通过通用show()方法搞定
 * 
 */

public class StandardStudent {
	//姓名
	private String name;
	//年龄
	private int age;
	//构造方法
	public StandardStudent() {
		
	}
	
	public StandardStudent(String name,int age) {
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
	
	//给出所有的成员变量值
	public void show() {
		System.out.println(name+"---"+age);
	}

}


