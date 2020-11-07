package class17_Set_HashSet;

import java.util.HashSet;

/*
 * HashSet:存储字符串并遍历
 * 问题：为什么存储字符串值的时候，字符串内容相同的只存储了一个呢？
 * 通过查看add方法的源码，我们知道这个方法底层依赖hashCode和equals
 * 步骤：
 * 		首先比较哈希值
 * 		如果相同继续走，比较地址值或者走equals()
 * 		如果不同，就直接添加到集合中
 * 
 * 按照方法的步骤来说：
 * 		A：先看hashCode()值是否相同
 * 			相同：继续走equals()方法
 * 			   	返回true:说明元素重复，就不添加
 * 				返回false:就说明不重复，就添加到集合中
 * 			不同：就直接把元素添加到集合
 * 如果类没有重写这两个方法，默认使用的Object()，一般来说不会相同
 * 而String类重写了hashCode()和equals()方法，所以，它就可以把内容相同字符串去掉，只留下一个。
 */

public class HashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<String> hs = new HashSet<String>();
		
		//创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		//遍历集合
		for(String s: hs) {
			System.out.println(s);
		}
		//返回值：world、java、hello
	}
}
