package class4;

import java.util.Scanner;

/*用switch语句实现键盘录入月份，输出对应的季节
 * 
 * 分析：
 * 		A：键盘录入一个月份，用scanner实现
 * 		B：用switch语句实现即可
 * 
 * if语句与switch语句的区别：
 * 		if语句使用场景：
 *    		针对结果是boolean类型的判断（switch不能做boolean判断（byte,short,char,int,枚举））
 *			针对一个范围的判断（90-1000之间，92.5等switch不能做）
 *			针对几个常量值的判断
 *		switch语句使用场景：
 *			针对几个常量值的判断（几个固定值，星期，单选题能做，一个范围的判断switch做出来不好看）
 */

public class ChooseStructureDemo2Swith02Test4 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请录入月份(1-12):");
		int month = sc.nextInt();
		
		/*switch(month) {
		 		case 1:
		 			System.out.println("冬季");
		 			break;
		 		case 2:
		 			System.out.println("冬季");
		 			break;
		 		case 3:
		 			System.out.println("春季");
		 			break;
		 		case 4:
		 			System.out.println("春季");
		 			break;
		 		case 5:
		 			System.out.println("春季");
		 			break;
		 		case 6:
		 			System.out.println("夏季");
		 			break;
		 		case 7:
		 			System.out.println("夏季");
		 			break;
		 		case 8:
		 			System.out.println("夏季");
		 			break;
		 		case 9:
		 			System.out.println("秋季");
		 			break;
		 		case 10:
		 			System.out.println("秋季");
		 			break;
		 		case 11:
		 			System.out.println("秋季");
		 			break;
		 		case 12:
		 			System.out.println("冬季");
		 			break;
		 		default:
		 			System.out.println("你输入的月份有误");
		 			break;
	           }*/
		//这样写太麻烦了，我们使用一个我们不太想使用的东西，穿透
		
	switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("你输入的月份有误");
			break;
	  }
	}
}
