package class8_Inheritance;

/*
 * Java�м̳е��ص㣺
 * 		A��Javaֻ֧�ֵ��̳У���֧�ֶ�̳�
 * 			��Щ������֧�ֶ�̳еģ���ʽ��extends ��1����2
 * 		B��Java֧�ֶ��̳�(�̳���ϵ)
 */
/*
class Father{}
class Mother{} 
class Son extends Father,Mother{}//�����
*/
class GrandFather {
	public void show() {
		System.out.println("����үү");
	}
}

class Father extends GrandFather {
	public void method() {
		System.out.println("��������");
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
