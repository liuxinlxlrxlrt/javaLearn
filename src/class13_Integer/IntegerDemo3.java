package class13_Integer;
/*
 * int类型和String类型的相互转换
 * 
 * int – String
 * 		 String.valueOf(number):任意类型都可以转成字符串，静态方法
 * String – int
 * 		Integer.parseInt(s)
 */

public class IntegerDemo3 {
	public static void main(String[] args) {
		//int – String
		int number = 100;
		//方式1：
		String s1 = ""+number;
		System.out.println("s1："+s1);
		//方式2
		String s2= String.valueOf(number);
		System.out.println("s2："+s2);
		//方式3
		//int--Integer--String
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println("s3："+s3);
		//方式4
		//public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println("s4："+s4);
		System.out.println("-----------------");
		
		//String – int
		String s = "100";
		//方式1
		//String---Integer--int
		Integer ii = new Integer(s);
		//public int intValue()
		int x = ii.intValue();
		System.out.println("x："+x);
		//方式2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println("y："+y);
	}
}
