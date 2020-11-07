package class15_List;

/*
 * List集合的特有遍历功能：
 * 		size()和get()方法的结合
 */
import java.util.ArrayList;
import java.util.List;

public class ListIterator_Demo5 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");

		// 获取功能:Object get(int index);//获取指定位置元素
//	    	System.out.println(list.get(0));//返回：hello
//	    	System.out.println(list.get(1));//返回：world
//	    	System.out.println(list.get(2));//返回：java
		// 由上可以看出这是集合遍历，所以get方法可以做遍历
//	    	//IndexOutOfBoundsException: Index: 3, Size: 3
//	    	System.out.println(list.get(3));

		// 用循坏改进
//	    	for(int x=0;x<3;x++) {
//	    		System.out.println(list.get(x));
//	    	}

		// 如果元素过多，数起来比较麻烦，所以我们使用集合一个长度功能：size()
		// 最终的遍历方式就：size()和get()方法的集合
		for (int x = 0; x < list.size(); x++) {
			// System.out.println(list.get(x));

			String s = (String) list.get(x);
			System.out.println(s);
		}
	}
}
