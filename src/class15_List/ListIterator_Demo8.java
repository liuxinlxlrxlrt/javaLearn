package class15_List;

/*
 * 问题？
 * 		如果我有一个集合如下，请问，我想判断有没有“world”这元素，如果有，我就添加一个“javaee”元素，请写代码实现
 * ConcurrentModificationException：当方法检测到对象的并发修改，但是不允许这种修改时，抛出此异常
 * 产生原因：
		迭代器时依赖于集合存在的，在判断成功后，集合中新添加了元素，而迭代器却不知道，所以报错了，这个错叫并发修改异常
		其实这个问题描述的是：说明了迭代器遍历元素的，集合是不能去修改元素，
	如何解决呢？
		A.迭代器迭代元素，迭代器修改元素
			元素是跟在刚才迭代的元素后面的
		B.集合遍历元素，集合修改元素(普通for)
			元素在最后添加的
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo8 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		// 迭代器遍历
		// Iterator it = list.iterator();

		// 在判断成功后，集合中新添加了元素，而迭代器却不知道，所以报错了,这个错叫并发修改异常
//	    	while(it.hasNext()) {
//	    		String s = (String) it.next();
//	    		if("world".equals(s)) {
//	    			list.add("javaee");
//	    		}
//	    	}

		// 方式一：迭代器迭代元素，迭代器修改元素
		// 而Iterator迭代器却没有添加功能，所以我们使用其子接口ListIterator
//	    	ListIterator lit = list.listIterator();
//	    	while(lit.hasNext()) {
//	    		String s = (String) lit.next();
//	    		if("world".equals(s)) {
//	    			lit.add("javaee");
//	    		}
//	    		
//	    	}

		// 方式2：集合遍历元素，集合修改元素(普通for)
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		System.out.println("list:" + list);
	}
}
