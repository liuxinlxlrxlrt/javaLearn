package class9_final;
/*
 * 继承的代码体现
 * 
 * 由于继承中方法有一个现象，方法的重载
 * 所以，父类的功能，就会被子类给覆盖掉
 * 有些时候，我们不想让子类去覆盖掉父类的功能，只能让它使用
 * 这个时候，针对这种情况，Java提供了一个关键字：final
 * 
 * final：最终的意思，常见的是它可以修饰类，方法，变量，
 */
class Fu{
	//被final修饰的方式是不可以被重写的
	public final void show() {
		System.out.println("这里是绝密资源，任何人不能更改");
	}
}
 class Zi extends Fu {
	 public void show1() {
		 System.out.println("这是一堆垃圾");
	 }
 }

public class finalDemo {
	public static void main(String[] args) {
		//创建对象
		Zi z = new Zi();
		z.show();
		z.show1();
	}
}
