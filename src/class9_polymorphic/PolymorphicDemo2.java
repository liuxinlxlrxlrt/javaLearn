package class9_polymorphic;

/*
 * ��̬�ĺô���
 * 		����˳����ά����(�ɼ̳б�֤)
 * 		����˳������չ��(�ɶ�̬��֤)
 * 
 * è����������
 * 
 */
class Animal {
	public void eat() {
		System.out.println("eat");
	}

	public void sleep() {
		System.out.println("sleep");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}

	public void sleep() {
		System.out.println("��վ��˯��");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}

	public void sleep() {
		System.out.println("èſ��˯��");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("��԰ײ�");
	}

	public void sleep() {
		System.out.println("�����˯��");
	}
}

//��Զ�������Ĺ�����
class AnimalTool {
	private AnimalTool() {
	};

	// ����è�Ĺ���
//	public static void useCat(Cat c) {
//		c.eat();
//		c.sleep();
//	}
//
////���ù��Ĺ���
//	public static void useDog(Dog d) {
//		d.eat();
//		d.sleep();
//	}
//	
//	//������Ĺ���
//		public static void usePig(Pig p) {
//			p.eat();
//			p.sleep();
//		}
	// ���ö���Ĺ���
	public static void Animal(Animal a) {
		a.eat();
		a.sleep();
	}
}

public class PolymorphicDemo2 {

	public static void main(String[] args) {
		// ��ϲ��è��������һ��
		Cat c = new Cat();
		c.eat();
		c.sleep();

		// �Һ�ϲ��è������������һֻ
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		System.out.println("-------------------");

		// ���ر�ϲ��è������������һֻ
		// �Һ�ϲ��è������������һֻ
		Cat c3 = new Cat();
		c3.eat();
		c3.sleep();

		System.out.println("-------------------");

		// �������ˣ������˺ܶ�ֻè��ÿ�δ��������ǿ��Խ��ܵ�
		// �����أ����÷������㲻���ú������𣿽����Ƕ�������һ��
		// ����׼���÷����Ľ�
		// ���÷�ʽ�Ľ���
//		useCat(c);
//		useCat(c2);
//		useCat(c3);

//		AnimalTool.useCat(c);
//		AnimalTool.useCat(c2);
//		AnimalTool.useCat(c3);
		AnimalTool.Animal(c);
		AnimalTool.Animal(c2);
		AnimalTool.Animal(c3);
		System.out.println("-------------------");
		// ��ϲ����
		Dog d = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
//		AnimalTool.useDog(d);
//		AnimalTool.useDog(d2);
//		AnimalTool.useDog(d3);
		AnimalTool.Animal(d);
		AnimalTool.Animal(d2);
		AnimalTool.Animal(d3);
		System.out.println("-------------------");

		// ��ϲ��������
		// ����һ�������࣬��Ҫ�̳��Զ���ṩ���������������ڹ�������Ӹ���ķ�������
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();
//		AnimalTool.usePig(p);
//		AnimalTool.usePig(p2);
//		AnimalTool.usePig(p3);
		AnimalTool.Animal(p);
		AnimalTool.Animal(p2);
		AnimalTool.Animal(p3);
		System.out.println("-------------------");

		// ��ϲ�������ǣ��ϻ�������...
		// �����Ӧ���࣬�̳��Զ���ṩ��Ӧ�ķ����ĳ�ϴ������ڹ���������ӷ�������
		// ǰ�漸������д������û�������
		// ���ǹ����� ÿ�ζ��ģ��鷳��
		// �Ҿ��룬���ܲ��ܲ���
		// ̫�򵥣������ж��ﶼд�ϣ�������������ʲô�أ�������Щ��Ҫ�������أ�
		// ������һ�ַ���

	}

	// ����è�Ĺ���
	// ����㿴��һ�������Ĳ�����һ��������Cat����˵��������Ҫ����һ������
//	public static void useCat(Cat c) {
//		c.eat();
//		c.sleep();
//	}
//	//���ù��Ĺ���
//	public static void useDog(Dog d) {
//		d.eat();
//		d.sleep();
//	}

}
