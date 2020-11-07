package class2;

/*
 * 看结果写结果
 * 
 * 通过字符和一个整数相加，我们给出一张：ASCII码表
 *     通过看完这张表以后，我们要记住三个值：
 *        'a'   97
 *        'A'   65
 *        '0'   48
 * 
 */

public class DataTypeDemo8 {
	public static void main(String[] args) {
		//直接输入一个字符
		System.out.println('a');//结果是a
		//输出一个字符和一个整数做加法
		System.out.println('a'+1);//结果是98
		//字符参与运算的时候，是找字符对应的ASCII的值做运算
		System.out.println('a'+'A');

	}
}
