package class17_Set_TreeSet;

import java.util.TreeSet;
import class17_Set_TreeSet.Student1;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		TreeSet<Student1> ts = new TreeSet<Student1>();
		
		//创建元素
		Student1 s1 = new Student1("linqingxia",27);
		Student1 s2 = new Student1("zhangguorong",29);
		Student1 s3 = new Student1("wanglihong",23);
		Student1 s4 = new Student1("linqingxia",27);
		Student1 s5 = new Student1("liushishi",22);
		Student1 s6 = new Student1("wuqilong",40);
		Student1 s7 = new Student1("fengqingy",22);
		Student1 s8 = new Student1("linqingxia",29);
		
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
		for(Student1 s: ts) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
		

	}

}
