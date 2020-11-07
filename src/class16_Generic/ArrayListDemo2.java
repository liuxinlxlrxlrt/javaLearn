package class16_Generic;
/*
 * ���󣺴洢�Զ�����󲢱���
 * 
 * A������ѧ����
 * B���������϶���
 * C������Ԫ�ض���
 * D���Ѽ�����ӵ�����
 * E����������
 */

import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// �������϶���
		// JDK7�������ԣ������ƶ�
		// ArrayList<Student> array = new ArrayList();
		// �����Ҳ���������ʹ��
		ArrayList<Student> array = new ArrayList<Student>();

		// ����Ԫ�ض���
		Student s1 = new Student("��ʫʫ", 23);
		Student s2 = new Student("�����", 23);
		Student s3 = new Student("������", 23);
		Student s4 = new Student("����", 23);
		Student s5 = new Student("����Ӱ", 23);

		// �Ѽ�����ӵ�����
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// ����
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("-----------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
