package class9_polymorphic;
/*
 * ��ͬ�ط���ʳ�Ļ���ͬ�İ���
 */
class Person{
	public void eat() {
		System.out.println("�Է�");
	}
}
class SouthPerson extends Person{
	public void eat() {
		System.out.println("���׷�");
	}
	public void business() {
		System.out.println("����");
	}
}

class NorthPerson extends Person{
	public void eat() {
		System.out.println("����,����ͷ");
	}
	public void research() {
		System.out.println("�о�");
	}
}

public class PolymorphicExercise2 {
	public static void main(String[] args) {
		//����
		Person p = new SouthPerson();
		p.eat();
		System.out.println("-----");
		SouthPerson sp = (SouthPerson)p;
		sp.eat();
		sp.business();
		System.out.println("------");
		p = new NorthPerson();
		p.eat();
		System.out.println("------");
		NorthPerson np= (NorthPerson)p;
		np.eat();
		np.research();
	}
}
