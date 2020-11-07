package class18_Map01;
/*
 * 作为学生来说，是根据学号来区分学生的，那么假设我现在已经知道了学生的学号，我要根据学号好去获取学生姓名，请问该怎么做？
 * 如果采用前面讲解过的集合，我们只能把学号和学生姓名作为一个对象的成员，然后存储整个对象，将来遍历的时候，判断，获取对应的名称。
 * 但是呢？如果我能把学生姓名拿出来了，我还需要根据编号去找吗？
 * 针对我们目前的这种需求：仅仅知道学号，就想知道学生姓名的情况，java就提供了一种新的集合Map.
 * 通过查看API，我们知道Map集合的一个最大特点，就是它可以存储键值对的元素。
 * 		学号1： 姓名1
 *		学号2： 姓名2
 * 		学号3： 姓名3
 * 		学号2(不行)： 姓名4
 * 		学号4： 姓名4(值可以重复)
 * 
 * Map集合的特点：
 * 		将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * 
 * Map集合和Colletion集合的区别：
 * 		 Map集合存储元素是成对出现的,Map集合的键是唯一的,值是可重复的。可以把这个理解为：夫妻对。
 * 		Colletion集合Map集合存储元是单独的,Colletion集合的儿子Set是唯一的,List是可重复的。可以把这个理解为：光棍。	
 * 
 * 注意:
 * 		Map集合的数据结构针对键有效，跟值无关。
 * 			HashMap,TreeMap等会讲。
 * 		Collection集合的数据结构是针对元素有效。
 * 
 * Map集合的功能概述：
 *		1：添加功能和替换(修改功能)
 *			V put(K key,V value)：添加元素，这个其实还有另一个功能，先不告诉你，等会讲
 *				如果键是第一次存在,就直接存储元素，返回null;
 *				如果键不是第一次存在，就用值把以前的值替换，返回以前的值
 *
 *			void putAll(Map<? extends K,? extends V> m)：
 *		2：删除功能
 *			void clear():移除所有的键值对元素。
 *			V remove(Object key)：根据键删除键值对元素并把值返回
 *		3：判断功能
 *			boolean containsKey(Object key)：判断集合是否包含指定的键
 *			boolean containsValue(Object Value):判断集合是否包含指定的值
 *			boolean isEmpty()：判断集合是否为空
 *		4：获取功能
 *			Set<Map.Entry<K,V>> entrySet()：???//返回的是键值对对象的集合
 *			V(泛型) get(Object key)：根据键获取值
 *			Set<K> keySet()：获取集合中所有键
 *			Collection<V> values()：获取集合中所有值的集合
 *		5：长度功能
 *			int size()：返回集合中的键值对的对数
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String>  map = new HashMap<String,String>();
		
		//添加元素
		//V put(K key,V value)：添加元素，这个其实还有另一个功能，先不告诉你，等会讲
//		System.out.println("put:"+map.put("文章", "马伊琍"));
//		System.out.println("put:"+map.put("文章", "姚笛"));
		//返回值：put:马伊琍,map:{文章=姚笛}
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");
		//返回值：map:{邓超=孙俪, 周杰伦=蔡依林, 黄晓明=杨颖, 刘恺威=杨幂}
		
		//删除功能
		//void clear():移除所有的键值对元素。
//		map.clear();
		
		//V remove(Object key)：根据键删除键值对元素并把值返回
		//System.out.println("remove:"+map.remove("黄晓明"));
		//返回：remove:杨颖
		//System.out.println("remove:"+map.remove("黄晓波"));
		//remove:null
		
		//判断功能
		//boolean containsKey(Object key)：判断集合是否包含指定的键
		System.out.println("containsKey"+map.containsKey("黄晓明"));
		//返回值：containsKeytrue
		System.out.println("containsKey"+map.containsKey("黄晓波"));
		//返回值：containsKeyfalse
		//boolean containsValue(Object Value):判断集合是否包含指定的值
		System.out.println("containsValue"+map.containsValue("杨幂"));
		//返回值：containsKeytrue
		System.out.println("containsValue"+map.containsValue("杨海燕"));
		//返回值：containsKeyfalse
		//boolean isEmpty()：判断集合是否为空
		System.out.println("isEmpt:"+map.isEmpty());
		//返回值isEmpt:false
		
		//长度功能
		//int size()：返回集合中的键值对的对数
		System.out.println("size:"+map.size());
		
		//输出集合名称
		System.out.println("map:"+map);
	}
}
