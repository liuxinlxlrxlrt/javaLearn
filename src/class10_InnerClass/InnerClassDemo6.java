package class10_InnerClass;

/*
 * �����ڲ��ࣺ
 * 	�����ڲ���ļ�д��
 * 
 * ǰ�᣺����һ������߽ӿ�
 *    �����������Ǿ�����Ҳ�����ǳ����ࡣ
 *    
 *  ��ʽ��
	new �������߽ӿ���() {
	��д����;
	}
  
  ������ʲô�أ�
  	������һ���̳��˸������ʵ�ָýӿڵ�������������
  
 *    
 */
interface Inter {
	public abstract void show();

	public abstract void show2();
}

class Outer6 {
	public void method() {
		// Inner������ǽӿڵ��������
		// ������Ե�show����
		// һ��������ʱ��
//		new Inter() {
//			public void show() {
//				System.out.println("show");
//			}
//		}.show();
//	}

		// ����������ʱ��
//		new Inter() {
//			public void show() {
//				System.out.println("show");
//			}
//
//			public void show2() {
//				System.out.println("show2");
//			}
//		}.show();
//
//		new Inter() {
//			public void show() {
//				System.out.println("show");
//			}
//
//			public void show2() {
//				System.out.println("show2");
//			}
//		}.show2();

		// ������Ǻܶ���������ͺ��鷳��
		// ��ô��������û�иĽ��ķ����أ�
		Inter i = new Inter() {// ��̬
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();

	}
}

public class InnerClassDemo6 {

	public static void main(String[] args) {
		Outer6 o = new Outer6();
		o.method();
	}
}
