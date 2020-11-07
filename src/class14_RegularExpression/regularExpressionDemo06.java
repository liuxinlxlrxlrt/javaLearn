package class14_RegularExpression;
/*
 * 获取功能
 * 		Pattern和Matcher类的使用
 * 
 * 		模式和匹配器的基本使用顺序
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressionDemo06 {
	public static void main(String[] args) {
		// 模式和匹配器的典型调用顺序
		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");

		// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
		Matcher m = p.matcher("aaaaab");// 判断"aaaaab"是否符合要求

		// 调用匹配器对象的matches功能
		boolean b = m.matches();

		System.out.println("b：" + b);//b：true

		// 这个是判断功能。但是如果做判断，这样做就有点麻烦
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println("bb：" + bb);//bb：true
	}
}
