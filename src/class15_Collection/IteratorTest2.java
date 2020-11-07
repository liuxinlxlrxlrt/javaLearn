package class15_Collection;
/*
 * 问题1：能用while写这个程序，我能不能用for循环呢
 * 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("lihao1", 11);
		Student s2 = new Student("lihao2", 12);
		Student s3 = new Student("lihao3", 13);
		Student s4 = new Student("lihao4", 14);
		Student s5 = new Student("lihao5", 15);

		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 遍历
		Iterator it = c.iterator();
		// 通过迭代器的hasNext()的方法判断有没有元素
		while (it.hasNext()) {
//					//java.util.NoSuchElementException；不要多次使用it.next
//					System.out.println(((Student) it.next()).getName()+"---"+((Student) it.next()).getAge());
//					
			// 通过迭代器的Next()的方法获取元素
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		// for循环改进
//				for(Iterator it = c.iterator();it.hasNext();) {
//					Student s = (Student)it.next();
//					System.out.println(s.getName()+"---"+s.getAge());
//				}
//
	}
}
