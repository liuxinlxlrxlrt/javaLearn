package class13_Integer;
/*
 * 需:1：把100这个数据的二进制、八进制、十六进制金酸出来
 * 需求2：判断一个数据是否是Int范围内的
 * 		首先要知道int的范围是多大？2^31
 * 
 *为了对基本数据类型进行更多操作，更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型，包装类类型
 *byte			byte
 *short			short
 *int			int
 *long			long
 *float			float
 *double		double
 *char			char
 *boolean		boolean
 *
 *常用的操作之一：用于基本数据类型与字符串之间的转换。
 */

public class IntegerDemo {
	public static void main(String[] args) {
		//不需要自己写
		//public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		
		//public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		
		//public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));
		
		
		//public static final int MAX_VALUE
		//值为 2^31-1 的常量，它表示 int 类型能够表示的最大值
		System.out.println(Integer.MAX_VALUE);
		
		//public static final int MIN_VALUE
		//值为 -2^31 的常量，它表示 int 类型能够表示的最小值
		System.out.println(Integer.MIN_VALUE);
	}
}
