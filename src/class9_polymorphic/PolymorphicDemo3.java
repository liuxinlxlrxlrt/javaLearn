package class9_polymorphic;
/*
 * ��̬�ı׶ˣ�
 * 		����ʹ����������й���
 */
class Fu1{
	public void show() {
		System.out.println("show Fu");
	}
	
//	public static void function() {
//		System.out.println("function Fu");
//	}
}
class Zi1 extends Fu1{
	public void show() {
		System.out.println("show Zi");
	}
	
	public void method() {
		System.out.println("method Zi");
	}
	
//	public static void function() {
//		System.out.println("function Zi");
//	}
}
public class PolymorphicDemo3 {
	public static void main(String[] args) {
		//����
		Fu1 f = new Zi1();
		f.show();
//		f.method();
	}
}
