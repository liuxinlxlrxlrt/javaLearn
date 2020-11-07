package class8;
/*
 * 代码块：在Java中，使用{}括起来的代码被称为代码块。
 * 
 * 根据其位置和声明的不同，可以分为：
 * 		局部代码块:在方法中出现；限定变量生命周期
 * 		构造代码块:在类中的成员位置,用{}括起来的代码，
 * 					每次调用构造方法执行前，都会执行构造代码块
 * 			作用：可以把多个构造方法中的共同代码放到一起，对对象进行初始化
 * 
 * 		静态代码块：在类中的成员位置,用{}括起来的代码，
 * 					只不过它用static修饰了
 * 			作用：一般对类进行初始化
 * 
 * 面试题:
 * 		静态代码块，构造代码快，构造方法的执行顺序？
 * 		顺序为：	静态代码块-->构造代码块-->构造方法
 * 		静态代码块：只执行一次       
 * 		构造代码块：每次调用都执行
 * 
 */

class Code1 {
	// 静态代码块
	static {
		int a = 300;
		System.out.println(a);
	}
	// 构造代码块
	{
		int x = 100;
		System.out.println(x);
	}

	// 构造方法
	public Code1() {
		System.out.println("code");
	}

	// 构造方法
	public Code1(int a) {
		System.out.println("code");
	}

	// 构造代码块
	{
		int y = 200;
		System.out.println(y);
	}
	// 静态代码块
	static {
		int b = 400;
		System.out.println(b);
	}
}

public class CodeDemo {
	public static void main(String[] args) {
		// 局部代码块
		{
			int x = 10;
			System.out.println(x);
		}
		// 找不到符号
		// System.out.println(x);
		// 局部代码块
		{
			int y = 20;
			System.out.println(y);
		}
		System.out.println("------------------");

		Code1 c = new Code1();
		System.out.println("----------------------");
		Code1 c2 = new Code1();
	}
}
