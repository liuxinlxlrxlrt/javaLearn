package class9_polymorphic;
/*
 * 看程序写结果,先判断有没有问题，如果没有，写出结果
 */

class Fu4{
	public void show() {
		System.out.println("fu show");
	}
}
class Zi4 extends Fu4{
	public void show() {
		System.out.println("zi show");
	}
	public void method() {
		System.out.println("zi method");
	}
}

public class PolymorphicExercise3 {
	public static void main(String[] args) {
		Fu4 f = new Zi4();
		//找不到符号
//		f.method;
		f.show();
		System.out.println("-----");
		Zi4 z = (Zi4)f;
		z.show();
		z.method();
	}
}
