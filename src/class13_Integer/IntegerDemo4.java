package class13_Integer;
/*
 * 1.常用的基本进制转换
 *		public static String toBinaryString(int i)
 *		public static String toOctalString(int i)
 *		public static String toHexString(int i)
 *2.十进制到其他进制
 *		public static String toString(int i,int radix)
 *		由这个我们看到进制的范围：2-36
 *		为什么呢：1--9，a--z
 *3.其他进制到十进制
 *		public static int parseInt(String s,int radix)
 */

public class IntegerDemo4 {
	public static void main(String[] args) {
		//十进制到二进制、八进制、16进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println("--------------------");
		
		//十进制到其他进制
		System.out.println(Integer.toString(100,10));
		System.out.println(Integer.toString(100,2));
		System.out.println(Integer.toString(100,8));
		System.out.println(Integer.toString(100,16));
		System.out.println(Integer.toString(100,5));
		System.out.println(Integer.toString(100,7));
		System.out.println(Integer.toString(100,70));//100
		System.out.println(Integer.toString(100,-7));//100
		System.out.println(Integer.toString(100,1));//100
		System.out.println(Integer.toString(100,17));//5f
		System.out.println(Integer.toString(100,32));//34
		System.out.println(Integer.toString(100,37));//100
		System.out.println(Integer.toString(100,36));//2s
	
		//其他进制到十进制
		System.out.println(Integer.parseInt("100",10));
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("100",8));
		System.out.println(Integer.parseInt("100",16));
		System.out.println(Integer.parseInt("4f",16));
		System.out.println(Integer.parseInt("100",23));
		
		//NumberFormatException
		System.out.println(Integer.parseInt("123",2));
	}
}
