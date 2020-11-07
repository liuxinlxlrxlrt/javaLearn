package class9_abstractClass;

/*
 * ������ĸ�����
 * 		���ﲻӦ�ö���Ϊ����Ķ��������Ҷ����еĳԣ�˯��Ҳ��Ӧ���Ǿ���ġ�
 * 		�Ұ�һ��������Ĺ��ܳ�Ϊ����Ĺ��ܣ���һ��������г���Ĺ��ܣ�������ǳ�����
 * 
 * ��������ص㣺
 * 		A��������ͳ��󷽷�������abstract�ؼ�������
 * 		B���������в�һ���г��󷽷��������ֳ��󷽷�������붨��Ϊ������
 * 		C�������಻��ʵ����
 * 			��Ϊ�����Ǿ���ġ�
 * 			�������й��췽�������ǲ���ʵ������
 * 			*&*���췽����������ʲô��
 * 			*&*����������ʸ������ݵĳ�ʼ��
 * 		D����������ࣺ
 * 			a�����������д���󷽷�����������һ��������
 * 			b: ��д���еĳ��󷽷������ʱ��������һ���������
 * 
 * 		�������ʵ������ʵ�ǿ����������ʵ�ֵģ��Ƕ�̬�ķ���
 * 		Animal a = new Cat();
 * 
 * 
 */
//abstract class Animal //������������ʽ
abstract class Animal {
	// ���󷽷�
//	public abstract void eat() {}//�շ�����.����ᱨ��
	public abstract void eat();// û�з�����

	public Animal() {
	}

}

//�����ǳ�����
abstract class Dog extends Animal {
}

//�����Ǿ�����,��д���󷽷�
class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// ��������
		// Animal�ǳ���ģ��޷�ʵ����
//		Animal a = new Animal();

		// ͨ����̬�ķ�ʽ�������ʵ����
		Animal a = new Cat();
		a.eat();
	}
}
