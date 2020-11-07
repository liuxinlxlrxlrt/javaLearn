package class18_Map01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合的遍历
 * map---夫妻对
 * 
 * 思路：
 * 		A：获取所有结婚证的集合
 * 		B：遍历结婚证的集合得到每一个结婚证
 * 		C：根据结婚证获取丈夫和妻子
 * 
 * 思路转换：
 * 		A：获取所有键值对对象的集合
 * 		B：遍历键值对对象的集合,获取得到每一个键值对象
 * 		C：根据键值对对象获取 键和值
 * 
 *这里面最麻烦的就是键值对对象如何表示呢？
 *看看我们开始的一个方法：
 *		Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 * 
 */
import java.util.Set;

public class MapDemo4 {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		//创建元素并添加到集合
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");
		
		//获取所有键值对对象的集合
		Set<Map.Entry<String,String>> set = map.entrySet();
		
		//遍历键值对对象的集合,获取得到每一个键值对象
		for(Map.Entry<String,String> me:set) {
			//根据键值对对象获取 键和值
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"---"+value);
		}
	}
}
