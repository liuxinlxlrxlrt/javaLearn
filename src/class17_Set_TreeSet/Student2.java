package class17_Set_TreeSet;
/*
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
 * �޲ι��������Ȼ������Ȼ����ͱ����ö�����������ʵ��comparable�ӿ�
 *  �Ƚ�������
 *  ����������ȡ���ڹ��췽��
 *  ����2���밴�������ĳ�������
 *  
 */

public class Student2 {
	//��Ա����
	private String name;
	private int age;

	//���췽��
	//�вι��캯��alt+shift+s+o
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//���޲ι��캯��alt+shift+s+c��
	public Student2() {
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

}

