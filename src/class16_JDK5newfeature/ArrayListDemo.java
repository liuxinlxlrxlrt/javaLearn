package class16_JDK5newfeature;

/*
 * ArrayLisy�洢�ַ�����������Ҫ����뷺�ͣ�������ǿfor����
 * 	A��������
 * 	B: ��ͨfor
 * 	c:	��ǿfor
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<String> array = new ArrayList<String>();

		// ���������Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");

		// ��������
		// ������
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("-----------------");
		// ��ͨfor
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
		System.out.println("-----------------");
		// ��ǿfor
		for (String s : array) {
			System.out.println(s);
		}
	}
}
