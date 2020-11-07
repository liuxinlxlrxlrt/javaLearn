package class10_InnerClass;
/*
 * 匿名内部类面试题
 * 按照要求，补齐代码
	interface Inter { void show(); }
	class Outer { //补齐代码 }
	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
	要求在控制台输出”HelloWorld”
 */

interface Inter7 { 
	//public abstract
	void show(); 
}
class Outer7 { 
	public static Inter7 method() {
		//子类对象 --子类匿名对象
		return new Inter7() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

public class OuterDemo {
	public static void main(String[] args) {
		//需求：要求在控制台输出”HelloWorld”
		Outer7.method().show();
		/*
		 * 1.Outer.method()可以看出method()应该是Outer中的一个静态方法
		 * 2.Outer.method().show();可以看出这个方法method()的返回值是一个对象
		 * 3.由于接口Inter中有一个show()方法，所以，我认为method()的返回值类型是一个接口
		 */
	}
}
