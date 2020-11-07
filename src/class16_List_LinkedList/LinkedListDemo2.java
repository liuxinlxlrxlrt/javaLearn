package class16_List_LinkedList;

//LinkedList�洢�Զ�����󲢱���

import java.util.Iterator;
import java.util.LinkedList;
import class15_Collection.Student;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		LinkedList linked = new LinkedList();

		// ����Ԫ�ض���
		Student s1 = new Student("������", 23);
		Student s2 = new Student("����", 23);
		Student s3 = new Student("����Ӱ", 23);
		Student s4 = new Student("����", 23);
		Student s5 = new Student("����", 23);

		// ��Ԫ����ӵ�������ȥ
		linked.add(s1);
		linked.add(s2);
		linked.add(s3);
		linked.add(s4);
		linked.add(s5);

		// ����
		Iterator it = linked.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("---------------");

		for (int x = 0; x < linked.size(); x++) {
			Student s = (Student) linked.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
