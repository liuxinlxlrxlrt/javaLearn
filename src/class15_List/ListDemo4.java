package class15_List;

/*
 * List集合的特有功能：
 * A：添加功能
 * 		void add(int index,Object element);//在指定位置添加元素
 * B：获取功能
 * 		Object get(int index);//获取指定位置元素
 * C：列表迭代器
 * 		ListIterator listIterator();//列表中迭代所有元素，List集合特有的迭代器
 * 		ListIterator listIterator(int index);//列表中从指定位置开始迭代元素
 * D：删除功能
 * 		object remove(int index);//根据索引删除元素,返回删除的元素
 * E：修改功能
 * 		Object set(int index,Object element);根据索引修改元素,返回修改的元素
 * F：截取功能
 * 		subList(int fromIndex,int toIndex);根据开始和结束索引，返回指定返回的元素
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java1");
		list.add("java-2");
		list.add("java3");
		list.add("java-4");

		// B.添加功能：void add(int index,Object element);//在指定位置添加元素
//    	   list.add(1,"andriod");
//    	   System.out.println("list:"+list);
//    	   //IndexOutOfBoundsException: Index: 31, Size: 4
//    	   list.add(4,"javaee");//有问题

//    	   //C.获取功能：Object get(int index);//获取指定位置元素
//    	   System.out.println("get:"+list.get(0));//get:hello
//    	   System.out.println("get:"+list.get(2));//get:java
//    	   System.out.println("get:"+list.get(3));//IndexOutOfBoundsException: Index: 3, Size: 3

		// D：删除功能:object remove(int index);//根据索引删除元素,返回删除的元素
//    	   System.out.println("remove:"+list.remove(1));//返回：remove:world
//    	   System.out.println("remove:"+list.remove(3));//返回：IndexOutOfBoundsException: Index: 3, Size: 2

		// E：修改功能:Object set(int index,Object element);根据索引修改元素,返回修改的元素
//			  System.out.println("set:"+list.set(1, "javaee")); 返回：set:world

//			System.out.println("set:"+list.set(3, "toString"));//IndexOutOfBoundsException: Index: 3, Size: 3
		// F：截取功能:subList(int fromIndex,int toIndex);根据开始和结束索引，返回指定返回的元素

		// 截取功能：subList(int fromIndex,int toIndex);根据开始和结束索引，返回指定返回的元素
		System.out.println("list:" + list.subList(1, 6));
		System.out.println("list:" + list);
	}
}
