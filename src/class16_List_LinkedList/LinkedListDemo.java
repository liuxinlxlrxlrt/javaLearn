package class16_List_LinkedList;
/*
 * LinkedList类特有功能
 * 		A：添加功能
 * 			public void addFirst(Object obj);
 * 			public void addLast(Object obj);
 * 		B.获取功能
 * 			public Object getFirst();
 * 			public Object getLast();
 * 		C.删除功能
 * 			public Object removeFirst();
 * 			public Object removeLast();
 */

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// 创建集合对象
		LinkedList link = new LinkedList();

		// 添加元素
		link.add("hello");
		link.add("world");
		link.add("java");

		// 添加功能
		// public void addFirst(Object obj);
		// link.addFirst("javaee");
		// 返回：link:[javaee, hello, world, java]
		// public void addLast(Object obj);
		// link.addLast("android");
		// 返回：link:[hello, world, java, android]

		// 获取功能
		// public Object getFirst();
		// System.out.println("getFirst:"+link.getFirst());
		// 返回：getFirst:hello
		// link:[hello, world, java, android]
		// public Object getLast();
		// System.out.println("getLast:"+link.getLast());
		// getLast:java
		// link:[hello, world, java]

		// 删除功能
		// public Object removeFirst();
		// System.out.println("removeFirst:"+link.removeFirst());
		// 返回：removeFirst:hello
		// link:[world, java]
		// public Object removeLast();
		// System.out.println("removeLast:"+link.removeLast());
		// 返回：removeLast:java
		// link:[hello, world]
		// 输出对象名
		System.out.println("link:" + link);
		// 返回的不是地址值,说明重写了：link:[hello, world, java]
	}
}
