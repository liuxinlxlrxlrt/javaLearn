package class15_Collection;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历
 * 
 * 注意：
 * A.自己的类名不要和我们学习的要用的API中的类名相同
 * B.复制代码的时候，很容易把那个类所在的包也导过来，容易出现不能理解的问题
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
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
//			System.out.println(it.next());
			// 通过迭代器的Next()的方法获取元素
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
