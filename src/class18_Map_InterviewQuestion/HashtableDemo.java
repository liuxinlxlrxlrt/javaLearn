package class18_Map_InterviewQuestion;

import java.util.Hashtable;

/*1.HashMap和Hashtable的区别
 * Hashtable:线程安全，效率低,不允许null键和null值
 * HashMap：线程不安全，效率高,允许null键和null值
 * 
 * 2.List,Set,Map等接口是否都继承自Map接口
 * List,Set不是继承自Map接口，他们继承自Collection接口
 * Map接口本身就是一个顶层接口
 */

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> hm = new Hashtable<String,String>();
		
		hm.put("it001", "hello");
		
		//hm.put(null, "world");
		//返回NullPointerException
		//hm.put("java", null);
		//返回NullPointerException
		System.out.println(hm);
		
		//返回NullPointerException
	}
}
