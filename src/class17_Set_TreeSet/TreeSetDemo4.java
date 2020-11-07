package class17_Set_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;
import class17_Set_TreeSet.Student2;
/*
 * 
 * ����3���밴�������ĳ�������
 * TreeSet���ϱ�֤Ԫ�ص������Ψһ�Ե�ԭ��
 * Ψһ�ԣ��Ǹ��ݱȽϵķ�����0�������ġ�
 * ����
 * 		A����Ȼ����
 * 			��Ԫ����������ʵ����Ȼ����ӿ�Comparable
 * 		B���Ƚ�������
 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ��������Comparator
 */

public class TreeSetDemo4 {
	public static void main(String[] args) {
		//�������϶���
		//TreeSet<Student1> ts = new TreeSet<Student1>();//��Ȼ����
		//public TreeSet(Comparator comparator)//�Ƚ�������
		//TreeSet<Student2> ts = new TreeSet<Student2>(new MyComparator());
		
		//���һ�������Ĳ����ǽӿ�,��ô����Ҫ���ǽӿڵ���ʵ����Ķ���
		//�������ڲ���Ϳ���ʵ���������(ֻ��һ�εĻ�):����/�ӿ���(������д�ķ���)
		//�������ʵ���˸ýӿڻ����Ǽ̳��˸��������Ķ��󣬴����ǽӿڣ�ǡ�ô������������
		TreeSet<Student2> ts = new TreeSet<Student2>(new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				//int num = this.name.length()-s.name.length();
				//this---s1
				//s---s2
				//��������
				int num = s1.getName().length()-s2.getName().length();
				//��������
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()):num;
				//����
				int num3 =num2 ==0? s1.getAge()-s2.getAge():num2;
				return num3;
			}
		});
		//����Ԫ��
		Student2 s1 = new Student2("linqingxia",27);
		Student2 s2 = new Student2("zhangguorong",29);
		Student2 s3 = new Student2("wanglihong",23);
		Student2 s4 = new Student2("linqingxia",27);
		Student2 s5 = new Student2("liushishi",22);
		Student2 s6 = new Student2("wuqilong",40);
		Student2 s7 = new Student2("fengqingy",22);
		Student2 s8 = new Student2("linqingxia",29);
		
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
		for(Student2 s: ts) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
		

	}

}
