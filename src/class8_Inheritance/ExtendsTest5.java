package class8_Inheritance;
/*
 * è����������
 * 
 * ���ҵ���������Ȼ���־���������й��ԣ�����ȡ��һ������
 * 
 * è��
 * 	  ��Ա���������������䣬��ɫ
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 * 				eat()
 * 				playGame()
 * ����
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 *  			eat()
 *  			lookDoor()
 *���ԣ�
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 *  			eat()
 *  
 *  �ѹ��Զ��嵽һ�����У�����
 *  �����ࣺ
 * 	  ��Ա����������������
 * 	 ���췽�����޲�,����
 * 	 ��Ա������getXxx()/setXxx()
 *  			eat()
 *  è��
 *   * 	 ���췽�����޲�,����
 *   * 	 ��Ա������playGame()
 *  ����
 *   * 	 ���췽�����޲�,����
 *   * 	��Ա������lookDoor()
 * 
 */

//���嶯����
class Animal {
	// ����
	private String name;
	// ����
	private int age;
	// ��ɫ
	private String color;

	public Animal() {
	}

	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void eat() {
		System.out.println("�óԷ��ˣ���Ҫ˯��");
	}

}

//è��
class Cat extends Animal{
	public Cat() {
	}

	public Cat(String name, int age, String color) {
		super(name,age,color);
	}

	public void playGame() {
		System.out.println("è��Ӣ������");
	}
}

//����
class Dog extends Animal{
	public Dog() {
	}

	public Dog(String name, int age, String color) {
		super(name,age,color);
	}

	public void playDog() {
		System.out.println("������");
	}
}

public class ExtendsTest5 {
	public static void main(String[] args) {
		// ����è
		//��ʽ1
		Cat c1 = new Cat();
		c1.setName("Tome");
		c1.setAge(3);
		c1.setColor("��ɫ");
		System.out.println("è��������"+c1.getName()+";������"+c1.getAge()+";��ɫ��"+c1.getColor());
		c1.eat();
		c1.playGame();
		System.out.println("--------------");
		//��ʽ2
		Cat c2 = new Cat("����",5,"������");
		System.out.println("è��������"+c1.getName()+";������"+c1.getAge()+";��ɫ��"+c1.getColor());
		c2.eat();
		c2.playGame();
		System.out.println("--------------");
	}
}
