package class3;
/*
 * 键盘录入练习：
 *		键盘录入两个数据，获取这两个数据中的最大值
 */

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		//获取这个两个数中的最大值
		int max = (a > b)?a:b;
		System.out.println("max"+max);
	}
}
