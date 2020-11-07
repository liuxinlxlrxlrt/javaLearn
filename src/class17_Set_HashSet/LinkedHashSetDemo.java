package class17_Set_HashSet;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:底层数据结构由哈希表和链接列表实现
 * 哈希表保证元素的唯一性
 * 链表保证元素有序（存储和取出是一致）
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//创建并添加元素
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("world");
		lhs.add("java");
		
		//历遍
		for(String s : lhs) {
			System.out.println(s);
		}
	}
}
