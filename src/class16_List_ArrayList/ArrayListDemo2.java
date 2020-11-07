package class16_List_ArrayList;
/*
 * ArrayList������ʹ��
 * 			�洢�Զ�����󲢱���
 */

import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����Ԫ�ض���
		Student s1 = new Student("�����", 23);
		Student s2 = new Student("��֮��", 23);
		Student s3 = new Student("�Ժ�ӣ��", 23);
		Student s4 = new Student("��ʫʫ", 23);
		Student s5 = new Student("�����", 23);

		// ��Ԫ�ض�����ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// ����
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("----------------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = (Student) array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
