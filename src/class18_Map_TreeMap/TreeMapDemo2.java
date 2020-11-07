package class18_Map_TreeMap;
/*
 * TreeMap:�ǻ��ں������MAP�ӿڵ�ʵ�֡�
 * TreeMap<Student,String>
 * ����Student
 * ֵ��String
 * 
 * ����û��������ô����:�����������ô����
 * ѡ�����޲ι��죬Ĭ������Ȼ����,��Ȼ����ͱ�����дcompareTo(T o)����,ʵ��comparable�ӿ�
 * ������ϲ���Ƚ�������
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import class18_Map_HashMap.Student;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		//�������϶���
		//public final class String
		//implements Comparable<String>�ַ�������ʵ����Comparable�ӿ�
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				//��������
				int num = s1.getName().length()-s2.getName().length();
				//��������
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				//����
				int num3= num2==0?s1.getAge()-s2.getAge():num2;
				return num3;
			}
		});
		
		//����ѧ������
		Student s1 = new Student("�˰�",30);
		Student s2 = new Student("���»�",35);
		Student s3 = new Student("�Ʋ���",33);
		Student s4 = new Student("����",33);
		Student s5 = new Student("�Ʋ���",33);
		
		//���Ԫ��
		tm.put(s1, "�γ�");
		tm.put(s2, "Ԫ��");	
		tm.put(s3, "����");	
		tm.put(s4, "�峯");
		tm.put(s5, "����");
		
		//����
		Set<Student> set = tm.keySet();
		for(Student key :set) {
			String value = tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}

}
