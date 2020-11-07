package class17_Set_TreeSet;

/*
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
 * 
 *  ����1���밴�����С��������
 */
//ѧ����ѧ���ȣ�����Comparable<T>������Comparable<Student>
public class Student implements Comparable<Student>{
	//��Ա����
	private String name;
	private int age;

	//���췽��
	//�вι��캯��alt+shift+s+o
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//���޲ι��캯��alt+shift+s+c��
	public Student() {
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
	// ����1���밴�����С��������
	@Override
	public int compareTo(Student s) {
		//return 0;
		//return 1;
		//return -1;
	
		//���ﷵ��ʲô����ʵӦ�ø����ҵ������������
		//��Ҫ������������������(����ĸ������ʱ���Ǹ������Ҫthis)
		int num = this.age - s.age;
		//��Ҫ����
		
		//������ͬ��ʱ�򣬻���ȥ�������Ƿ���ͬ
		//��������������ͬ���Ž�ͬһ��Ԫ��
		int num2 = num ==0 ? this.name.compareTo(s.name):num;
		return num2;
	}
}
