package class9_abstractClass;

/*������ĳ�Ա�ص㣺
		��Ա�������ȿ����Ǳ���Ҳ�����Ǳ���
		���췽������
			����������ʸ������ݵĳ�ʼ��
		��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
		
  ������ĳ�Ա�������ԣ�
  		A�����󷽷���ǿ��Ҫ��������������
  		B���ǳ��󷽷�������̳е����飬��ߴ��븴����
*/
abstract class Animal2 {
	public int num = 10;
	public final int num2 = 20;

	public Animal2() {
	}

	public Animal2(String name, int age) {
	}

	public abstract void show();

	public void method() {
		System.out.println("method");
	}

}

class Dog2 extends Animal2 {
	public void show() {
		System.out.println("show Dog");
	}

}

public class AbstractDemo2 {
	public static void main(String[] args) {
		// ��������
		Animal2 a = new Dog2();
		a.num = 100;
		System.out.println(a.num);
		// a.num2 = 200;
		System.out.println(a.num2);
		a.show();
		a.method();
	}
}
