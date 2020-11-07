package class17_Set_TreeSet;
/*
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
 * 
 *  ����2���밴�������ĳ�������
 */

public class Student1 implements Comparable<Student1>{
	//��Ա����
	private String name;
	private int age;

	//���췽��
	//�вι��캯��alt+shift+s+o
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//���޲ι��캯��alt+shift+s+c��
	public Student1() {
		super();
	}

	//get��set����alt+shift+r+�س����ٻس�
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

	@Override
	public int compareTo(Student1 s) {
		//��Ҫ����:�밴�������ĳ�������
		int num = this.name.length()-s.name.length();
		//�����ĳ�����ͬ,������������������ͬ
		int num2 =num ==0? this.name.compareTo(s.name):num;
		
		//�����ĳ�����ͬ,������������ͬ�����Ի��ü����ж�����
		int num3 = num2 == 0 ? this.age-s.age : num2;
		return num3;
	}

}

