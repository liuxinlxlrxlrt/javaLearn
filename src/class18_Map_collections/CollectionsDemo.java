package class18_Map_collections;
/*
 * Collections:��Լ��ϲ��� �Ĺ�����,���Ǿ�̬����
 * 
 * �����⣺
 * Collection��Collections������
 * Collection���ǵ��м��ϵĶ���ӿ�,���ӽӿ�List��Set.
 * Collections������Լ��ϵĲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * 
 * Collections��Ա����
 *		public static <T> void sort(List<T> list)��Ĭ�����������Ȼ����,
 *		public static <T> int binarySearch(List<?> list,T key):���ֲ���
 *		public static <T> T max(Collection<?> coll)�����ֵ
 *		public static void reverse(List<?> list)����ת
 *		public static void shuffle(List<?> list)������û�
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		//�������϶���
		List<Integer> list = new ArrayList<Integer>();
		
		//���Ԫ��
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:"+list);
		//����ֵ��list:[30, 20, 50, 10, 40]
		//public static <T> void sort(List<T> list)��Ĭ�����������Ȼ����
		//public final class Integer extends Number implements Comparable<Integer>
		//IntegerԪ��ʵ������Ȼ����ӿڵ�
		//Collections.sort(list);
		//System.out.println("list:"+list);
		//����ֵ��list:[10, 20, 30, 40, 50]
		
		//public static <T> int binarySearch(List<?> list,T key):���ֲ���
		//System.out.println("binarySearch:"+Collections.binarySearch(list,30));
		//����ֵ��binarySearch:2
		//System.out.println("binarySearch:"+Collections.binarySearch(list,300));
		//����ֵ��binarySearch:-6:(�Ҳ�����ʱ���������4+1)
		
		// *		public static <T> T max(Collection<?> coll)�����ֵ
		//System.out.println("Max:"+Collections.max(list));
		//����ֵ��Max:50
		//System.out.println("Max:"+Collections.binarySearch(list,300));
		//����ֵ��binarySearch:-6:(�Ҳ�����ʱ���������4+1)
		
		//public static void reverse(List<?> list)����ת
		//Collections.reverse(list);
		//System.out.println("list:"+list);
		//����ֵlist:[40, 10, 50, 20, 30]
		
		//public static void shuffle(List<?> list)������û�
		Collections.shuffle(list);
		System.out.println("list:"+list);
		//��һ�Σ�list:[20, 30, 10, 50, 40]
		//�ڶ��Σ�list:[20, 30, 40, 50, 10]
		//�����Σ�list:[30, 40, 10, 20, 50]
	}

}
