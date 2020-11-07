package class18_Map_TreeMap;
/*
 * TreeMap:是基于红黑树的MAP接口的实现。
 * TreeMap<String,String>
 * 键：String
 * 值：String
 * 
 * 无参构造：用的是自然排序，自然排序就必须让对象所属的类实现comparable接口
 * 
 */

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//创建集合对象
		//public final class String
		//implements Comparable<String>字符串本身实现了Comparable接口
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		//创建元素并添加元素
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪哇");
		tm.put("world", "世界2");
		tm.put("javaee", "爪哇EE");
		
		//遍历集合
		Set<String> set = tm.keySet();
		for(String key :set) {
			String value = tm.get(key);
			System.out.println(key+"---"+value);
		}
		//返回：hello---你好
//				java---爪哇
//				javaee---爪哇EE
//				world---世界2
		
	}
}
