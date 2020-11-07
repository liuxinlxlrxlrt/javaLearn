package class16_JDK5newfeature;

/*
 * ArrayLisy存储自定义对象并遍历，要求加入泛型，并用增强for遍历
 * 	A: 迭代器
 * 	B: 普通for
 * 	c: 增强for
 * 
 * LinkedList,Vector,Collection.List等存储我还讲吗？不讲了，但是要求你们练习。
 * 
 * 增强for用来替代迭代器的。
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import class15_Collection.Student;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合
		ArrayList<Student> array = new ArrayList<Student>();

		// 创建学生对象
		Student s1 = new Student("李嘉欣", 23);
		Student s2 = new Student("关之琳", 23);
		Student s3 = new Student("赵韩樱子", 23);
		Student s4 = new Student("刘诗诗", 23);
		Student s5 = new Student("刘亦菲", 23);

		// 把学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);

		// 遍历
		// 迭代器
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("-----------------");
		// 普通for
		for (int x = 0; x < array.size(); x++) {
			Student s = (Student) array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("-----------------");
		// 增强for
		for (Student s : array) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
