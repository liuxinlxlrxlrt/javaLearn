package class8;
/*
 * ����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ����顣
 * 
 * ������λ�ú������Ĳ�ͬ�����Է�Ϊ��
 * 		�ֲ������:�ڷ����г��֣��޶�������������
 * 		��������:�����еĳ�Աλ��,��{}�������Ĵ��룬
 * 					ÿ�ε��ù��췽��ִ��ǰ������ִ�й�������
 * 			���ã����԰Ѷ�����췽���еĹ�ͬ����ŵ�һ�𣬶Զ�����г�ʼ��
 * 
 * 		��̬����飺�����еĳ�Աλ��,��{}�������Ĵ��룬
 * 					ֻ��������static������
 * 			���ã�һ�������г�ʼ��
 * 
 * ������:
 * 		��̬����飬�������죬���췽����ִ��˳��
 * 		˳��Ϊ��	��̬�����-->��������-->���췽��
 * 		��̬����飺ִֻ��һ��       
 * 		�������飺ÿ�ε��ö�ִ��
 * 
 */

class Code1 {
	// ��̬�����
	static {
		int a = 300;
		System.out.println(a);
	}
	// ��������
	{
		int x = 100;
		System.out.println(x);
	}

	// ���췽��
	public Code1() {
		System.out.println("code");
	}

	// ���췽��
	public Code1(int a) {
		System.out.println("code");
	}

	// ��������
	{
		int y = 200;
		System.out.println(y);
	}
	// ��̬�����
	static {
		int b = 400;
		System.out.println(b);
	}
}

public class CodeDemo {
	public static void main(String[] args) {
		// �ֲ������
		{
			int x = 10;
			System.out.println(x);
		}
		// �Ҳ�������
		// System.out.println(x);
		// �ֲ������
		{
			int y = 20;
			System.out.println(y);
		}
		System.out.println("------------------");

		Code1 c = new Code1();
		System.out.println("----------------------");
		Code1 c2 = new Code1();
	}
}
