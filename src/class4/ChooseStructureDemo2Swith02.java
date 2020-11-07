package class4;

import java.util.Scanner;

/*
 * switch语句的注意事项：
 * 	  A:case后面只能是常量，不能是变量，而且，多个
 *    B:default可以省略吗?
 *        可以省略。一般不建议。因为它的作用是对不正确的情况给出提示。
 *        特殊情况：
 *             case可以把值固定
 *             A,B,C,D(单选题这个时候可以不写default,但是不建议)
 *    C:break可以省略吗?（break是中断的意思）
 *       	可以省略，但是结果可能不是我们想要的
 *    		会出现一个小现象，case穿透
 *    		最终我们建议不要省略（最后一个break可以省略的）
 *    D:default一定要在最后吗？
 *      	不是，可以在任意位置，但是建议在最后
 *    E:switch语句的结束条件
 *    		a:遇到break结束了
 *    		b:执行到最后就结束了
 */

public class ChooseStructureDemo2Swith02 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
				
		//控制键盘录入数据
		System.out.println("请输入一个数据（1-7）：");
		int week = sc.nextInt();
		
		//int num = 3;case后面只能是常量，不能是变量
		
		//swith判断语句
		switch(week){
			case 1:
			System.out.println("星期一");
			break;
			case 2:
			System.out.println("星期二");
			break;
			case 3:
			System.out.println("星期三");
			break;
			case 4:
			System.out.println("星期四");
			break;
			case 5:
			System.out.println("星期五");
			break;
			case 6:
			System.out.println("星期六");
			break;
			case 7:
			System.out.println("星期日");
			break;
			default:
		    System.out.println("你输入的数据有误");	
			break;	
		}
	}
}
