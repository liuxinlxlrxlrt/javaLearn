package class16_List_LinkedList;

/**
 * 自定义的栈集合
 * @author 风清扬
 * @version V1.0
 *
 */

import java.util.LinkedList;

public class MyStack {
	// 定义成员变量link
	private LinkedList link;

	// 创建MyStack的构造方法,内部造的是new LinkedList();集合对象
	public MyStack() {
		link = new LinkedList();
	}

	// 添加类，底层调用link的addFirst()方法
	public void add(Object obj) {
		link.addFirst(obj);

	}

	// 栈的特点是先进后出,出的话必须是弹栈
	public Object get() {
		// return link.getFirst();
		return link.removeFirst();
	}

	// 判断是否为空
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
