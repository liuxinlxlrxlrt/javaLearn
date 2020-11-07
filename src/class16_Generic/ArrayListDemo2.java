package class16_Generic;
/*
 * 需求：存储自定义对象并遍历
 * 
 * A：创建学生类
 * B：创建集合对象
 * C：创建元素对象
 * D：把集合添加到集合
 * E：遍历集合
 */

import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		// JDK7的新特性：泛型推断
		// ArrayList<Student> array = new ArrayList();
		// 但是我不建议这样使用
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建元素对象
		Student s1 = new Student("刘诗诗", 23);
		Student s2 = new Student("刘亦菲", 23);
		Student s3 = new Student("安以轩", 23);
		Student s4 = new Student("张萌", 23);
		Student s5 = new Student("江疏影", 23);

		// 把集合添加到集合
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// 遍历
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("-----------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
