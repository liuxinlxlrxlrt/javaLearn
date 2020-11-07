package class4;

import java.util.Scanner;

/*
 * if语句格式2的练习：
 *    A：获取两个数据中的较大值
 *    B：判断一个数是奇数还是偶数，并输出
 */

public class ChooseStructureDemo1ifFormat2Test1 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		 
		//获取两个数据最大的值
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		//定义一个变量接受最大值
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
        System.out.println("max:"+max);
        System.out.println("------------------------------");
        
        //判断一个数据是奇数还是偶数
        System.out.println("请输入你要判断的数据:");
        int x = sc.nextInt();
        
        if(x%2 == 0) {
        	System.out.println(x+"这个数是偶数");
        }else {
        	System.out.println(x+"这个数是奇数");
        }
	}
}
