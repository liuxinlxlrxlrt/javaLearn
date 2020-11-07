package class3;

import java.util.Scanner;

/*
 * 为了让程序更符合开发的数据，我们加入了键盘录入
 * 让程序更灵活一下
 * 
 * 那么：我们如何实现键盘录入呢？
 *    A：导包
 *       格式：“import java.util.Scanner;
 *       位置：
 *       在class上面
 *    B:创建键盘录入对象
 *       格式：
 *       Scanner sc = new Scanner(System.in);
 *    C:通过对象获取数据
 *       格式：  
 *        int x = sc.nextInt();
 *        
 *     
 * 
 */

public class OperatorDemo12 {

	public static void main(String[] args) {
		//创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);
        
		System.out.println("请你输入一个数据");
		int x = sc.nextInt();
		System.out.println("你输入的数据是："+x);
	}

}
