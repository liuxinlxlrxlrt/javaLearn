package class18_Map_TreeMap;
/*
 * TreeMap:是基于红黑树的MAP接口的实现。
 * TreeMap<Student,String>
 * 键：Student
 * 值：String
 * 
 * 排序没告诉它怎么排序:必须告诉它怎么排序
 * 选的是无参构造，默认是自然排序,自然排序就必须重写compareTo(T o)方法,实现comparable接口
 * 但是我喜欢比较器排序
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import class18_Map_HashMap.Student;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		//创建集合对象
		//public final class String
		//implements Comparable<String>字符串本身实现了Comparable接口
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				//姓名长度
				int num = s1.getName().length()-s2.getName().length();
				//姓名内容
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				//年龄
				int num3= num2==0?s1.getAge()-s2.getAge():num2;
				return num3;
			}
		});
		
		//创建学生对象
		Student s1 = new Student("潘安",30);
		Student s2 = new Student("柳下惠",35);
		Student s3 = new Student("唐伯虎",33);
		Student s4 = new Student("燕青",33);
		Student s5 = new Student("唐伯虎",33);
		
		//添加元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");	
		tm.put(s3, "明朝");	
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");
		
		//遍历
		Set<Student> set = tm.keySet();
		for(Student key :set) {
			String value = tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}

}
