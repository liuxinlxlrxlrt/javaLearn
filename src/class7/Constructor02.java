package class7;

/*
 * ����һֱ��ʹ�ù��췽������������ȱû�ж��幹�췽�����õ������������أ�
 * 
 * ���췽����ע�����
 * 		A:����㲻�ṩ���췽����ϵͳ�����Ĭ�Ϲ��췽��
 * 		B:������ṩ�˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��
 * 			ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
 * 
 * 		C:���췽��Ҳ�ǿ������ص�
 * 
 *	����Ա������ֵ�����ַ�ʽ��
 *		A��setXxx()
 * 		B:���췽��
 */
class Student07 {
	private String name;
	private int age;

	public Student07() {
		// System.out.println("�Ҹ��ˣ��㻹����");
		System.out.println("����һ���޲ι��췽��");

	}

	// ���췽�������ظ�ʽ
	public Student07(String name) {
		System.out.println("���Ǵ�һ��String���͵Ĺ��췽��");
		this.name = name;
	}

	public Student07(int age) {
		System.out.println("���Ǵ�һ��int���͵Ĺ��췽��");
		this.age = age;
	}

	public Student07(String name, int age) {
		// ����һ������������Ĺ��췽��
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(name + "---" + age);
	}
}

public class Constructor02 {

	public static void main(String[] args) {
		// ��������
		Student07 s = new Student07();
		s.show();
		System.out.println("--------");

		// ��������s2
		Student07 s2 = new Student07("��������");
		s2.show();
		System.out.println("--------");

		// ��������s3
		Student07 s3 = new Student07(26);
		s3.show();
		System.out.println("--------");

		// ��������
		Student07 s4 = new Student07("�����", 23);
		s4.show();
		System.out.println("--------");
	}
}
