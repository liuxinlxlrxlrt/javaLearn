package class9_polymorphic;

/*
 * ��̬�ı׶ˣ�
 * 		����ʹ����������й���
 * 
 * �Ҿ���ʹ���������еĹ��ܣ��в��У�
 * 
 * ��ô���أ�
 * 		A���������������÷���(���ԣ����Ǻܶ�ʱ�򲻺��� ������̫ռ�ڴ���)
 * 		B���Ѹ��������ǿ��ת������������ã�����ת�ͣ�
 * 
 * �������ת�����⣺
 * 		����ת�ͣ�
 * 			Fu f = new Zi();
 * 		����ת�ͣ�
 * 			Zi z = (Zi)Fu;//Ҫ���f�����ܹ�ת��ΪZi�ġ�
 * 			
 */
class Fu2 {
	public void show() {
		System.out.println("show Fu");
	}

//	public static void function() {
//		System.out.println("function Fu");
//	}
}

class Zi2 extends Fu2 {
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

public class PolymorphicDemo4 {
	public static void main(String[] args) {
		// ����
		Fu2 f = new Zi2();
		f.show();
//		f.method();

		// �����������
//		Zi2 z = new Zi2();
//		z.show();
//		z.method();

		// ���ܰ��ӵĶ���ֵ�����ף���ô���ܲ��ܰѸ������ø�ֵ���ӵ������أ�
//		Zi2 z = f;//������
		// ������ԣ��������£���һ��ǿת
		Zi2 z = (Zi2) f;
		z.show();
		z.method();
	}
}
