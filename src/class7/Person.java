package class7;
/*
 * ����һ������
 * ���������䶼�Ǳ仯��������ܽ��ܣ���Ϊÿ���˵������������ǲ�ͬ��
 * ������������ѡȡ�ļ����˶����й��ˣ����ǵĹ�����һ����
 * һ���Ĺ�������ÿ�δ��������ڶ��ڴ涼Ҫ���������Ŀռ�
 * �Ҿ;����е��˷��ˣ���ô���أ�
 * 		��Զ�������й�ͬ�����ĳ�Ա����ֵ��ʱ��
 * 		Java�������һ���ؼ���������:static
 * 		static���ε�������ݱ����ж����������
 */
public class Person {
	//����
	String name;
	//����
	int age;
	//����
	//String country;
	static String country;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("������"+name+",���䣺"+age+",������"+country);
	}
}
