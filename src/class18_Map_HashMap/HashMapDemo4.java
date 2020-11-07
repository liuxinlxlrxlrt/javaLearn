package class18_Map_HashMap;
/*
 * HashMap<Student,String>
 *  键：Student
 *  	要求：如果两个对象的成员变量值都相同，则为同一个对象
 *  	同一个键键相同,值覆盖，但是值没有覆盖，为什么？
 *  	答：因为键依赖于哈希结构,底层依赖于hashCode()和equals()方法,
 *  		重写hashCode()和equals()方法,所以就能保证唯一性,就不会出现键相同的情况。
 *  值：String
 */

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {

	public static void main(String[] args) {
		//创建集合对象
		HashMap<Student,String> hm = new HashMap<Student,String>();
		
		//创建学生对象
		Student s1 = new Student("貂蝉",27);
		Student s2 = new Student("王昭君",30);
		Student s3 = new Student("西施",33);
		Student s4 = new Student("杨玉环",35);
		Student s5 = new Student("貂蝉",27);
		
		//添加元素
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");
		
		//遍历
		Set<Student> set = hm.keySet();
		for(Student key :set) {
			String value = hm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
	}

}
