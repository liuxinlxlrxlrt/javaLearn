package class15_Collection;
/*
 * ����1������whileд����������ܲ�����forѭ����
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest2 {
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
//					//java.util.NoSuchElementException����Ҫ���ʹ��it.next
//					System.out.println(((Student) it.next()).getName()+"---"+((Student) it.next()).getAge());
//					
			// ͨ����������Next()�ķ�����ȡԪ��
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		// forѭ���Ľ�
//				for(Iterator it = c.iterator();it.hasNext();) {
//					Student s = (Student)it.next();
//					System.out.println(s.getName()+"---"+s.getAge());
//				}
//
	}
}
