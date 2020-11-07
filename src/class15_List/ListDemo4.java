package class15_List;

/*
 * List���ϵ����й��ܣ�
 * A����ӹ���
 * 		void add(int index,Object element);//��ָ��λ�����Ԫ��
 * B����ȡ����
 * 		Object get(int index);//��ȡָ��λ��Ԫ��
 * C���б������
 * 		ListIterator listIterator();//�б��е�������Ԫ�أ�List�������еĵ�����
 * 		ListIterator listIterator(int index);//�б��д�ָ��λ�ÿ�ʼ����Ԫ��
 * D��ɾ������
 * 		object remove(int index);//��������ɾ��Ԫ��,����ɾ����Ԫ��
 * E���޸Ĺ���
 * 		Object set(int index,Object element);���������޸�Ԫ��,�����޸ĵ�Ԫ��
 * F����ȡ����
 * 		subList(int fromIndex,int toIndex);���ݿ�ʼ�ͽ�������������ָ�����ص�Ԫ��
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java1");
		list.add("java-2");
		list.add("java3");
		list.add("java-4");

		// B.��ӹ��ܣ�void add(int index,Object element);//��ָ��λ�����Ԫ��
//    	   list.add(1,"andriod");
//    	   System.out.println("list:"+list);
//    	   //IndexOutOfBoundsException: Index: 31, Size: 4
//    	   list.add(4,"javaee");//������

//    	   //C.��ȡ���ܣ�Object get(int index);//��ȡָ��λ��Ԫ��
//    	   System.out.println("get:"+list.get(0));//get:hello
//    	   System.out.println("get:"+list.get(2));//get:java
//    	   System.out.println("get:"+list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3

		// D��ɾ������:object remove(int index);//��������ɾ��Ԫ��,����ɾ����Ԫ��
//    	   System.out.println("remove:"+list.remove(1));//���أ�remove:world
//    	   System.out.println("remove:"+list.remove(3));//���أ�IndexOutOfBoundsException: Index: 3, Size: 2

		// E���޸Ĺ���:Object set(int index,Object element);���������޸�Ԫ��,�����޸ĵ�Ԫ��
//			  System.out.println("set:"+list.set(1, "javaee")); ���أ�set:world

//			System.out.println("set:"+list.set(3, "toString"));//IndexOutOfBoundsException: Index: 3, Size: 3
		// F����ȡ����:subList(int fromIndex,int toIndex);���ݿ�ʼ�ͽ�������������ָ�����ص�Ԫ��

		// ��ȡ���ܣ�subList(int fromIndex,int toIndex);���ݿ�ʼ�ͽ�������������ָ�����ص�Ԫ��
		System.out.println("list:" + list.subList(1, 6));
		System.out.println("list:" + list);
	}
}
