package class18_Map_HashMap;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap：是基于哈希表的Map结构实现
 * 哈希表的作用是用来保证键的唯一性的。
 * 
 *  HashMap<String,String>
 *  键：String
 *  值：String
 */

public class HashMapDemo {
		public static void main(String[] args) {
			//创建集合对象
			HashMap<String,String> hm = new HashMap<String,String>();
			
			//创建元素并添加元素
//			String key1 = "it001"
//			String value1 = "马云"
//			hm.put(key1, value1);
			
			hm.put("it001", "马云");
			hm.put("it003", "马化腾");
			hm.put("it004", "乔布斯");
			hm.put("it005", "张朝阳");
			hm.put("it002", "裘伯君");//wps
			hm.put("it001", "比尔盖茨");
			
			//遍历
			Set<String> set = hm.keySet();
			for(String key : set){
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			
			//为什么没有马云了呢？
			//因为这是键是唯一的，HashMap是基于哈希表的结构，底层依赖于hashCode()和equals()方法,
			//现在键是String,String重写了hashCode()和equals()方法,所以就能保证唯一性。
			
		}
}
