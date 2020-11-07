package class15_Collection;

/*
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *		 学生：Student
 *		 成员变量：name,age
 *		 构造方法：无参,带参
 *		 成员方法：getXxx()/setXxx()
 *		 存储学生的数组?自己想想应该是什么样子的?
 * 分析：
 * 		A:创建学生类。
 * 		B:创建学生数组(对象数组)。
 * 		C:创建5个学生对象，并赋值。
 * 		D:把C步骤的元素，放到数组中。
 * 		E:遍历学生数组。
 */

public class ObjectArray {
	public static void main(String[] args) {
		// 创建学生数组(对象数组)
		StudentArray[] students = new StudentArray[5];

		// 创建5个学生对象，并赋值
		StudentArray s1 = new StudentArray("高圆圆", 29);
		StudentArray s2 = new StudentArray("景甜", 28);
		StudentArray s3 = new StudentArray("许晴", 27);
		StudentArray s4 = new StudentArray("刘亦菲", 26);
		StudentArray s5 = new StudentArray("江疏影", 25);

		// 把C步骤的元素，放到数组中
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// 看到很相似，就想循环改
		// for (int x = 0; x < students.length; x++) {
		// students[x] = s + "" + (x + 1);
		// }
		// 这个是有问题的

		// 遍历
		for (int x = 0; x < students.length; x++) {
			// System.out.println(students[x]);

			StudentArray s = students[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
