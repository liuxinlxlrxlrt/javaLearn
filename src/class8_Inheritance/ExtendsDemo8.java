package class8_Inheritance;

/*
 * 如果父类没有构造方法。那么子类的构造方法会出现现象呢？如何解决呢？
 * 		报错
 * 
 * 	A：在父类中加一个无参构造方法
 * 	B：通过使用super关键字去显示的调用父类的带参构造方法
 * 	C：子类通过this调用本来的其他构造方法
 * 		子类中一定要有一个区访问父类构造方法，否则父类数据就没有初始化
 * 
 * 注意事项：this(...)或者super(...)必须出现在第一条语句上
 * 			如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上
 */
//父类不写构造其实就是默认无参构造
class Father8 {
//	public Father8() {
//		System.out.println("Father8的无参构造方法");
//	}
	public Father8(String name) {
		System.out.println("Father8的带参构造方法");
	}
}

class Son8 extends Father8 {
	public Son8() {
		super("随便给");
		System.out.println("Son8的无参构造方法");
	}

	public Son8(String name) {
//		super("随便给");
		this();// 调用本类的无参构造
		System.out.println("Son8的带参构造方法");
	}
}

public class ExtendsDemo8 {
	public static void main(String[] args) {
		Son8 s = new Son8();
		System.out.println("------------------");
		Son8 s2 = new Son8("木村纱织");
	}
}
