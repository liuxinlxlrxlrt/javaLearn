package Class13_StringBuffer;
/*面试题：
 *1. String,StringBuffer,StringBuilder的区别？
 *A：String是长度不可变的，StringBuffer,StringBuilder内容是可变的
 *B：StringBuffer是同步的，数据安全，效率低；StringBuilder是不同步的，数据不安全，效率高(多线程情况下)
 *
 *2.StringBuffer和数组的区别？
 *两者都可以看成是一个容器，装其他的数据
 *但是呢，StringBuffer的数据最终可以看成是一个字符串数据
 *而数组可以放置的多种数据，但必须是一种数据
 *
 *3.看程序写结果：
 *String作为参数传递
 *StringBuffer作为参数传递
 *
 *形式参数：
 *		基本参数：形式参数的改变不影响实际参数
 *		引用参数：形式参数的改变直接影响实际参数
 *
 *注意：
 *		String作为参数传递，效果和基本类型作为参数传递是一样的
 */

public class StringBufferDemo07 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1+"---"+s2);//hello---world
		//字符串是常量值，字符串是一种特殊的引用类型，只能当做基本类型看
		//拿的是值，不是拿的地址值
		change(s1,s2);
		System.out.println(s1+"---"+s2);//hello---world
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1+"---"+sb2);//hello---world
		change(sb1,sb2);
		System.out.println(sb1+"---"+sb2);//hello---worldworld
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		//建议调方法，不要做赋值
		sb2.append(sb1);
		
	}

	public static void change(String s1, String s2) {
		s1 =s2;
		s2=s1+s2;
	}
}
