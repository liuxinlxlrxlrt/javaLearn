package class18_Map_HashMap;
/*
 *  HashMap<String,String>
 *  键：Integer
 *  值：String
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//创建元素并添加元素
		//Integer i = new Integer(27);
		//Integer i = 27;
		//String s = "林青霞";
		//hm.put(i, s);
		//27是引用类型(Integer),做了自动装箱
		hm.put(27, "林青霞");
		hm.put(30, "风清扬");
		hm.put(28, "刘毅");
		hm.put(29, "林青霞");
		//0开头表示是八进制数据,八进制只能由0-7组成，008到8了所以不行
		//下面的写法是八进制,但是不能出现8以上的单个数据
//		hm.put(003, "hwllo");
//		hm.put(006, "hwllo");
//		hm.put(007, "hwllo");
//		hm.put(008, "hwllo");
		
		//遍历
		Set<Integer> set = hm.keySet();
		for(Integer key :set) {
			String value = hm.get(key);
			System.out.println(key+"---"+value);
		}
		//下面这种方式仅仅是集合的元素的字符串表示
		System.out.println("hm:"+hm);
		
		System.out.println("-----------------");
////		String s =Integer.valueOf(i);
////		String s1 = Integer.toString(i);
//		
//		Set<Map.Entry<String, String>> set = hm.entrySet();
//		
//		for(Map.Entry<String, String> me:set) {
//			String key =(String) me.getKey();
//			String value = me.getValue();
//			System.out.println(key+"---"+value);
//		}
//		
//		
		
		
	}
}
