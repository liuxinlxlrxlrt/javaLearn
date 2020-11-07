package class14_Math;
/*
 * 需求：请设计一个方法，可以实现获取任意范围的随机数
 * 
 * 分析：
 * 		A：键盘录入两个数
 */

import java.util.Scanner;

public class MathDemo02 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();

		for (int x = 0; x < 100; x++) {
			// 调用功能
			int num = getRandom(start, end);
			// 输出结果
			System.out.println(num);
		}
	}

	/*
	 * 写一个功能：
	 *  两个明确： 
	 * 返回值类型：int 
	 * 参数列表：int start,int end
	 */
	public static int getRandom(int start, int end) {
		// 回想我们讲过的1-100之间的随机数
//		int number = (int)(Math.random())*100)+1;
//		int number = (int)(Math.random()*end)+start;
		// 发现有问题了，怎么办呢？
		int number = (int) (Math.random() * (end - start + 1)) + start;

		return number;
	}
}
