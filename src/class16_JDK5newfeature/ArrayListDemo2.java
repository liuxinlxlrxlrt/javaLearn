package class16_JDK5newfeature;

/*
 * ArrayLisy�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor����
 * 	A: ������
 * 	B: ��ͨfor
 * 	c: ��ǿfor
 * 
 * LinkedList,Vector,Collection.List�ȴ洢�һ����𣿲����ˣ�����Ҫ��������ϰ��
 * 
 * ��ǿfor��������������ġ�
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// ��������
		ArrayList<Student> array = new ArrayList<Student>();

		// ����ѧ������
		Student s1 = new Student("�����", 23);
		Student s2 = new Student("��֮��", 23);
		Student s3 = new Student("�Ժ�ӣ��", 23);
		Student s4 = new Student("��ʫʫ", 23);
		Student s5 = new Student("�����", 23);

		// ��ѧ��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// ����
		// ������
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("-----------------");
		// ��ͨfor
		for (int x = 0; x < array.size(); x++) {
			Student s = (Student) array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("-----------------");
		// ��ǿfor
		for (Student s : array) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
