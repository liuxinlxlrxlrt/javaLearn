package class7;

/*
	private:
 		��һ��Ȩ�����η���
		�������γ�Ա(��Ա�����ͳ�Ա����)
		��private���εĳ�Աֻ�ڱ����в��ܷ��ʡ�
 */
class Demo {
	// int num =10;
	// ��private����
	private int num = 10;

	public void show() {
		System.out.println(num);
	}

	private void method() {
		System.out.println("method");
	}

	public void function() {
		method();
	}
}

public class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		// ���ܷ���˽�еĳ�Ա����
		// System.out.println(d.num);
		d.show();
		// ���ܷ���˽�еĳ�Ա����
		// d.method();
		d.function();
	}
}
