package class15_List;

/*
 * List���ϵ����б������ܣ�
 * 		size()��get()�����Ľ��
 */
import java.util.ArrayList;
import java.util.List;

public class ListIterator_Demo5 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");

		// ��ȡ����:Object get(int index);//��ȡָ��λ��Ԫ��
//	    	System.out.println(list.get(0));//���أ�hello
//	    	System.out.println(list.get(1));//���أ�world
//	    	System.out.println(list.get(2));//���أ�java
		// ���Ͽ��Կ������Ǽ��ϱ���������get��������������
//	    	//IndexOutOfBoundsException: Index: 3, Size: 3
//	    	System.out.println(list.get(3));

		// ��ѭ���Ľ�
//	    	for(int x=0;x<3;x++) {
//	    		System.out.println(list.get(x));
//	    	}

		// ���Ԫ�ع��࣬�������Ƚ��鷳����������ʹ�ü���һ�����ȹ��ܣ�size()
		// ���յı�����ʽ�ͣ�size()��get()�����ļ���
		for (int x = 0; x < list.size(); x++) {
			// System.out.println(list.get(x));

			String s = (String) list.get(x);
			System.out.println(s);
		}
	}
}
