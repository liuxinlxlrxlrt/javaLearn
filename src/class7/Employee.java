package class7;
/*
 *需求 :
 *	定义一个员工类,自己分析出几个成员，然后给出成员变量，
 *	构造方法，getXxx()/setXxx()方法，
 *	以及一个显示所有成员信息的方法。并测试
 *
 *分析：
 *	员工：
 *		成员变量：
 *			员工编号，名字，年龄
 *		构造方法：
 *			无参构造方法
 *		成员方法：
 *			getXxx()/setXxx()方法
 *			show()
 * 
 */

public class Employee {
	//员工编号
	private String employeeId;
	//名字
	private String name;
	//年龄
	private int age;
	//构造方法
	public Employee() {}
	
	//getXxx()/setXxx()方法
	public String getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//显示所有成员信息的方法
	public void show(){
		System.out.println("员工编号是:"+employeeId+"的这个人是:"+name+"的年龄是"+age);
	}
}
