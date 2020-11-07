package class15_Collection;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б���
 * 
 * ע�⣺
 * A.�Լ���������Ҫ������ѧϰ��Ҫ�õ�API�е�������ͬ
 * B.���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ�����������׳��ֲ�����������
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("lihao1", 11);
		Student s2 = new Student("lihao2", 12);
		Student s3 = new Student("lihao3", 13);
		Student s4 = new Student("lihao4", 14);
		Student s5 = new Student("lihao5", 15);

		// ��ѧ����ӵ�������
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// ����
		Iterator it = c.iterator();
		// ͨ����������hasNext()�ķ����ж���û��Ԫ��
		while (it.hasNext()) {
//			System.out.println(it.next());
			// ͨ����������Next()�ķ�����ȡԪ��
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
