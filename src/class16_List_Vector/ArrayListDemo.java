package class16_List_Vector;



/*
 * ��������Щ�ط�ʹ���أ�
 * 		��API�����ࡢ�ӿڡ���������������<E>,һ���ڼ�����ʹ��
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// ��ArrayList�洢�ַ���Ԫ��,���������÷��͸Ľ�
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("-----------------");

		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
