package class10_InnerClass;
/*
 * �����ڲ���������
 * ����Ҫ�󣬲������
	interface Inter { void show(); }
	class Outer { //������� }
	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
	Ҫ���ڿ���̨�����HelloWorld��
 */

interface Inter7 { 
	//public abstract
	void show(); 
}
class Outer7 { 
	public static Inter7 method() {
		//������� --������������
		return new Inter7() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

public class OuterDemo {
	public static void main(String[] args) {
		//����Ҫ���ڿ���̨�����HelloWorld��
		Outer7.method().show();
		/*
		 * 1.Outer.method()���Կ���method()Ӧ����Outer�е�һ����̬����
		 * 2.Outer.method().show();���Կ����������method()�ķ���ֵ��һ������
		 * 3.���ڽӿ�Inter����һ��show()���������ԣ�����Ϊmethod()�ķ���ֵ������һ���ӿ�
		 */
	}
}
