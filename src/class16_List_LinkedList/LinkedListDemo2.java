package class16_List_LinkedList;

//LinkedList存储自定义对象并遍历

import java.util.Iterator;
import java.util.LinkedList;
import class15_Collection.Student;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList linked = new LinkedList();

		// 创建元素对象
		Student s1 = new Student("安以轩", 23);
		Student s2 = new Student("张萌", 23);
		Student s3 = new Student("江疏影", 23);
		Student s4 = new Student("许晴", 23);
		Student s5 = new Student("王艳", 23);

		// 把元素添加到集合中去
		linked.add(s1);
		linked.add(s2);
		linked.add(s3);
		linked.add(s4);
		linked.add(s5);

		// 遍历
		Iterator it = linked.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("---------------");

		for (int x = 0; x < linked.size(); x++) {
			Student s = (Student) linked.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
