package class16_List_LinkedList;

//LinkedList�洢�ַ���������

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		// �������϶���
		LinkedList linked = new LinkedList();

		// ����Ԫ�ض��󣬲����Ԫ��
		linked.add("hello");
		linked.add("world");
		linked.add("java");

		// ����
		Iterator it = linked.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------------------");

		for (int x = 0; x < linked.size(); x++) {
			String s = (String) linked.get(x);
			System.out.println(s);
		}
	}
}
