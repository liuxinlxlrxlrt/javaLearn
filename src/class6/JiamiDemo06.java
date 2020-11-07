package class6;
/*
 * 把刚才的数据改进一下:
 * 		A:把数据改进为键盘录入
 * 		B:把代码改进为方法实现
 * 
 * 		另一个数据的测试：
 * 		number:1234567
 * 		第一步：7654321
 * 		第二步：2109876
 * 		第三步：6109872
 * 
 * 知识点：
 * 		变量
 * 		数据类型
 * 		运算符
 * 		键盘录入
 * 		语句
 * 		方法
 * 		数组
 */

import java.util.Scanner;

public class JiamiDemo06 {

	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//请输入一个数据
		System.out.println("请输入一个数据(小于8位):");
		int number = sc.nextInt();
		
		//写功能诗选把number进行加密
		//调用
		String result = jiaMi(number);
		System.out.println("加密后的结果是:"+result);
	}
	/*
	 * 需求：写一功能，把数据number加密
	 * 两个明确：
	 * 		返回值类型：String做一个字符串的拼接
	 * 		参数列表：int number
	 */
	public static String jiaMi(int number) {
			//定义数组
			int[] arr = new int[8];
			
			//定义索引
			int index = 0;
			
			//把number中的数据想办法放到数组中
			while(number>0) {//number=123456,number=12345,number=1234,number=123,number=12,number=1
				arr[index] = number%10;//arr[0]=6,arr[0]=5,arr[0]=4,arr[0]=3,arr[0]=2,arr[0]=1
				index++;//index=1,index=2,index=3,index=4,index=5,index=6
				number/=10;//number=12345,number=1234,number=123,number=12,number=1
			}
			//然后将每一位数字都加上5，然后对10 取得余数
			for(int x=0;x<index;x++) {
				arr[x] +=5;
				arr[x] %=10;
			}
			//最后将第一位和最后一位数字交换
			int temp = arr[0];
			arr[0]=arr[index-1];
			arr[index-1] = temp;
			
			//把数组的元素拼接成一个字符串返回
			//定义一个空内容字符串
			String s = "";
			
			for(int x=0;x<index;x++) {
				 s += arr[x];
			}
			
			return s;
			
			
	}
}
