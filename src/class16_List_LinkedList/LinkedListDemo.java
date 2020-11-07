package class16_List_LinkedList;
/*
 * LinkedList�����й���
 * 		A����ӹ���
 * 			public void addFirst(Object obj);
 * 			public void addLast(Object obj);
 * 		B.��ȡ����
 * 			public Object getFirst();
 * 			public Object getLast();
 * 		C.ɾ������
 * 			public Object removeFirst();
 * 			public Object removeLast();
 */

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// �������϶���
		LinkedList link = new LinkedList();

		// ���Ԫ��
		link.add("hello");
		link.add("world");
		link.add("java");

		// ��ӹ���
		// public void addFirst(Object obj);
		// link.addFirst("javaee");
		// ���أ�link:[javaee, hello, world, java]
		// public void addLast(Object obj);
		// link.addLast("android");
		// ���أ�link:[hello, world, java, android]

		// ��ȡ����
		// public Object getFirst();
		// System.out.println("getFirst:"+link.getFirst());
		// ���أ�getFirst:hello
		// link:[hello, world, java, android]
		// public Object getLast();
		// System.out.println("getLast:"+link.getLast());
		// getLast:java
		// link:[hello, world, java]

		// ɾ������
		// public Object removeFirst();
		// System.out.println("removeFirst:"+link.removeFirst());
		// ���أ�removeFirst:hello
		// link:[world, java]
		// public Object removeLast();
		// System.out.println("removeLast:"+link.removeLast());
		// ���أ�removeLast:java
		// link:[hello, world]
		// ���������
		System.out.println("link:" + link);
		// ���صĲ��ǵ�ֵַ,˵����д�ˣ�link:[hello, world, java]
	}
}
