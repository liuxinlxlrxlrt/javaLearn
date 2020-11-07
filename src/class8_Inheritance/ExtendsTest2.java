package class8_Inheritance;
/*
 *看程序写结果：
 *		A：一个类的静态代码块，构造代码块，构造方法执行流程
 *			静态代码块-->构造代码块-->构造方法
 *		B:静态的内容是随着类的加载而加载
 *			静态代码块的内容会优先执行
 *			子类初始化之前会优先父类的初始化
 *			走子构造优先走父构造(构造代码块和构造方法)
 */

class Fu2{
	static {
		System.out.println("静态代码块Fu2");
	}
	{
		System.out.println("构造代码块Fu2");
	}
	public Fu2() {
		System.out.println("构造方法Fu2");
	}

}
class Zi2 extends Fu2{
	static {
		System.out.println("静态代码块Zi2");
	}
	
	{
		System.out.println("构造代码块Zi2");
	}
	
	
	public Zi2() {
		System.out.println("构造方法Zi2");
	}
}

public class ExtendsTest2 {

	public static void main(String[] args) {
		//创建对象
		Zi2 z = new Zi2(); 
	}
}
