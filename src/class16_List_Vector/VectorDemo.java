package class16_List_Vector;

/*
 * Vector�����й���
 * 	1.��ӹ���
		public void addElement(Object obj) ---add
	2.��ȡ����
		size()�������elementAt(int index)���������õ�����Ԫ��
		A:public Object elementAt(int index) ---get
		B:public Enumeration elements() ---Iterator iterator()
				boolean hasMoreElements(); ---hasNext()
				Object nextElement();   ---next()
				
JDK������ԭ��
	A����ȫ
	B��Ч��
	C: ����д
 */
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// �������϶���
		Vector v = new Vector();

		// ��ӹ���
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		// ����
		for (int x = 0; x < v.size(); x++) {
			String s = (String) v.elementAt(x);
			System.out.println(s);
		}

		System.out.println("---------------");

		Enumeration en = v.elements();
		// ͨ����������hasMoreElements()�ķ����ж���û��Ԫ��
		while (en.hasMoreElements()) {
			// ͨ����������nextElement�ķ�����ȡԪ��
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
