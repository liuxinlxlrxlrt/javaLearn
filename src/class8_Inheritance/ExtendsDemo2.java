package class8_Inheritance;

/*
 * Java中继承的特点：
 * 		A：Java只支持单继承，不支持多继承
 * 			有些语言是支持多继承的，格式：extends 类1，类2
 * 		B：Java支持多层继承(继承体系)
 */
/*
class Father{}
class Mother{} 
class Son extends Father,Mother{}//错误的
*/
class GrandFather {
	public void show() {
		System.out.println("我是爷爷");
	}
}

class Father extends GrandFather {
	public void method() {
		System.out.println("我是老子");
	}
}

class Son extends Father {
}

public class ExtendsDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
		s.method();
	}
}
