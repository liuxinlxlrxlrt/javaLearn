package class17_Set_TreeSet;

import java.util.TreeSet;
import class17_Set_TreeSet.Student;

/*
 * TreeSet存储自定义对象并保证排序和唯一
 * A:你没有告诉我怎么排序
 * 		自然排序：按照年龄从小到大排序
 * B：元素什么情况下算唯一，你也没告诉我
 * 		成员变量都相同即为同一元素
 */

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//创建集合对象
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//创建元素
		Student s1 = new Student("lijiaxin",27);
		Student s2 = new Student("guanzhiling",29);
		Student s3 = new Student("zhaohanyingzi",23);
		Student s4 = new Student("liuyifei",22);
		Student s5 = new Student("lijiaxin",27);
		Student s6 = new Student("lizhi",18);
		Student s7 = new Student("xulu",27);
		Student s8 = new Student("lijiaxin",28);
		
		//添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		
		//遍历
		//ClassCastException: class15_Collection.Student cannot be cast to java.lang.Comparable
		for(Student s: ts) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
		

	}

}
