package class9_abstractClass;
/*
 * ѧ������
			�������񣺻�����ѧԱ����ҵ��ѧԱ
			���ԣ����������䣬�༶��ѧϰ���Է�
			
     * �������Ӿ��嵽����
 * 		���������ʦ��
 * 			��Ա���������������䣬�༶
 * 			���췽�����޲Σ�����
 * 			��Ա������ѧϰ�ͳԷ�
 * 		�Ͷ�������ʦ��
 *  		��Ա���������������䣬�༶
 * 			���췽�����޲Σ�����
 * 			��Ա������ѧϰ�ͳԷ�
 * 
 * 		�õ�һ��ѧԱ�ࣺ
 *  		��Ա���������������䣬�༶
 * 			���췽�����޲Σ�����
 * 			��Ա������ѧϰ�ͳԷ�
 * 
 * ʵ�֣�
 * 		ѧԱ�ࣺ
 * 		������ѧԱ
 * 		��ҵ��ѧԱ
 */

abstract class Student {
	// ����
	private String name;
	// ����
	private int age;
	// �༶
	private String grade;

	public Student() {
	}

	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// ѧϰ
	public abstract void study();

	// �Է�
	public void eat() {
		System.out.println("ѧϰ���ˣ��͸óԷ���");
	}
}

//������ѧԱ��
class BasicStudent extends Student {
	public BasicStudent() {
	}

	public BasicStudent(String name, int age, String grade) {
		super(name, age, grade);
	}

	public void study() {
		System.out.println("������ѧԱѧϰ����JavaSe");
	}
}

//��ҵ��ѧԱ��
class WrokStudent extends Student {
	public WrokStudent() {
	}

	public WrokStudent(String name, int age, String grade) {
		super(name, age, grade);
	}

	public void study() {
		System.out.println("��ҵ��ѧԱѧϰ����JavaEE");
	}
}

public class AbstractTest3 {
	public static void main(String[] args) {
		// �ҽ������Ի�����ѧԱ
		// ���ն�̬�ķ�ʽ����
		Student s = new BasicStudent();
		s.setName("����");
		s.setAge(21);
		s.setGrade("1111");
		System.out.println(s.getName() + "-" + s.getAge() + "-" + s.getGrade());
		s.study();
		s.eat();

		System.out.println("----------------");
		s = new BasicStudent("��С��", 23, "1123");
		System.out.println(s.getName() + "-" + s.getAge() + "-" + s.getGrade());
		s.study();
		s.eat();
		// ��ҵ���������Լ���
	}
}
