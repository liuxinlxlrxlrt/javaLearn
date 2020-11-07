package class12_String;
/*
 * 面试题
 * String s = new String(“hello”)和String s = “hello”;的区别?
 * 有区别，前置会创建2个对象，后者创建1个对象
 * 
 * ==:  比较引用类型比较的是地址值是否相同
 * equals:  比较引用类型，默认也是比较地址值下是否相同，
 *         而String类重写了equals()方法，比较的是内容是否相同。
 */

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
