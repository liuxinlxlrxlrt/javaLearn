package class3;

import java.util.Scanner;

/*
 * 需求：键盘录入三个数据，获取这三个数据中的最大值
 */

public class OperatorDemo12Test3 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
								
		System.out.println("请你输入第一个数据");
		int x = sc.nextInt();
								
		System.out.println("请你输入第二个数据");
		int y = sc.nextInt();
		
		System.out.println("请你输入第三个数据");
		int z = sc.nextInt();
								
		//获取这三个数据中的最大值
		int temp = ((x > y)?x :y);
		int max1 = (temp > z?temp:z);
		System.out.println("max1:"+max1);
		System.out.println("-----------------------------");
		
		int max2 = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("max2:"+max2);

	}

}
