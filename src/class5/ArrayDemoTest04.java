package class5;

import java.util.Scanner;

/*
 * 数组查表法(根据键盘录入索引,查找对应星期)
 * 		意思是：string[] strArray = {"星期一","星期二",...};
 */

public class ArrayDemoTest04 {
	public static void main(String[] args) {
		//定义一个字符串的数组
		String[] strArray = {"星期一","星期二","星期二","星期三","星期四","星期五","星期六","星期日"};
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数据(0-6):");
		int index = sc.nextInt();
		
		System.out.println("你要查找的日期是："+strArray[index]);
	}
	
		public static String getString(String[] strArray,int index) {
				return strArray[index];
		}
}
