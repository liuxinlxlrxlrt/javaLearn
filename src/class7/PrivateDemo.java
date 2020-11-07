package class7;

/*
	private:
 		是一个权限修饰符。
		可以修饰成员(成员变量和成员方法)
		被private修饰的成员只在本类中才能访问。
 */
class Demo {
	// int num =10;
	// 用private修饰
	private int num = 10;

	public void show() {
		System.out.println(num);
	}

	private void method() {
		System.out.println("method");
	}

	public void function() {
		method();
	}
}

public class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		// 不能访问私有的成员变量
		// System.out.println(d.num);
		d.show();
		// 不能访问私有的成员方法
		// d.method();
		d.function();
	}
}
