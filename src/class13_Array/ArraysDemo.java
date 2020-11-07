package class13_Array;

import java.util.Arrays;

/*
 * Arrays:针对数组进行操作的工具类，比如说排序和查找
 * 	A：public static String toString(int[] a)：把数组转成字符串
 *	B：public static void sort(int[] a)：排序
 *	C：public static int binarySearch(int[] a,int key)：二分查找
 */

public class ArraysDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {24,69,80,57,13};
		
		//A：public static String toString(int[] a)：把数组转成字符串
		System.out.println("排序前："+Arrays.toString(arr));
		
		//B：public static void sort(int[] a)：排序
		Arrays.sort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
		
		//C：public static int binarySearch(int[] a,int key)：二分查找
		System.out.println("binarySearch："+Arrays.binarySearch(arr, 57));
		
		
		int[] arr1 = {13,24,57,69,80};
		System.out.println("binarySearch1："+Arrays.binarySearch(arr1, 69));
	}
}
