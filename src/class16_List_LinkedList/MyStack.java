package class16_List_LinkedList;

/**
 * �Զ����ջ����
 * @author ������
 * @version V1.0
 *
 */

import java.util.LinkedList;

public class MyStack {
	// �����Ա����link
	private LinkedList link;

	// ����MyStack�Ĺ��췽��,�ڲ������new LinkedList();���϶���
	public MyStack() {
		link = new LinkedList();
	}

	// ����࣬�ײ����link��addFirst()����
	public void add(Object obj) {
		link.addFirst(obj);

	}

	// ջ���ص����Ƚ����,���Ļ������ǵ�ջ
	public Object get() {
		// return link.getFirst();
		return link.removeFirst();
	}

	// �ж��Ƿ�Ϊ��
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
