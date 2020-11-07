package class15_Collection;
/*
 * �洢�Զ�����󲢱���
 * Student(name,age)
 * ������
 * 1.����һ��ѧ����
 * 2.�������϶���
 * 3.����ѧ������
 * 4.��ѧ��������ӵ�������
 * 5.����
 *   5.1���������ϵĵ�����
 *   5.2��ͨ�����ϵ�hasNext()�����ж���û��Ԫ��
 *   5.3��ͨ�����ϵ�next()������ȡԪ��
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		Student s1 = new Student("�����", 23);
		Student s2 = new Student("��֮��", 23);
		Student s3 = new Student("�Ժ�ӣ��", 23);
		Student s4 = new Student("��ʫʫ", 23);
		Student s5 = new Student("�����", 23);
		Student s6 = new Student("������", 23);
		Student s7 = new Student("����", 23);
		Student s8 = new Student("����Ӱ", 23);
		Student s9 = new Student();
		s9.setName("�����");
		s9.setAge(23);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		c.add(s6);
		c.add(s7);
		c.add(s8);
		c.add(new Student("����", 23));// ��������

		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
