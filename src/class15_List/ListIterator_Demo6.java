package class15_List;

/*
 * 存储自定义对象并遍历,用普通for循环(size()和get()结合)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import class15_Collection.Student;

public class ListIterator_Demo6 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("李嘉欣", 23);
		Student s2 = new Student("关之琳", 23);
		Student s3 = new Student("赵韩樱子", 23);

		// 把学生添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		// 迭代遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("-----------------");

		// 普通for循环
		for (int x = 0; x < list.size(); x++) {
			Student s = (Student) list.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
