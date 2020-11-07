package class9_polymorphic;
/*
 * ��̬��������̬��
 * è��������ϰ��̬��
 */

class Animal2{
	public void eat() {
		System.out.println("�Է�");
	}
}

class Dog2 extends Animal2{
	public void eat() {
		System.out.println("������");
	}
	
	public void lookDoor() {
		System.out.println("������");
	}
}

class Cat2 extends Animal2 {
	public void eat() {
		System.out.println("è����");
	}
	public void playGame() {
		System.out.println("è׽�Բ�");
	}
}

public class PolymorphicExercise {
	public static void main(String[] args) {
		//����Ϊ��
		Animal2 a = new Dog2();
		a.eat();
		System.out.println("------------");
		//��ԭ�ɹ�
		Dog2 d = (Dog2) a;
		d.eat();
		d.lookDoor();
		System.out.println("------------");
		//���è
		a = new Cat2();
		a.eat();
		System.out.println("------------");
		//��ԭ��è
		Cat2 c = (Cat2)a;
		c.eat();
		c.playGame();
		
		//��ʾ���������
		//�������
//		Dog2 dd = new Animal2();
//		Dog2 dd = new Cat2();
		//���д���ClassCastException
//		Dog2 dd = (Dog2)a;
	}
}
