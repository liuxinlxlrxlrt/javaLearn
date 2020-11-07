package class8_Inheritance;

/*
 * 继承中构造方法的关系
 * 		A：子类中所有的构造方法默认都会访问父类中空参数的构造方法
 * 		B：为什么呢？
 * 			因为子类会继承父类中的数据，可能还会使用父类的数据。
 * 			所以，子类初始化之前，一定要先完成父类数据的初始化。
 * 
 * 		注意：子类每一个构造方法的第一条语句默认都是：super()
 */

class Father7 {
	int age;

	public Father7() {
		System.out.println("Father7的无参构造方法");
	}

	public Father7(String name) {
		System.out.println("Father7的带参构造方法");
	}
}

class Son7 extends Father7 {
	public Son7() {
		// super();//写与不写都有
		System.out.println("Son7的无参构造方法");
	}

	public Son7(String name) {
		// super();
		System.out.println("Son7的带参构造方法");
	}
}

public class ExtendsDemo7 {
	public static void main(String[] args) {
		// 创建对象
		Son7 s = new Son7();
		System.out.println("--------------");
		Son7 s2 = new Son7("艾尚真");
	}
}
