package class15_List;

/*
 * ���⣿
 * 		�������һ���������£����ʣ������ж���û�С�world����Ԫ�أ�����У��Ҿ����һ����javaee��Ԫ�أ���д����ʵ��
 * ConcurrentModificationException����������⵽����Ĳ����޸ģ����ǲ����������޸�ʱ���׳����쳣
 * ����ԭ��
		������ʱ�����ڼ��ϴ��ڵģ����жϳɹ��󣬼������������Ԫ�أ���������ȴ��֪�������Ա����ˣ������в����޸��쳣
		��ʵ��������������ǣ�˵���˵���������Ԫ�صģ������ǲ���ȥ�޸�Ԫ�أ�
	��ν���أ�
		A.����������Ԫ�أ��������޸�Ԫ��
			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ����
		B.���ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
			Ԫ���������ӵ�
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo8 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// ����������
		// Iterator it = list.iterator();

		// ���жϳɹ��󣬼������������Ԫ�أ���������ȴ��֪�������Ա�����,�����в����޸��쳣
//	    	while(it.hasNext()) {
//	    		String s = (String) it.next();
//	    		if("world".equals(s)) {
//	    			list.add("javaee");
//	    		}
//	    	}

		// ��ʽһ������������Ԫ�أ��������޸�Ԫ��
		// ��Iterator������ȴû����ӹ��ܣ���������ʹ�����ӽӿ�ListIterator
//	    	ListIterator lit = list.listIterator();
//	    	while(lit.hasNext()) {
//	    		String s = (String) lit.next();
//	    		if("world".equals(s)) {
//	    			lit.add("javaee");
//	    		}
//	    		
//	    	}

		// ��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		System.out.println("list:" + list);
	}
}
