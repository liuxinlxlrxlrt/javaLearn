package class17_Set_TreeSet;

import java.util.TreeSet;
import class17_Set_TreeSet.Student;

/*
 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ
 * A:��û�и�������ô����
 * 		��Ȼ���򣺰��������С��������
 * B��Ԫ��ʲô�������Ψһ����Ҳû������
 * 		��Ա��������ͬ��ΪͬһԪ��
 */

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//�������϶���
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//����Ԫ��
		Student s1 = new Student("lijiaxin",27);
		Student s2 = new Student("guanzhiling",29);
		Student s3 = new Student("zhaohanyingzi",23);
		Student s4 = new Student("liuyifei",22);
		Student s5 = new Student("lijiaxin",27);
		Student s6 = new Student("lizhi",18);
		Student s7 = new Student("xulu",27);
		Student s8 = new Student("lijiaxin",28);
		
		//���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		
		//����
		//ClassCastException: class15_Collection.Student cannot be cast to java.lang.Comparable
		for(Student s: ts) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
		

	}

}
