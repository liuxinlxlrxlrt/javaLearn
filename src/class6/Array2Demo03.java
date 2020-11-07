package class6;

/*
 * 格式3：
 * 	基本格式：
 * 		数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}};
 *	简化版格式：
 *		数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};
 *		
 *	举例：
 *		int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
 *		int[][] arr =  {{1,2,3},{4,5},{6}};
 */

public class Array2Demo03 {
	public static void main(String[] args) {
		//定义数组
		int[][] arr =  {{1,2,3},{4,5},{6}};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println(arr[2][0]);
	}
}
