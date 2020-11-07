package class9_final;

/*
 * final可以修饰类，方法，变量，
 * 
 * 特点：
 * 	final可以修饰类：该类不能被继承
 * 		（final修饰的类叫最终类，没有子类，不能被继承）
 * 	final可以修饰方法：方法不能被重写
 * 	final可以修饰变量：该变量不能被重新赋值，因为这个变量其实是常量
 * 
 * 常量：
 *  A：字面值常量
 *  		“Holle”,10,ture
 *  B:自定义常量
 *  		final int x = 10;
 * 
 */
//final class Fu1 //无法从最终类Fu1进行继承
class Fu1 {
	public int num = 10;
	public final int num2 = 20;
//	public final void show() {
//	}
}

class Zi1 extends Fu1 {
	// Zi1中的show()方法无法覆盖Fu1中被final修饰的show()
	public void show() {
		num = 100;
		System.out.println(num);
//			num2 = 200;//该变量不能被重新赋值，因为被final修饰的这个变量其实是常量
		System.out.println(num2);
	}
}

public class FinalDemo1 {
	public static void main(String[] args) {
		// 创建对象
		Zi1 z = new Zi1();
		z.show();
	}
}
