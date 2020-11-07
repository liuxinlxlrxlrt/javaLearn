package class18_Map_exercises;
/*
 *  * HashMapǶ��HashMapǶ��HashMap(����Ƕ��)
 * Ϊ�˸�����Ҫ��
 * 		��ε����ݾͿ�����ѧ������
 * ���ǲ��ͣ�
 * bj ����У��
	 * 	jc	������
	 * 			 ����ϼ          27
	 * 			  ������	   30
	 * 	jy	��ҵ��
	 * 			  ����֥            28
	 * 			  ���� 	   29
 *  * sh �Ϻ�У��
	 * 	jc	������
	 * 			  ������         20
	 * 			  Ϭ����	   22
	 * 	jy	��ҵ��
	 * 			  �����            21
	 * 			  ���� 	   23
 *  * gz ����У��
	 * 	jc	������
	 * 			  ������         30
	 * 			  ���	   32
	 * 	jy	��ҵ��
	 * 			  ����             31
	 * 			  ���� 	   33
 *  * xa ����У��
	 * 	jc	������
	 * 			  ������         27
	 * 			  ����	   30
	 * 	jy	��ҵ��
	 * 			  �����             28
	 * 			  ��־�� 	   29
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import class18_Map_exercises.Student;

public class HashMapDemoInclude2HashMapDemo {

	public static void main(String[] args) {
		//�����󼯺�
		HashMap<String,HashMap<String,ArrayList<Student>>> czbkMap = new HashMap<String,HashMap<String,ArrayList<Student>>>();

		//����У������
		HashMap<String,ArrayList<Student>> bjCzbkMap = new HashMap<String,ArrayList<Student>>();
		
		ArrayList<Student> array1 = new ArrayList<Student>();
		Student s1 = new Student("����ϼ",27);
		Student s2 = new Student("������",30);
		array1.add(s1);
		array1.add(s2);
		
		ArrayList<Student> array2 = new ArrayList<Student>();
		Student s3 = new Student("����֥",28);
		Student s4 = new Student("����",29);
		array2.add(s3);
		array2.add(s4);
		bjCzbkMap.put("jc ������", array1);
		bjCzbkMap.put("jy ��ҵ��", array2);
		
		czbkMap.put("����У��", bjCzbkMap);
		
		//�Ϻ�У������
		HashMap<String,ArrayList<Student>> shCzbkMap = new HashMap<String,ArrayList<Student>>();
		
		ArrayList<Student> array3 = new ArrayList<Student>();
		Student s5 = new Student("������",20);
		Student s6 = new Student("Ϭ����",22);
		array3.add(s5);
		array3.add(s6);
		
		ArrayList<Student> array4 = new ArrayList<Student>();
		Student s7 = new Student("�����",21);
		Student s8 = new Student("����",23);
		array4.add(s7);
		array4.add(s8);
		shCzbkMap.put("jc ������", array3);
		shCzbkMap.put("jy ��ҵ��", array4);
		czbkMap.put("�Ϻ�У��", shCzbkMap);
		
//		//����У������
//		HashMap<String,ArrayList<Student>> gzCzbkMap = new HashMap<String,ArrayList<Student>>();
//		
//		ArrayList<Student> array5 = new ArrayList<Student>();
//		Student s9 = new Student("������",30);
//		Student s10 = new Student("���",32);
//		array5.add(s9);
//		array5.add(s10);
//		
//		ArrayList<Student> array6 = new ArrayList<Student>();
//		Student s11 = new Student("����",31);
//		Student s12 = new Student("����",33);
//		array6.add(s11);
//		array6.add(s12);
//		czbkMap.put("����У��", gzCzbkMap);
		
//		//����У������
//		HashMap<String,ArrayList<Student>> xaCzbkMap = new HashMap<String,ArrayList<Student>>();
//		
//		ArrayList<Student> array7 = new ArrayList<Student>();
//		Student s13 = new Student("������",30);
//		Student s14 = new Student("����",32);
//		array7.add(s13);
//		array7.add(s14);
//		
//		ArrayList<Student> array8 = new ArrayList<Student>();
//		Student s15 = new Student("�����",31);
//		Student s16 = new Student("��־��",33);
//		array8.add(s15);
//		array8.add(s16);
//		czbkMap.put("����У��", xaCzbkMap);
		
		//��������
		Set<String> czbkMapSet = czbkMap.keySet();
		
		for(String czbkMapKey : czbkMapSet) {
			System.out.println(czbkMapKey);
			
			HashMap<String,ArrayList<Student>> czbkMapValue = czbkMap.get(czbkMapKey);
			
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for(String czbkMapValueKey:czbkMapValueSet) {
				System.out.println("\t"+czbkMapValueKey);
				ArrayList<Student> czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				for(Student s : czbkMapValueValue) {
					System.out.println("\t\t"+s.getName()+"---"+s.getAge());
				}
			}
		}
	}

}
