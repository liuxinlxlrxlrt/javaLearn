package class18_Map_collections;
/*
 * Collections:针对集合操作 的工具类,都是静态方法
 * 
 * 面试题：
 * Collection和Collections的区别：
 * Collection：是单列集合的顶层接口,有子接口List和Set.
 * Collections：是针对集合的操作的工具类，有对集合进行排序和二分查找的方法
 * 
 * 
 * Collections成员方法
 *		public static <T> void sort(List<T> list)：默认情况下是自然排序,
 *		public static <T> int binarySearch(List<?> list,T key):二分查找
 *		public static <T> T max(Collection<?> coll)：最大值
 *		public static void reverse(List<?> list)：反转
 *		public static void shuffle(List<?> list)：随机置换
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		//创建集合对象
		List<Integer> list = new ArrayList<Integer>();
		
		//添加元素
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:"+list);
		//返回值：list:[30, 20, 50, 10, 40]
		//public static <T> void sort(List<T> list)：默认情况下是自然排序
		//public final class Integer extends Number implements Comparable<Integer>
		//Integer元素实现了自然排序接口的
		//Collections.sort(list);
		//System.out.println("list:"+list);
		//返回值：list:[10, 20, 30, 40, 50]
		
		//public static <T> int binarySearch(List<?> list,T key):二分查找
		//System.out.println("binarySearch:"+Collections.binarySearch(list,30));
		//返回值：binarySearch:2
		//System.out.println("binarySearch:"+Collections.binarySearch(list,300));
		//返回值：binarySearch:-6:(找不到的时候最大索引4+1)
		
		// *		public static <T> T max(Collection<?> coll)：最大值
		//System.out.println("Max:"+Collections.max(list));
		//返回值：Max:50
		//System.out.println("Max:"+Collections.binarySearch(list,300));
		//返回值：binarySearch:-6:(找不到的时候最大索引4+1)
		
		//public static void reverse(List<?> list)：反转
		//Collections.reverse(list);
		//System.out.println("list:"+list);
		//返回值list:[40, 10, 50, 20, 30]
		
		//public static void shuffle(List<?> list)：随机置换
		Collections.shuffle(list);
		System.out.println("list:"+list);
		//第一次：list:[20, 30, 10, 50, 40]
		//第二次：list:[20, 30, 40, 50, 10]
		//第三次：list:[30, 40, 10, 20, 50]
	}

}
