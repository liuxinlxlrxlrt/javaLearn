package class18_Map_collections;
/*
 * Collections可以针对ArrayList存储基本包装类的元素可以排序，存储自定义对象可不可以排序呢?
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		//创建集合对象
		List<Student> list = new ArrayList<Student>();
		
		//创建学生对象
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("风清扬",30);
		Student s3 = new Student("刘晓曲",28);
		Student s4 = new Student("武鑫",29);
		Student s5 = new Student("林青霞",27);
		
		//添加元素对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//ArrayList如何去除重复
		//排序
		//自然排序：Student implements Comparable<Student>
		//Collections.sort(list);//自然排序
		//比较器排序
		//如果同时有自然排序和比较器排序,以比较器排序为主
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {

					int num = s2.getAge()-s1.getAge();
					int num2=num==0?s2.getName().compareTo(s1.getName()):num;
					return num2;
			}
		});
		
		//遍历集合
		for(Student s:list) {
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
