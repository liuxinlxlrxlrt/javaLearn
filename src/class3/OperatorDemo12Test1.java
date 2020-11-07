package class3;

import java.util.Scanner;

/*
 * 键盘录入数据练习
 *    键盘录入两个数据，并对这两个数据求和，输出其结果
 *    键盘录入两个数据，获取这两个数据中的最大值
 * 
 */

public class OperatorDemo12Test1 {

	public static void main(String[] args) {
		//键盘录入两个数据，并对这两个数据求和，输出其结果
				//创建键盘录入对象
				Scanner sc = new Scanner(System.in);
				
				System.out.println("请你输入第一个数据");
				int x = sc.nextInt();
				
				System.out.println("请你输入第二个数据");
				int y = sc.nextInt();
				
				//把键盘录入的数据进行相加即可
				int sum = (x+y);
				System.out.println("sum:"+sum);

	}

}
