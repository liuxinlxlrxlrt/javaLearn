package class9_polymorphic;
/*
 * ������д���,���ж���û�����⣬���û�У�д�����
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
		//�Ҳ�������
//		f.method;
		f.show();
		System.out.println("-----");
		Zi4 z = (Zi4)f;
		z.show();
		z.method();
	}
}
