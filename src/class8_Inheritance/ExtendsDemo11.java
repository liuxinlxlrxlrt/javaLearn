package class8_Inheritance;
/*
 * 方法重写的注意事项:
 * 		A:父类中私有方法不能被重写
 * 		B:子类重写父类方法时，访问权限不能更低
 * 		C:父类静态方法，子类也必须通过静态方法进行重写。
 * 
 * 	子类重写父类方法的时候，最好声明一模一样
 */

class Father10{
//	private void show() {}
	
//	public void show() {
//		System.out.println("show Father10");
//	}
	
	void show() {
		System.out.println("show Father10");
	}
	
	public static void method() {
		
	}
	
	public void method1() {
		
	}
	
}
class Son10 extends Father10{
//	private void show() {}

	//public的权限最大
//	void show() {
//	System.out.println("show Son10");
//	}
	
	public void show() {
	System.out.println("show Son10");
	}
	
	public static void method() {
		
	}
	//必须改成静态
//	public void method() {
//		
//	}
	
//	public static void method1() {
//		
//	}
}

public class ExtendsDemo11 {
	public static void main(String[] args) {
		Son10 s = new Son10();
		s.show();
	}
}
