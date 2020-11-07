package class16_List_Vector;

/*
 * Vector类特有功能
 * 	1.添加功能
		public void addElement(Object obj) ---add
	2.获取功能
		size()方法结合elementAt(int index)索引可以拿到所有元素
		A:public Object elementAt(int index) ---get
		B:public Enumeration elements() ---Iterator iterator()
				boolean hasMoreElements(); ---hasNext()
				Object nextElement();   ---next()
				
JDK升级的原因：
	A：安全
	B：效率
	C: 简化书写
 */
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Vector v = new Vector();

		// 添加功能
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		// 遍历
		for (int x = 0; x < v.size(); x++) {
			String s = (String) v.elementAt(x);
			System.out.println(s);
		}

		System.out.println("---------------");

		Enumeration en = v.elements();
		// 通过迭代器的hasMoreElements()的方法判断有没有元素
		while (en.hasMoreElements()) {
			// 通过迭代器的nextElement的方法获取元素
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
