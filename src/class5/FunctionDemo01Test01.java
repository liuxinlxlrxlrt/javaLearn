package class5;

/*
 *  需求：键盘录入两个数据，返回两个数中的较大值
 */

import java.util.Scanner;

public class FunctionDemo01Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		
		System.out.println("较大值是:"+result);
	}
	/*需求：键盘录入两个数据，返回两个数中的较大值
	 * 
	 * 两个明确：
	 * 		返回值类型：int
	 * 		参数列表：2个，都是int a,int b
	 */
     public static int getMax(int a,int b) {
    	 //if语句
    	 /*
    	   if(a>b) {
    		 //System.out.println(a):错误的
    		 return a;
    	 }else {
    		 return b;
    	 }*/
    	 
    	 //用三元改进
    	 //int c =((a>b)?a:b);
    	 //return c;
    	 
    	 //由于c就是后面的式子
    	 return  ((a>b)?a:b);
     }
}
