package class14_RegularExpression;
/*
 * 替换功能
 * public String replaceAll(String regex,String replacement)
 * 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
 */

public class regularExpressionDemo05 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "helloqq12345worldkh622112345678java";

		// 我要去除所有的数字，用*替换掉
		// “\\d+”表示出现数字一次以上就给一颗“*”
		String regex1 = "\\d+";
		// “\\d+”表示出现数字就给一颗“*”
		String ss = "*";
		String result1 = s.replaceAll(regex1, ss);
		System.out.println("result1：" + result1);
		// result1：helloqq*worldkh*java
		System.out.println("------------------");
		// “\\d+”表示出现数字就给一颗“*”
		String regex2 = "\\d";
		String result2 = s.replaceAll(regex2, ss);
		System.out.println("result2：" + result2);
		// result2：helloqq*****worldkh************java
		System.out.println("------------------");
		// 把数字干掉
		String regex3 = "\\d+";
		String sss = "";
		String result3 = s.replaceAll(regex3, sss);
		System.out.println("result3：" + result3);
		// result3：helloqqworldkhjava
	}
}
