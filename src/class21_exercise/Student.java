package class21_exercise;
/*
 * ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 * 
 * ������
 * 		A������ѧ������
 * 		B���������϶���
 * 			TreeSet<Student>
 * 		C������¼��ѧ����Ϣ
 * 		D���������ϣ�������д���ı��ļ�
 */

public class Student {
	//����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	private String name;
	private int chninese;
	private int math;
	private int english;
	public Student(String name, int chninese, int math, int english) {
		super();
		this.name = name;
		this.chninese = chninese;
		this.math = math;
		this.english = english;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChninese() {
		return chninese;
	}
	public void setChninese(int chninese) {
		this.chninese = chninese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getSum() {
		return this.chninese+this.math+this.english;
	}
}
