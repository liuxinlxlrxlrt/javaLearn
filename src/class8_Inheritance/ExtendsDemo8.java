package class8_Inheritance;

/*
 * �������û�й��췽������ô����Ĺ��췽������������أ���ν���أ�
 * 		����
 * 
 * 	A���ڸ����м�һ���޲ι��췽��
 * 	B��ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
 * 	C������ͨ��this���ñ������������췽��
 * 		������һ��Ҫ��һ�������ʸ��๹�췽�������������ݾ�û�г�ʼ��
 * 
 * ע�����this(...)����super(...)��������ڵ�һ�������
 * 			������Ƿ��ڵ�һ������ϣ��Ϳ��ܶԸ�������ݽ����˶�γ�ʼ�������Ա�����ڵ�һ�������
 */
//���಻д������ʵ����Ĭ���޲ι���
class Father8 {
//	public Father8() {
//		System.out.println("Father8���޲ι��췽��");
//	}
	public Father8(String name) {
		System.out.println("Father8�Ĵ��ι��췽��");
	}
}

class Son8 extends Father8 {
	public Son8() {
		super("����");
		System.out.println("Son8���޲ι��췽��");
	}

	public Son8(String name) {
//		super("����");
		this();// ���ñ�����޲ι���
		System.out.println("Son8�Ĵ��ι��췽��");
	}
}

public class ExtendsDemo8 {
	public static void main(String[] args) {
		Son8 s = new Son8();
		System.out.println("------------------");
		Son8 s2 = new Son8("ľ��ɴ֯");
	}
}
