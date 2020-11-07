package class10_InnerClass;

/*
 * �����ڲ����ڿ����е�ʹ��
 */
interface Person {
	public abstract void study();
}

class PersonDemo {
	// �ӿ�����Ϊ��ʽ����
	// ��ʵ������Ҫ�Ĳ��ǽӿڣ����Ǹýӿڵ�ʵ���۵Ķ����
	public void method(Person p) {
		p.study();
	}
}

class Student implements Person {
	public void study() {
		System.out.println("�ú�ѧϰ����������");
	}
}

public class InnerClassTest2 {
	public static void main(String[] args) {
		// ����
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("---------------");

		// ���������ڿ����е�ʹ��
		// �����ڲ���ı����Ǽ̳������ʵ�ֽӿڵ�������������
		pd.method(new Person() {
			public void study() {
				System.out.println("��Ƹ��");
			}
		});
	}
}
