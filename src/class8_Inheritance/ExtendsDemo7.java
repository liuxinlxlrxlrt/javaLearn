package class8_Inheritance;

/*
 * �̳��й��췽���Ĺ�ϵ
 * 		A�����������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
 * 		B��Ϊʲô�أ�
 * 			��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
 * 			���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
 * 
 * 		ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super()
 */

class Father7 {
	int age;

	public Father7() {
		System.out.println("Father7���޲ι��췽��");
	}

	public Father7(String name) {
		System.out.println("Father7�Ĵ��ι��췽��");
	}
}

class Son7 extends Father7 {
	public Son7() {
		// super();//д�벻д����
		System.out.println("Son7���޲ι��췽��");
	}

	public Son7(String name) {
		// super();
		System.out.println("Son7�Ĵ��ι��췽��");
	}
}

public class ExtendsDemo7 {
	public static void main(String[] args) {
		// ��������
		Son7 s = new Son7();
		System.out.println("--------------");
		Son7 s2 = new Son7("������");
	}
}
