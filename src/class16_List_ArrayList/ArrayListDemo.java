package class16_List_ArrayList;



/*
 * 3.	List�������ص㣺������)
ArrayList:
	�ײ����ݽṹʱ���飬��ѯ�죬��ɾ����
	�̲߳���ȫ��Ч�ʸߣ� 

Vector:
	�ײ����ݽṹʱ���飬��ѯ�죬��ɾ��
	�̰߳�ȫ��Ч�ʵ�

LinkedList:
   �ײ����ݽṹ����������ѯ������ɾ�죬
	�̲߳���ȫ��Ч�ʸߣ� 

 ArrayList������ʹ��
 		�洢�ַ���������
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����Ԫ�ض��󣬲�����Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");

		// ����
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("-------------------");

		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}
}