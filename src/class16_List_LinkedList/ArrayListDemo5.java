package class16_List_LinkedList;

/*
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
 * Ϊʲô�أ�
 * 		���Ǳ���˼�����������⣿
 * 		ͨ���򵥵ķ���������֪����������������ж���
 * 		������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ��Ҿ�Ӧ��ȥ��Դ��
 * contains()�����ĵײ���������equals()������
 * �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
 * ��Object��equals()����Ĭ�ϱȽϵ��ǵ�ֵַ���������Ƕ���ȥ�ˣ���Ϊ��new�Ķ�����ֵַ������ͬ
 * ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()�������ɡ�
 * ���Զ����ɼ��ɡ�
 */
import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("�����", 27);
		Student s2 = new Student("��֮��", 43);
		Student s3 = new Student("�Ժ�ӣ��", 25);
		Student s4 = new Student("��ʫʫ", 18);
		Student s5 = new Student("�����", 16);
		Student s6 = new Student("�����", 27);
		Student s7 = new Student("�����", 18);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		// �����¼���
		ArrayList newArray = new ArrayList();

		// �����ɼ��ϣ���ȡÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		System.out.println("----------------------");

		// ����
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
