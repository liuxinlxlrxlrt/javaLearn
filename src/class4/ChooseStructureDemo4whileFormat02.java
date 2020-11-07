package class4;

/*
 * 练习：用while循环实现
 * 		左边：求出1-100之和
 * 		右边：统计水仙花数有多少个
 * 
 * 	初始化语句：
 * 	while(判断条件语句){
 *		 循环语句
 *		控制条件语句
 * 	}
 */

public class ChooseStructureDemo4whileFormat02 {
	public static void main(String[] args) {
		// 求出1-100之间数据之和；for语句版本
		int sum1 = 0;
		for (int x = 1; x <= 100; x++) {
			sum1 += x;
		}
		System.out.println("1-100之间数据之和sum1是：" + sum1);
		System.out.println("---------------------");

		// while语句版本
		int sum2 = 0;
		int y = 1;
		while (y <= 100) {
			sum2 += y;
			y++;
		}
		System.out.println(sum2);
		System.out.println("---------------------");
		// 统计水仙花数有多少个
		// 定义统计变量，初始化值是0
	}
}
