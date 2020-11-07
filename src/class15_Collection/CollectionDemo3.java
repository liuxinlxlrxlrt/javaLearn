package class15_Collection;
/*
 * 集合的遍历：其实就是一次获取集合中的每一个元素
 * Object[] toArray();把集合转成数组，可以实现集合的遍历
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 添加元素
		c.add("hello");// Object obj = "hello";向上转型
		c.add("world");
		c.add("java");

		// 遍历
		// 把集合转换成数组：Object[] toArray();把集合转成数组，可以实现集合的遍历
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			// 里边每一个集合中的值
			// System.out.println(objs[x]);

			// 我知道元素是字符串，我在获取到元素的同时，还想知道元素的长度
			// System.out.println(objs[x]+"---"+objs[x].length());
			// 为什么错了？因为objs[x]是一个元素，元素是object类型，object类型没有length()方法
			// for(int x=0;x<objs.length;x++)为什么可以呢？
			// 因为默认调用的objs的toString方法

			// 上面的实现不了,原因是object中没有length()方法
			// 我们想要使用字符串的方法，就必须把元素还原成字符串
			// 向下转型
			String s = (String) objs[x];
			System.out.println(s + "---" + s.length());
		}
	}
}
