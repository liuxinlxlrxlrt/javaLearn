package class16_List_LinkedList;

//LinkedList存储字符串并遍历

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList linked = new LinkedList();

		// 创建元素对象，并添加元素
		linked.add("hello");
		linked.add("world");
		linked.add("java");

		// 遍历
		Iterator it = linked.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("------------------");

		for (int x = 0; x < linked.size(); x++) {
			String s = (String) linked.get(x);
			System.out.println(s);
		}
	}
}
