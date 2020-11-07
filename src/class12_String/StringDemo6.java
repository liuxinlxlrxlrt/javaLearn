package class12_String;

/*
 * 判断功能:
	boolean equals(Object obj):比较字符串的内容是否相同，区分大小写
	boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同：忽略大小写
	boolean contains(String str)：判断大字符串中是否包含小字符串
	boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头
	boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾
	boolean isEmpty()：判断字符串是否为空
	
	注意：
		字符串内容为空(对象存在)
		String s = "";
		字符串对象为空
		String s = null;
 */

public class StringDemo6 {
	public static void main(String[] args) {
		// 创建字符串对象
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";

//			boolean equals(Object obj):比较字符串的内容是否相同，区分大小写
		System.out.println("equals：" + s1.equals(s2));
		System.out.println("equals：" + s1.equals(s3));
		System.out.println("--------------");

//			boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同：忽略大小写
		System.out.println("equalsIgnoreCase：" + s1.equalsIgnoreCase(s2));
		System.out.println("equalsIgnoreCase：" + s1.equalsIgnoreCase(s3));
		System.out.println("--------------");

//			boolean contains(String str)：判断大字符串中是否包含小字符串
		System.out.println("contains：" + s1.contains("hello"));
		System.out.println("contains：" + s1.contains("hw"));
		System.out.println("--------------");

//			boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头
		System.out.println("startsWith：" + s1.startsWith("h"));
		System.out.println("startsWith：" + s1.startsWith("hello"));
		System.out.println("startsWith：" + s1.startsWith("world"));
		System.out.println("--------------");

//			boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾
		System.out.println("endsWith：" + s1.endsWith("d"));
		System.out.println("endsWith：" + s1.endsWith("world"));
		System.out.println("endsWith：" + s1.endsWith("hello"));
		System.out.println("--------------");

//			boolean isEmpty()：判断字符串是否为空
		System.out.println("isEmpty：" + s1.isEmpty());

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty：" + s4.isEmpty());
		// NullPointerException
		// s5对象都不存在，所以不能调用方法，空指针异常
		System.out.println("isEmpty：" + s5.isEmpty());
		System.out.println("--------------");
	}
}
