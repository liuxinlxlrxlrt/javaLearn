package class3;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，比较这两个数据是否相等
 */

public class OperatorDemo12Test4 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
								
		System.out.println("请你输入第一个数据");
		int x = sc.nextInt();
								
		System.out.println("请你输入第二个数据");
		int y = sc.nextInt();
								
		//比较这两个数是否相等
		boolean flag = (x == y);
		System.out.println("flag: "+flag);

	}

}
