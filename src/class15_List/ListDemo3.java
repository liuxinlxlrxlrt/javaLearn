package class15_List;

/*
 * 存储自定义对象并遍历
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import class15_Collection.Student;

public class ListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("李嘉欣", 23);
		Student s2 = new Student("关之琳", 23);
		Student s3 = new Student("赵韩樱子", 23);

		// 把学生对象添加到集合对象中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
