package class7;

/*
 * ��װ��private��Ӧ�ã�
 * 		A���ѳ�Ա������private����
 * 		B����߶��õ�getXxx()��setXxx()����
 * 
 */
//����ѧ����
class Student03 {
	// ����
	private String name;
	// ����
	private int age;

	// ������ȡֵ
	public String getName() {
		return name;
	}

	// ��������ֵ
	public void setName(String n) {
		name = n;
	}

	// �����ȡֵ
	public int getAge() {
		return age;
	}

	// ���� ��ֵ
	public void setAge(int a) {
		age = a;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student03 s = new Student03();

		// ʹ�ó�Ա����
		// ���󣺱�˽�������ˣ���粻�ܷ�����
		// System.out.println(s.name+s.age);
		// System.out.println(s.getName()+"..."+s.getAge());

		// ����Ա������ֵ
		// s.name = "����ϼ";
		// s.age = 27;

		s.setName("��ԲԲ");
		s.setAge(27);
		System.out.println(s.getName() + "..." + s.getAge());
	}
}
