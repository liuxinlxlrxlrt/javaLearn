package class9_abstractClass;
/*
 * ��ʦ����
		���������������ʦ����ҵ����ʦ
		���ԣ����������䣬���Ρ�
    * �������Ӿ��嵽����
 * 		���������ʦ��
 * 			��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա����������
 * 		�Ͷ�������ʦ��
 *  		��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա����������
 * 
 * 		�������ࣺ
 * 			��Ա����������������
 * 			���췽���� �޲Σ�����
 * 			��Ա������ ����();
 * ʵ�֣�
 * 	�ӳ��󵽾��壺
 * 		��ʦ�ࣺ
 * 			��Ա����������������
 * 			���췽���� �޲Σ�����
 * 			��Ա������ ����();
 * 		
 * 		�������ࣺ
 * 			�̳��Զ�����
 * 			��д����();
 * 			
 * 		��ҵ�ࣺ
 * 			�̳��Զ�����
 * 			��д����();
 */

//����������ʦ��
abstract class Teacher {
	// ����
	private String name;

	// ����
	private int age;

	public Teacher() {
	}

	public Teacher(String name, int age) {
		this.name = name;
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

	// ����һ�����󷽷�
	public abstract void teach();
}

//��������ʦ��
class BasicTeacher extends Teacher {
	public BasicTeacher() {
	}

	public BasicTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("��������ʦ����javaSe");
	}
}

//��ҵ����ʦ��
class WorkTeacher extends Teacher {
	public WorkTeacher() {
	}

	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("��ҵ����ʦ����javaEE");
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		// ���������ԣ��Լ���

		// ���ԣ���̬��
		Teacher t = new BasicTeacher();
		t.setName("������");
		t.setAge(25);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new BasicTeacher("ľ��ɴ֯", 26);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new WorkTeacher();
		t.setName("�յ���");
		t.setAge(27);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
		System.out.println("--------------");
		t = new WorkTeacher("������", 28);
		System.out.println(t.getName() + "-" + t.getAge());
		t.teach();
	}
}
