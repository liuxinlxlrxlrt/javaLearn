package class15_List;

/*
 * �洢�Զ�����󲢱���
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import class15_Collection.Student;

public class ListDemo3 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("�����", 23);
		Student s2 = new Student("��֮��", 23);
		Student s3 = new Student("�Ժ�ӣ��", 23);

		// ��ѧ��������ӵ����϶�����
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// ����
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
