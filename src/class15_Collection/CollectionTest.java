package class15_Collection;



/*
 * ���󣺴洢�ַ���������
 * 
 * ������
 * 		1.�������϶���
 * 		2.�����ַ�����
 * 		3.���ַ�����ӵ�������
 * 		4.��������
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// �����ַ�������
		// ���ַ�����ӵ�������
		c.add("Ԭ����");
		c.add("�ܱ^�");
		c.add("������");
		c.add("����");
		c.add("��ԲԲ");

		// ��������
		// ͨ�����϶����ȡ����������
		Iterator it = c.iterator();
		// ͨ����������hasNext()�ķ����ж���û��Ԫ��
		while (it.hasNext()) {
			// ͨ����������Next()�ķ�����ȡԪ��
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
