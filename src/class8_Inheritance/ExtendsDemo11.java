package class8_Inheritance;
/*
 * ������д��ע������:
 * 		A:������˽�з������ܱ���д
 * 		B:������д���෽��ʱ������Ȩ�޲��ܸ���
 * 		C:���ྲ̬����������Ҳ����ͨ����̬����������д��
 * 
 * 	������д���෽����ʱ���������һģһ��
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

	//public��Ȩ�����
//	void show() {
//	System.out.println("show Son10");
//	}
	
	public void show() {
	System.out.println("show Son10");
	}
	
	public static void method() {
		
	}
	//����ĳɾ�̬
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
