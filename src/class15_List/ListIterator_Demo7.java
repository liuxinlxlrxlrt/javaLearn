package class15_List;


/*
 * 列表迭代：
 * 		ListIterator listIterator();//List集合特有的迭代器
 * 		ListIterator继承了Iterator迭代器，所以就可以直接是以欧诺个hasNext()和next()方法
 * 
 * 特有功能:
 * 		Object previous();获取上一个元素
 * 		boolean hasPrevious();判断是否有元素
 * 
 * 注意：ListIterator可以实现逆向遍历，所以必须先正向遍历，然后才能逆向遍历，一般不使用
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo7 {

	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		
		//添加元素
		list.add("hello");
    	list.add("world");
    	list.add("java");
    	
    	//列表迭代：接口ListIterator listIterator();//List集合特有的迭代器
    	//列表迭代器也可以遍历元素，但是不会使用它，为什么？
    	//因为这个ListIterator列表迭代器不是通用迭代器
    	ListIterator lit = list.listIterator();//接口返回的是子类对象和实现类对象
    	while(lit.hasNext()) {
    		String s = (String) lit.next();
    		System.out.println(s);
    	}
    	
//    	System.out.println(lit.previous());
//    	System.out.println(lit.previous());
//    	System.out.println(lit.previous());
    	//超出范围报错：NoSuchElementException
    	//System.out.println(lit.previous());
    System.out.println("-----------------------");
    	
    	while(lit.hasPrevious()) {
    		String s = (String) lit.previous();
    		System.out.println(s);
    	}
    System.out.println("-----------------------");
    	//迭代器,不能反向访问
    	Iterator it = list.iterator();
    	while(it.hasNext()) {
    		String s = (String) it.next();
    		System.out.println(s);
    	}
    	
    	System.out.println("-----------------------");
	}
}
