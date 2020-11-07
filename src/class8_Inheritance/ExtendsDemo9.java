package class8_Inheritance;

/*
 * 继承中成员方法的关系：
 * 		A：子类中的方法和父类中的方法声明不一样，这太简单 
 * 		B：子类中的方法和父类中的方法声明不一样
 * 			通过子类调用方法：
 * 				a：先找子类中，看有没有这个方法，有就使用
 * 				b：再看父类中，有没有这个方法，有就使用
 * 				c：如果没有就报错
 */
class Father9 {
	public void show() {
		System.out.println("show Father9");
	}
}

class Son9 extends Father9 {
	public void method() {
		System.out.println("methd Son9");
	}

	public void show() {
		System.out.println("show Son9");
	}
}

public class ExtendsDemo9 {

	public static void main(String[] args) {
		// 创建对象
		Son9 s = new Son9();

		s.show();
		s.method();
//		s.function();//找不到报错
	}
}
