package class10_FormalParameter;
/*
 * ��ʽ������
 * 		��������
 * 		�������ͣ�
 * 			�ࣺ(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 * 			�����ࣺ��Ҫ���Ǹó�������������
 * 			�ӿڣ�
 */
//��������Ϊ��ʽ����
abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p) {
		//p;p = new Student1();Person p = new Student1();//��̬
		p.study();
	}
}
//����һ�������ѧ����
class Student1 extends Person{
	public void study() {
		System.out.println("Good Good study,Day up");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		//Ŀǰ��û�а취ʹ�õ�
		//��Ϊ������û�ж�Ӧ�ľ�����
		//��ô���Ǿ�Ӧ�ö���һ��������
		//������Ҫʹ��PersonDemo���е�method()����
		PersonDemo pd = new PersonDemo();
		Person p = new Student1();
		pd.method(p);
		System.out.println("----------------------");
		new PersonDemo().method(new Student1());
	}
}
