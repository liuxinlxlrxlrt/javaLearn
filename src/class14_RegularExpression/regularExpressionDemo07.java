package class14_RegularExpression;

/*
 * 获取功能：获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * 
 * 通过调用模式的 matcher 方法从模式创建匹配器。创建匹配器后，可以使用它执行三种不同的匹配操作： 
 * 		A：matches 方法尝试将整个输入序列与该模式匹配。 
 * 		B：lookingAt 尝试将输入序列从头开始与该模式匹配。 
 *		C：find 方法扫描输入序列以查找与该模式匹配的下一个子序列。
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressionDemo07 {
	public static void main(String[] args) {
		// 定义字符串
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";

		// 规则
		String regex = "\\b\\w{3}\\b";

		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile(regex);

		// 通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);

		// 调用匹配器对象的matches功能
		// 通过find方法就是查找有没有满足条件的子串
//		boolean flag = m.find();
//		System.out.println("flag："+flag);
//		//如何得到值呢？
//		//public String group()
//		String ss = m.group();
//		System.out.println("ss："+ss);
//		
//		//在来一次
//		flag = m.find();
//		System.out.println("flag："+flag);
//		String sss = m.group();
//		System.out.println("sss："+sss);

		while (m.find()) {
			System.out.println(m.group());
		}

		// 注意：一定要find(),然后才能group()
		// IllegalStateException: No match found
//		String sss = m.group();
//		System.out.println("sss："+sss);
	}
}
