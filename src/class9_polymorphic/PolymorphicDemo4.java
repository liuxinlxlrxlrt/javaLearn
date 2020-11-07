package class9_polymorphic;

/*
 * 多态的弊端：
 * 		不能使用子类的特有功能
 * 
 * 我就想使用子类特有的功能？行不行？
 * 
 * 怎么用呢？
 * 		A：创建子类对象调用方法(可以，但是很对时候不合理 。而且太占内存了)
 * 		B：把父类的引用强制转换成子类的引用（向下转型）
 * 
 * 对象键的转型问题：
 * 		向上转型：
 * 			Fu f = new Zi();
 * 		向下转型：
 * 			Zi z = (Zi)Fu;//要求该f必须能够转换为Zi的。
 * 			
 */
class Fu2 {
	public void show() {
		System.out.println("show Fu");
	}

//	public static void function() {
//		System.out.println("function Fu");
//	}
}

class Zi2 extends Fu2 {
	public void show() {
		System.out.println("show Zi");
	}

	public void method() {
		System.out.println("method Zi");
	}

//	public static void function() {
//		System.out.println("function Zi");
//	}
}

public class PolymorphicDemo4 {
	public static void main(String[] args) {
		// 测试
		Fu2 f = new Zi2();
		f.show();
//		f.method();

		// 创建子类对象
//		Zi2 z = new Zi2();
//		z.show();
//		z.method();

		// 你能把子的对象赋值给父亲，那么我能不能把父的引用赋值给子的引用呢？
//		Zi2 z = f;//不可以
		// 如果可以，但是如下，加一个强转
		Zi2 z = (Zi2) f;
		z.show();
		z.method();
	}
}
