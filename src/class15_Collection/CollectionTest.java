package class15_Collection;



/*
 * 需求：存储字符串并遍历
 * 
 * 分析：
 * 		1.创建集合对象
 * 		2.创建字符对象
 * 		3.把字符串添加到集合中
 * 		4.遍历集合
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建字符串对象
		// 把字符串添加到集合中
		c.add("袁佳敏");
		c.add("周盺妤");
		c.add("张梓琳");
		c.add("乔欣");
		c.add("高圆圆");

		// 遍历集合
		// 通过集合对象获取迭代器对象
		Iterator it = c.iterator();
		// 通过迭代器的hasNext()的方法判断有没有元素
		while (it.hasNext()) {
			// 通过迭代器的Next()的方法获取元素
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
