package class14_BigInteger;
/*
 * BigInteger：可以让超过Integer范围内的数据进行计算
 * 构造方法：
 * BigInteger(String val)
 */

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		// 这几个测试是为了超过In范围内，Integer就不能再表示，所以就更谈不上计算了
//		Integer i = new Integer(100);
//		System.out.println(i);
//		//System.out.println(Integer.MAX_VALUE);
//		Integer ii = new Integer("2147483647");
//		System.out.println(ii);
//		//NumberFormatException
//		Integer iii = new Integer("21474836478");
//		System.out.println(iii);

		// 通过大整数创建对象
		BigInteger bi = new BigInteger("21474836478");
		System.out.println("bi：" + bi);
	}
}
