package class9_abstractClass;

/*
 * è��������
 * 		��������:è,��
 * 		����: ����,����,�Է�
 * 
 * �������Ӿ��嵽����
 * 		è��
 * 			��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա�������Է���è����
 * 		����
 *  		��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա�������Է���������
 * 
 * 		��Ϊ�й��Ե����ݣ����Ծ���ȡ��һ�����࣬����
 * 		���������ڳԷ������ݲ�һ�������ԳԷ��ķ����ǳ����
 * 		�������ǳ�����࣬��ͱ��붨��Ϊ������
 * 
 * 		�������ࣺ
 * 			��Ա����������������
 * 			���췽���� �޲Σ�����
 * 			��Ա������ �Է�();
 * ʵ�֣�
 * 	�ӳ��󵽾��壺
 * 		�����ࣺ
 * 			��Ա����������������
 * 			���췽���� �޲Σ�����
 * 			��Ա������ �Է�();
 * 		
 * 		���ࣺ
 * 			�̳��Զ�����
 * 			��д�Է�();
 * 			
 * 		è�ࣺ
 * 			�̳��Զ�����
 * 			��д�Է�();
 */

abstract class Animal3{
	//����
	private String name;
	
	//����
	private int age;
	
	public Animal3() {}
	
	public Animal3 (String name, int age) {
		this.name =name;
		this.age = age;
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
	//����һ�����󷽷�
	public abstract void eat();
}

//�������Ĺ���
class Dog3 extends Animal3{
	public Dog3() {}
	
	public Dog3(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("������");
	}
}

//��������è��
class Cat3 extends Animal3{
	public Cat3() {}
	
	public Cat3(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("è����");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		//���Թ���
		//�������÷�
		//��ʽ1��
		Dog3 d = new Dog3();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"-"+d.getAge());
		d.eat();
		//��ʽ2��
		Dog3 d2 = new Dog3("����",3);
		System.out.println(d.getName()+"-"+d.getAge());
		d2.eat();
		System.out.println("--------");
		Animal3 a = new Dog3();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"-"+a.getAge());
		a.eat();
		
		Animal3 a2 = new Dog3("����",3);
		System.out.println(a2.getName()+"-"+a2.getAge());
		a2.eat();
	}

}
