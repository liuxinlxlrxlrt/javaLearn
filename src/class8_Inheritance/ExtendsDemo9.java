package class8_Inheritance;

/*
 * �̳��г�Ա�����Ĺ�ϵ��
 * 		A�������еķ����͸����еķ���������һ������̫�� 
 * 		B�������еķ����͸����еķ���������һ��
 * 			ͨ��������÷�����
 * 				a�����������У�����û������������о�ʹ��
 * 				b���ٿ������У���û������������о�ʹ��
 * 				c�����û�оͱ���
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
		// ��������
		Son9 s = new Son9();

		s.show();
		s.method();
//		s.function();//�Ҳ�������
	}
}
