package class15_Collection;
/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б���
 * 
 * ������
 *  A.����ѧ����
 *  B.�������϶���
 *  C.����ѧ������
 *  D.��ѧ����ӵ�����
 *  E.�Ѽ���ת������
 *  F.�ѱ�������
 */

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
	public static void main(String[] args) {
		// ����ѧ�����󼯺�
		Collection st = new ArrayList();

		// ���ѧ������
		Student s1 = new Student("lihao1", 11);
		Student s2 = new Student("lihao2", 12);
		Student s3 = new Student("lihao3", 13);
		Student s4 = new Student("lihao4", 14);
		Student s5 = new Student("lihao5", 15);

		// ��ѧ����ӵ�����
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);

		// ������ת��������
		Object[] objs = st.toArray();

		// ����
		for (int x = 0; x < objs.length; x++) {
			// System.out.println(objs[x]);//���һ����ֵַ
			Student s = (Student) objs[x];// ����ת��
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
