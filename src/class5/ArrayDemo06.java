package class5;

/*
 * 数组操作常见的两个小问题:
 * 		A:ArrayIndexOutOfBoundsException
 * 			原因：你访问不了不存在的索引
 * 
 * 		B:NullPointerException
 * 		 	原因：数组已经不再指向堆内存了，而你还用数组名去访问元素名
 * 
 * 		作用：请自己把所有的常见Exception结尾的问题总结一下，以后遇到就记录下来
 *			现象，原因，解决等等
 */

public class ArrayDemo06 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		//System.out.println(arr[3]);
		
		//引用类型的常量：空常量null
		arr = null;
		System.out.println(arr[0]);		
	}
}
