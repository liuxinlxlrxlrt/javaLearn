package class15_Collection;
/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历
 * 
 * 分析：
 *  A.创建学生类
 *  B.创建集合对象
 *  C.创建学生对象
 *  D.把学生添加到集合
 *  E.把集合转成数组
 *  F.把遍历数组
 */

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
	public static void main(String[] args) {
		// 创建学生对象集合
		Collection st = new ArrayList();

		// 添加学生对象
		Student s1 = new Student("lihao1", 11);
		Student s2 = new Student("lihao2", 12);
		Student s3 = new Student("lihao3", 13);
		Student s4 = new Student("lihao4", 14);
		Student s5 = new Student("lihao5", 15);

		// 把学生添加到集合
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);

		// 将集合转换成数组
		Object[] objs = st.toArray();

		// 遍历
		for (int x = 0; x < objs.length; x++) {
			// System.out.println(objs[x]);//打的一串地址值
			Student s = (Student) objs[x];// 向下转型
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
