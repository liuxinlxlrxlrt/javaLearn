package class18_Map_collections;
/*
 * Collections�������ArrayList�洢������װ���Ԫ�ؿ������򣬴洢�Զ������ɲ�����������?
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		//�������϶���
		List<Student> list = new ArrayList<Student>();
		
		//����ѧ������
		Student s1 = new Student("����ϼ",27);
		Student s2 = new Student("������",30);
		Student s3 = new Student("������",28);
		Student s4 = new Student("����",29);
		Student s5 = new Student("����ϼ",27);
		
		//���Ԫ�ض���
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//ArrayList���ȥ���ظ�
		//����
		//��Ȼ����Student implements Comparable<Student>
		//Collections.sort(list);//��Ȼ����
		//�Ƚ�������
		//���ͬʱ����Ȼ����ͱȽ�������,�ԱȽ�������Ϊ��
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {

					int num = s2.getAge()-s1.getAge();
					int num2=num==0?s2.getName().compareTo(s1.getName()):num;
					return num2;
			}
		});
		
		//��������
		for(Student s:list) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
