package class16_Generic;

/*
 * ArrayList存储字符串并遍历
 * 
 * 我们按照正常的写法写这个程序，结果出错了
 * 为什么呢?
 * 		因为我们开始存储的时候，存储了String和Integer两种类型的数据
 * 		而在遍历的时候，我们把它们都当作String类型处理,做了转换，所以就报错了,
 * 但是呢，它在编译时期却没有告诉我们。
 * 所以我就觉得这个设计的不好。
 * 回想一下，我们的数组
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[0] = "hello";
 * 		strArray[0] = 10;
 * 集合也模仿着数组的这种做法，在创建对象的时候明确元素的数据类型，这样就不会有问题了
 * 而这种技术被称为：“泛型”。
 * 
 * 泛型：是一种把数据类型明确的工作推迟到创建对象或者调用方法的时候才明确的特殊的类型。参数化类型，把类型当作参数一样传递。
 * 格式：
 * 		<数据类型>
 * 		此处的数据类型只能是引用类型
 * 
 * 好处：
 * 		A：把运行时期的问题提前到了编译期间
 * 		B：避免了强制类型转换
 * 		C：优化程序设计，解决了黄色警告线
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 创建元素对象，并添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		// Integer是引用类型
		// array.add(new Integer(100));
		// array.add(10);//10是基本类型，但是JDK7以后自动装箱
		// 等价于：array.add(Integer.valueof(10));

		// 遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			// String s = (String)it.next();//不需要强转了
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("-------------------");

		// 看下面的代码
//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "hello";
//		strArray[2] = 10;//String一开始就告诉了它是String类型，所以就报错了
	}
}
