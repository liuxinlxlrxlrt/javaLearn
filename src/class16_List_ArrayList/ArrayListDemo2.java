package class16_List_ArrayList;
/*
 * ArrayList案例的使用
 * 			存储自定义对象并遍历
 */

import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建元素对象
		Student s1 = new Student("李嘉欣", 23);
		Student s2 = new Student("关之琳", 23);
		Student s3 = new Student("赵韩樱子", 23);
		Student s4 = new Student("刘诗诗", 23);
		Student s5 = new Student("刘亦菲", 23);

		// 把元素对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// 遍历
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("----------------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = (Student) array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
