package class15_Collection;
/*
 * 存储自定义对象并遍历
 * Student(name,age)
 * 分析：
 * 1.创建一个学生类
 * 2.创建集合对象
 * 3.创建学生对象
 * 4.将学生对象添加到集合中
 * 5.遍历
 *   5.1：创建集合的迭代器
 *   5.2：通过集合的hasNext()方法判断有没有元素
 *   5.3：通过集合的next()方法获取元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		Student s1 = new Student("李嘉欣", 23);
		Student s2 = new Student("关之琳", 23);
		Student s3 = new Student("赵韩樱子", 23);
		Student s4 = new Student("刘诗诗", 23);
		Student s5 = new Student("刘亦菲", 23);
		Student s6 = new Student("安以轩", 23);
		Student s7 = new Student("张萌", 23);
		Student s8 = new Student("江疏影", 23);
		Student s9 = new Student();
		s9.setName("唐艺昕");
		s9.setAge(23);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		c.add(s6);
		c.add(s7);
		c.add(s8);
		c.add(new Student("王艳", 23));// 匿名对象

		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
