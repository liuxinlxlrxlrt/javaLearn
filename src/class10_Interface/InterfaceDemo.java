package class10_Interface;
/*
 * 抽象类中科院定义抽象方法的
 * 当一个抽象类中的方法全是抽象的时候，这时，哭晕通过另一种特殊的形式来体现，用接口来表示。
 * 
 * 接口该如何定义呢？
 * interface
 */

//abstract class Demo{
//	abstract void show1();
//	abstract void show2();
//}

/*
 * 接口中的成员已经被限定为固定的几种：
 * 【接口的定义格式】先介绍两种：
 *  	A：定义变量，但是变量必须有固定的修饰符修饰,public static final ，所以几口中的变量也称之为常量
 *  	B：定义方法，方位也有固定的修饰符，public abstract
 *  成员变量
		只能是常量
		默认修饰符 public static final
   构造方法
		没有，因为接口主要是扩展功能的，而没有具体存在
   成员方法
		只能是抽象方法
		默认修饰符 public abstract
接口特点
	接口用关键字interface表示
		格式：interface 接口名 {}
	类实现接口用implements表示
		格式：class 类名 implements 接口名 {}
	接口不能实例化
		那么，接口如何实例化呢?
		按照多态的方式，由具体的子类实例化。其实这也是多态的一种，接口多态。
	接口的子类
		要么是抽象类
		要么重写接口中的所有抽象方法

 *  接口中的成员都是公共的。
 *  
 *  【接口的特点】
 *  	A：接口不可以创建对象
 *  	B：子类必须要覆盖掉接口中所有的抽象方法后，子类才可以实例化
 */

//定义一个名词为Demo的接口
interface Demo{
	//如果public static final不写，编译器会自动加上
	public static final int NUM = 3;
	
	//如果public abstractl不写，编译器会自动加上
	public abstract void show1();
	public abstract void show2();
}

//定义子类去覆盖接口中的方法,子类必须和接口产生关系
//类与类之间的关系继承，
//类与接口之间的关系是实现，通过关键字implemnts
class DemoImpl implements Demo{
	//重写接口中方法
	public void show1() {
		System.out.println("梁田");
	}
	public void show2() {
		System.out.println("刘烨");
	}
}

/*
 * 接口最重要的体现：
 * 		解决多继承的弊端，将多继承这种机制在java中通过多实现完成了
 */
interface A{
	public abstract void show3();
}
interface B{
	public abstract void show4();
}
//多实现，同时实现多个接口
class C implements A,B{
	public void show3() {
		System.out.println("靳梦佳");
	}
	public void show4() {
		System.out.println("张美曦");
	}
}
/*怎么解决多继承的弊端的呢？
 * 多继承弊端：多继承时，当多个父类中有相同功能时，子类调用会产生不确定性
 * 其实核心原因就是在与多继承父类中功能有主题，而导致调用运行时，不确定运行哪一个主题内容
为什么多实现就能解决呢？
因为接口中的功能都没有方法体，哟子类来明确
 *interface A{
	public abstract void show();
}
interface B{
	public abstract void show();
}
//多实现，同时实现多个接口
class C implements A,B{
	public void show() {
		System.out.println("靳梦佳");
	}
	public void show() {
		System.out.println("张美曦");
	}
} 
创建C对象时，C冲突吗？
不冲突
	C c = new C();
	c.show();
 */

public class InterfaceDemo {
	public static void main(String[] args) {
		DemoImpl d = new DemoImpl();
		d.show1();
		d.show2();
		
		C c = new C();
		c.show3();
		c.show4();
	}
}
