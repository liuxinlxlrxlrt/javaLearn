package class7;

/*
 * ��������˵����������Ҫ��������֪��
 * 
 * this:�ǵ�ǰ��Ķ������ã��򵥵ļǣ����ʹ���ǰ���һ������
 * 		
 * ע�⣺˭��������������ڸ÷����ڲ���this�ʹ���˭
 * 
 * this�ĳ�����
 * 		����ֲ��������س�Ա����
 */
//����ѧ����
class Student04 {
	// ����
	private String name;
	// ����
	private int age;

	// ������ȡֵ
	public String getName() {
		return name;
	}

	// ��������ֵ
	public void setName(String name) {// name = "��´��"
		// name =name;//������ʹ�ù��򣺾ͽ�ԭ��
		// ������������Ŀǰ��û�н������Ƶ��÷�������������������
		// ����ĵ���ֻ��ͨ��������
		// �������������ڣ���Ӧ�ô������Student��һ������
		// ��ô��˭�ܹ�����ǰ��Ķ����أ�java���ṩ��һ���ؼ���this
		// Student04.name =name;
		this.name = name;
	}

	// �����ȡֵ
	public int getAge() {
		return age;
	}

	// ���� ��ֵ
	public void setAge(int age) {
		// age =age;
		this.age = age;
	}
}

public class StudentThisTest {
	public static void main(String[] args) {
		Student04 s = new Student04();

		// ����Ա������ֵ
		s.setName("��´��");
		s.setAge(25);
		// ��ȡ����
		System.out.println(s.getName() + "..." + s.getAge());
	}
}
