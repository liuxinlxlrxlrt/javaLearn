package class4;

import java.util.Scanner;

/*
 * if语句的格式3：
 *    if(关系表达式1) {
 *		     语句体1;
 *	   }else  if (关系表达式2) {
 *		     语句体2;
 *	   }
 *     …
 *	    else {
 *		     语句体n+1;
 *	   }
 *
 *   执行流程
 *首先判断关系表达式1看其结果是true还是false
 *如果是true就执行语句体1
 * 如果是false就继续判断关系表达式2看其结果是true还是false
 *如果是true就执行语句体2
 *如果是false就继续判断关系表达式…看其结果是true还是false
 *…
 *如果没有任何关系表达式为true，就执行语句体n+1。
 */


public class ChooseStructureDemo1ifFormat2Test3 {
	public static void main(String[] args) {
		//需求：键盘录入一个成绩并判断输出成绩的等级
				/*
				 * 90-10 优秀
				 * 80-90好
				 * 70-80良
				 * 60-70及格
				 * 0-60不及格
				 */
				
				//创建键盘录入对象
				Scanner sc = new Scanner(System.in);
				
				//录入数据
				System.out.println("请输入你的考试成绩:");
				int score = sc.nextInt();
				
				if(score >=90 && score <=100) {
					System.out.println("优秀");
				}else if(score >=80 && score <90) {
					System.out.println("好");
				}else if(score >=70 && score <80) {
					System.out.println("良");
				} else if(score >=60 && score <70) {
					System.out.println("及格");
				}else if(score >=0 && score <60) {
					System.out.println("不及格");
				}else {
					System.out.println("你输入的成绩有误");
				} 
				//这样写已经满足了我的基本要求，但是可能别人在使用的时候，不会按照你要求的数据给出来
			    //在做一个程序的基本测试的时候，一定要考虑这样的几个问题：
				//正确的数据、错误数据、边界数据
				//刚才我们写的程序并没有处理错误数据，所以这个数据不是很好，要改进
				
				//另一种判断改进
				if(score <  0 || score >100) {
					System.out.println("你输入的成绩有误");
				}else if(score >=90 && score <=100) {
					System.out.println("优秀");
				}else if(score >=80 && score <90) {
					System.out.println("好");
				}else if(score >=70 && score <80) {
					System.out.println("良");
				} else if(score >=60 && score <70) {
					System.out.println("及格");
				}else {
					System.out.println("不及格");
				}
	}
}
