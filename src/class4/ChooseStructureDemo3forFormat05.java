package class4;

/*
 * 需求：求5的阶乘(求阶乘思想)
 * 
 * 什么阶乘？
 * 		n! = n*（n-1）规则
 * 		n! = n*(n-1)(n-2)*...3*2*1
 */

public class ChooseStructureDemo3forFormat05 {
	public static void main(String[] args) {
				//求5的阶乘
				int sum1 = 1;
				
				for(int x=1;x<=5;x++) {
					sum1 *=x;
				}
		        System.out.println("1-100之间数据之和sum1是："+sum1);
	}
}
