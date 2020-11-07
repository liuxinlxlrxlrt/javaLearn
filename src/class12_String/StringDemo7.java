package class12_String;
/*
 * String类的获取功能:
		int length()：获取字符串的长度
		char charAt(int index)：获取指定索引位置的字符
		int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
			为什么这里是Int类型，而不是char类型 
			原因：'a'和97其实都可以代表'a'
		int indexOf(String str)：返回指定字符在此字符串中第一次出现处的索引。
		int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		int indexOf(String str,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		String substring(int start)：从指定位置开始截取字符串，默认到末尾
		String substring(int start,int end)：从指定位置开始到指定位置结束截取字符串

 */

public class StringDemo7 {
	public static void main(String[] args) {
		// 定义一个字符串对象
		String s = "helloworld";

		// int length()：获取字符串的长度
		System.out.println("s.length:" + s.length());
		System.out.println("---------------");

		// char charAt(int index)：获取指定索引位置的字符
		System.out.println("s.charAt:" + s.charAt(7));
		System.out.println("---------------");

		// int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
		System.out.println("s.indexOf:" + s.indexOf('l'));
		System.out.println("---------------");

		// int indexOf(String str)：返回指定字符在此字符串中第一次出现处的索引。
		System.out.println("s.indexOf:" + s.indexOf("owo"));// 返回首字母的索引
		System.out.println("---------------");

		// int indexOf(int ch,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		System.out.println("s.indexOf:" + s.indexOf('o', 5));
		System.out.println("s.indexOf:" + s.indexOf('k', 5));// -1
		System.out.println("s.indexOf:" + s.indexOf('o', 40));// -1
		System.out.println("---------------");

		// int indexOf(String str,int fromIndex)：返回指定字符在此字符串中从指定位置后第一次出现处的索引。
		System.out.println("s.indexOf:" + s.indexOf("owo", 4));
		System.out.println("s.indexOf:" + s.indexOf("kjm", 5));// -1
		System.out.println("s.indexOf:" + s.indexOf("owo", 40));// -1
		System.out.println("---------------");

		// String substring(int start)：从指定位置开始截取字符串，默认到末尾，包含start
		System.out.println("s.substring:" + s.substring(5));// 包含5,world
		System.out.println("s.substring:" + s.substring(0));// 包含0,helloworld
		// StringIndexOutOfBoundsException
		// System.out.println("s.substring:"+s.substring(40));
		System.out.println("---------------");

		// String substring(int start,int end)：从指定位置开始到指定位置结束截取字符串,包含start索引但是不包含end索引
		System.out.println("s.substring:" + s.substring(3, 8));// 包含3不包含8,//lowor
		System.out.println("s.substring:" + s.substring(0, s.length()));// helloworld
	}
}
