package class6;
/*
 * 格式2：
 *    数组类型[][] 数组名 = new 数组类型[m][];
 *    m:标识这个二维数组有多少个一维数组
 *    列数没有给出，可以动态的给，这一次是一个变化的列数
 */

public class Array2Demo02 {
	public static void main(String[] args) {
		//定义数组
		int[][] arr = new int[3][];
		
		System.out.println(arr);//地址值[[I@15db9742
		
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		
		//动态的为每一个一维数组分配空间
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[0][2]);//错误
		
		arr[1][0] = 100;
		arr[1][2] = 200;
		
		System.out.println(arr[1][0]);//100
		System.out.println(arr[1][1]);//0
		System.out.println(arr[1][2]);//200
	}
}
