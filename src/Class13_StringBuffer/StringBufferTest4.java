package Class13_StringBuffer;
/*
 * 判断一个字符串是否是对称字符串
 *例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 *
 *分析：
 *判断一个字符串是否对称，我只需要把
 *	第一个和最后一个比较
 *	第二个和倒数第二个比较
 *	...
 *	比较的次数是长度除以2
 */

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.ISO;

public class StringBufferTest4 {

	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		// 一个一个比较
		boolean b = isSame(s);
		System.out.println("b：" + b);

		// 用StringBuffer的反转功能
		boolean b2 = isSame(s);
		System.out.println("b2：" + b2);

	}

	public static boolean isSame2(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);

	}

	// 一个一个比较
//	public static boolean isSame(String s) {
//		//把字符串转换成字符数组
//		char[] chs =s.toCharArray();
//		
//		for(int start=0,end=chs.length-1;start<end;start++;end--) {
//			if(chs[start]!=chs[end]) {
//				return false;
//			}
//		}
//		return true;
//	}
	public static boolean isSame(String s) {
		boolean flag = true;
		// 把字符串转换成字符数组
		char[] chs = s.toCharArray();

		for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
			if (chs[start] != chs[end]) {
				flag = false;
			}
		}
		return flag;
	}
}
