package class15_Collection;
/*
 * 集合的由来：
 * 	我们学的是面向对象语言，二面向对象语言对事物的描述是通过对象体现的，为何方便对多个对象进行操作，我们就必须把这对个对象进行存储，
 *     而想要存储对象对象，就不能是一个基本的变量，而应该是一个容器类型的变量，在我们目前学过的只是里边，有哪些容器类型的呢？
 *     数组和StringBuffer.但是呢？StringBuffer的结果是一个字符串，不一定满足我们的要求，所以我们选择数组，这就是对象数组。
 *     而对象数组又不能适应变化的需求，因为数组的长度是固定的，这个时候，为何适应变化的需求，java就提供了集合类供我们使用。
 *     
 * 数组和集合的区别？
 * 	A.长度区别
 *        数组的长度固定
 *        集合的长度可变
 *     B.内容不同
 *        数组存储的是同一种类型的元素
 *        而集合可以存储不同类型的元素
 *     C.元素的数据类型问题
 *       数组可以存储基本数据类型，也可以存储引用类型
 *       集合只能存储引用类型
 *       
 * 集合是存储多个元素，但是呢?存储多个元素我们也是有不同的需求：比如说，我们要这多个元素中不能有相同的元素，
 * 再比如说，我要这多个元素按照某种规则排序一下，针对不同的需求，java就提供了不同的集合类，这样呢？java就提供了很多个集合类。
 * 这多个集合类的数据结构不同，结构不同不重要，重要的是你要能够存储东西，并且还要能够这些东西，比如说判断，获取等。
 * 既然这样，那么这多个集合类是有共性的内容，我们把这些集合类的共性内容不断的向上提取，最终就能够形成集合的继承体系结构。
 * 
 * java提供多种集合类，他们的数据结构不同，但是他们肯定有共性的内容（存储、获取、判断等），通过不断的向上提取，我们就能够得到
 * 一个集合的继承体系结构图。
 * 分析：从具体到抽象
 * 实现：从抽象到具体
 * 使用：使用具体
 * 
 * 数据结构：数据的存储方式
 * 
 * Connection:是几个的顶层接口，它的字体系有重复的，有唯一的，有有序的，有无序的。
 * 
 * Connection的功能概述：
 *   1.添加功能：
 *      boolean add<Object  obj>:添加一个元素（Object代表任意对象）
 *      boolean addAll(Connection c):添加一个集合的元素
 *   2.删除功能
 *      void clear():移除所有元素 
 *      boolean remove(Object o);移除一个元素
 *      boolean removeAll(Connection o); 移除一个集合的元素(是一个还是所有)
 *   3.判断功能
 *     boolean contains(Object  o):判断集合中是否包含指定的元素
 *     boolean containsAll(Connection c):判断集合中是否包含指定的集合元素？（是一个还是所有）
 *     boolean isEmpty()判断集合是否为空（集合的元素为空）
 *   4.获取功能
 *     Iterator<E> iterator()重点
 *   5.长度功能
 *   	int size();元素的个数
 *   	面试题：数组有没有length()方法呢？字符串有没有length()方法呢？集合有没有length()方法呢？
 *   6.交集功能：
 *   	boolean retainAll(Collection c);两个集合都有的元素？思考元素去哪里了，返回的boolean又是是意思
 *   7.把集合转换成数组
 *   	object[] toArray();
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		// 测试不带ALL的方法

		// 创建集合对象
		// Collection c = new Collection();//错误，因为接口不能实例化

		Collection c = new ArrayList();

		// 1.添加功能：boolean add(Object obj);添加一个元素
		// 2.System.out.println("add:"+c.add("hello"));//返回add:truec:[hello]
		c.add("hello");
		c.add("world");
		c.add("java");
		// c.add("hello");c.add("world");c.add("java");返回c:[hello, world, java]

		// 3.删除功能:void clear();移除所有元素
		// c.clear();//返回c:[]

		// 4.删除功能:boolean remove(Object o);移除一个元素
		// System.out.println("remove:"+c.remove("hello"));//remove:true/c:[world, java]

		// 5.判断功能: boolean contains(Object o):判断集合中是否包含指定的元素
		// System.out.println("contains:"+c.contains("hello"));//contains:true/c:[hello,
		// world, java]

		// 6.判断功能:boolean isEmpty()判断集合是否为空（集合的元素为空）
		// System.out.println("isEmpty:"+c.isEmpty());//isEmpty:false/c:[hello, world,
		// java]

		// 7.长度功能int size();元素的个数
		// System.out.println("size:"+c.size()); //size:3/ c:[hello, world, java]

		// 直接输出集合;
		// 如果打的不是地址值，说明重写了，
		// 如果打的地址值，说明没有被重写
		System.out.println("c:" + c);// c:[]重写了，返回add:true/c:[hello]
	}
}
