package class15_Collection;
/*
 * Iterator iterator();迭代器，集合的专用遍历方式
 * 		A.Object next();获取元素,并移动到下一个位置
 * 		B.NoSuchElementException，没有这样的元素，因为你已经找到最后了
 * 		C.boolean hasNext();如果仍有迭代就返回true，没有就false
 * 		D.next();返回下一个元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		// 创建集合
		Collection c = new ArrayList();

		// 创建并添加元素
//		String s = "hello";
//		c.add(s);

		c.add("hello");
		c.add("world");
		c.add("java");

		// 获取功能：Iterator iterator();迭代器，集合的专用遍历方式
		Iterator it = c.iterator();// 实际返回的肯定是子类对象，这里是多态

//		Object obj = it.next();
//		System.out.println(obj);//输出hello
//		System.out.println(it.next());//hello
//		System.out.println(it.next());//world
//		System.out.println(it.next());//java
//		System.out.println(it.next());//NoSuchElementException
//		//最后一个不该写，所以我们应该每次获取前应该有一个判断就好了
		// 判断是否有下一个元素，有就获取，没有就不搭理它

//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
