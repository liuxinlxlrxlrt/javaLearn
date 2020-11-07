package class24_SingletonDesignParttern;

public class Student {
	//构造私有
	private Student (){
	}
	
	//自己造一个对象
	//静态方法只能访问静态成员变量
	//s是静态的，随着类的加载而加载
	//s是静态变量，可以通过类名直接访问
	//为了不然给外界直接修改这个值，加private
	//饿汉式单例模式
	private static Student s = new Student();
	
	//提供公共的访问的方式
	//非静态的通过对象调
	//为了保证外界能够直接使用该方法，加静态
	public static Student getStudent() {
		return s;
	}
}
