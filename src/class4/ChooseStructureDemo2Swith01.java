package class4;

/*
 * switch语句格式：
 *     switch(表达式) {
 *	      case 值1：
 *			语句体1;
 *			break;
 *		    case 值2：
 *			语句体2;
 *			break;
 *		    …
 *		    default：	
 *			语句体n+1;
 *			break;
 *    }
 *    
 * 格式解释:
 *     switch表示这是switch语句
 *     表达式的取值：byte,short,int,char
 *     JDK5以后可以是枚举
 *     JDK7以后可以是字符串String
 *     case后面跟的是要和表达式进行比较的值
 *     语句体部分可以是一条或多条语句
 *     break表示中断，结束的意思，可以结束switch语句
 *     default语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似
 *     
 *面试题：
 *    byte可以作为swith的表达式 吗？可以
 *    long可以作为swith的表达式 吗？不可以
 *    string可以作为swith的表达式 吗？可以，JDK7以后可以是字符串
 *    
 *  案例：
 *      键盘录入一个数据:根据这个数据，我们输出对应的星期？
 *         键盘录入1：对应输出星期一；
 *         。。。
 *         键盘录入7，对应输出星期日；
 *         
 * 分析：
 *    1.键盘录入，用Scanner实现
 *    2.判断我们既可以使用if语句 ，也可以使用我们要讲解的swith语句
 * 
 * 注意:
 *    A:遇到左大括号缩进一个tab的位置
 *    B:关联不是很大的语句空行
 */

import java.util.Scanner;

public class ChooseStructureDemo2Swith01 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//控制键盘录入数据
		System.out.println("请输入一个数据（1-7）：");
		int week = sc.nextInt();
		
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
