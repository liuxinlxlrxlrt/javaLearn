package class16_JDK5newfeature;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班级有学生，每一个学生是不是一个对象，所以我们可以使用建一个集合标识我们班级的学生
 * 		ArrayList<Student>,但是呢？我们旁边是不是还有班级，每一个班级是不是也是一个ArrayList<Student>,
 * 		而我现在有多个ArrayList<Student>,也要用集合存储，怎么办呢？
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
import java.util.ArrayList;

public class ArrayListDemoHW {
	public static void main(String[] args) {
		// 创建大集合
		ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

		// 创建第一个班级的学生集合
		ArrayList<Student> firstArrayList = new ArrayList<Student>();

		Student s1 = new Student("唐生", 30);
		Student s2 = new Student("孙悟空", 29);
		Student s3 = new Student("猪八戒", 28);
		Student s4 = new Student("沙僧", 27);
		Student s5 = new Student("白龙马", 26);

		// 学生进班
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);

		// 把第一个班级存储到学生系统中
		bigArrayList.add(firstArrayList);

		// 创建第二个班级的学生集合
		ArrayList<Student> secondArrayList = new ArrayList<Student>();

		Student s11 = new Student("诸葛亮", 30);
		Student s22 = new Student("司马懿", 28);
		Student s33 = new Student("周瑜", 26);

		// 学生进班
		secondArrayList.add(s1);
		secondArrayList.add(s2);
		secondArrayList.add(s3);

		// 把第二个班级存储到学生系统中
		bigArrayList.add(secondArrayList);

		// 创建第三个班级的学生集合
		ArrayList<Student> thirdArrayList = new ArrayList<Student>();

		Student s111 = new Student("宋江", 40);
		Student s222 = new Student("吴用", 35);
		Student s333 = new Student("高俅", 30);
		Student s444 = new Student("李师师", 22);

		// 学生进班
		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);

		// 把第三个班级存储到学生系统中
		bigArrayList.add(thirdArrayList);

		// 遍历集合
		for (ArrayList<Student> array : bigArrayList) {
			for (Student s : array) {
				System.out.println(s.getName() + "---" + s.getAge());
			}
		}
	}
}
