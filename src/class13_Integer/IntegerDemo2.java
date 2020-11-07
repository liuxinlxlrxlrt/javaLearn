package class13_Integer;
/*
 * Integer的构造方法
 * public Integer(int value)
 * public Integer(String s)
 * 		注意：这个字符串必须有数字字母组成
 */

public class IntegerDemo2 {
	public static void main(String[] args) {
		//方式1
		int i = 100;
		Integer ii = new Integer(i);
		//如果打印的地址值，没有重写toString()
		//如果打印的是100，重写toString()
		System.out.println("ii："+ii);
		
		//方式2
		String s = "100";

		Integer iii = new Integer(s);

		System.out.println("iii："+iii);
		//NumberFormatException
		//要想转成integer类型的包装类类型，必须含有数字的，不能没有字母
		//String s1 = "abc";
		//Integer iiii = new Integer(s1);
		//System.out.println("iiii："+iiii);
	}
}
