package class17_Set_HashSet;

import java.util.HashSet;

import class17_Set_HashSet.Student;

/*
 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ��
 * 
 * Ŀǰ���������ҵ�Ҫ��ģ���Ϊ����֪��HashSet�ײ���������hashCode()��equals()����
 * ������������������ѧ������û����д��Ĭ����д��Object()��
 * ���ʱ�����ǵĹ�ϣֵ�ǲ���һ���ģ������Ͳ�������жϣ�ִ������Ӳ���
 */

public class HashSetDemo2 {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();
		
		//����ѧ������
		Student s1 = new Student("�����",27);
		Student s2 = new Student("��֮��",43);
		Student s3 = new Student("�Ժ�ӣ��",25);
		Student s4 = new Student("��ʫʫ",18);
		Student s5 = new Student("�����",27);
		Student s6 = new Student("�����",20);
		
		//���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		//��������
		for(Student s : hs) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
