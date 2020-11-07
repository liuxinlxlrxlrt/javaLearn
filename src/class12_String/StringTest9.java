package class12_String;
/*
 * 字符换反转
 * 举例：键盘录入“abc”
 * 输出“cba”
 * 
 * 分析”
 * 		A：键盘例如一个字符串
 * 		B：倒着遍历字符串，得到每一个字符
 * 			a：length()和charAt()结合
 * 			b：把字符串转换成字符数组
 * 		C：用新字符串把每一个字符串拼接起来
 * 		D：输入新串
 */

import java.util.Scanner;

public class StringTest9 {

	public static void main(String[] args) {
		//键盘例如一个字符串
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		
		//定义一个字符串
		String result ="";
		
		//把字符串转换成字符数组
		char[] chs = line.toCharArray();
		
		//倒着遍历字符串，得到每一个字符
		for(int x=chs.length-1;x>=0;x--) {
			//用心字符串把每一个字符拼接起来
			result += chs[x];
		}
		//用新字符串把每一个字符串拼接起来
		//输入新串
		System.out.println("反转后的结果是："+result);
		
		//改进为功能实现
		String s = myReverse(line);
		System.out.println("实现功能后的结果是："+s);
	}

/*
 * 两个明确：
 * 返回值类型：String
 * 参数类型：String
 */

public static String myReverse(String s ) {
	//定义一个字符串
			String result ="";
			
			//把字符串转换成字符数组
			char[] chs = s.toCharArray();
			
			//倒着遍历字符串，得到每一个字符
			for(int x=chs.length-1;x>=0;x--) {
				//用心字符串把每一个字符拼接起来
				result += chs[x];
			}
			return result;
}
}
