package class7;
/*
 * static关键字的注意事项：
 * 		A：在静态方法中是没有this关键字的
 * 			如何理解呢？
 * 			静态是随着类的加载而加载，
 * 			this是对着对象的创建而存在的
 * 			静态比对象先存在
 * 		B：静态方法只能访问静态的成员变量和静态的成员方法
			静态方法：
				成员变量：只能访问变量
				成员方法：只能访问静态成员方法
			非静态方法：
 * 				成员变量：可以访问静态的，也可以访问非静态变量
 * 				成员方法 ：可以访问静态的，也可以访问非静态方法
 * 			简单记：
 * 				静态只能访问静态
 * 				非静态可以访问一切
 * 
 */

public class Teacher {
	public int num = 10;
	public static int num2 = 20;
	
	public void show() {
		//隐含的告诉你访问的是成员变量
		System.out.println(num);
		//明确的的告诉你访问的是成员变量
		System.out.println(this.num);
		System.out.println(num2);
//		function();
//		function2();
	}
	
	public static void method() {
		//无法从静态上下文中引用非静态 变量 num
		//System.out.println(num);
		System.out.println(num2);
		//function();
		function2();
	}
	
	public void function() {}
	
	public static void function2() {
		
	}
}
