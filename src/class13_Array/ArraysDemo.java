package class13_Array;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����࣬����˵����Ͳ���
 * 	A��public static String toString(int[] a)��������ת���ַ���
 *	B��public static void sort(int[] a)������
 *	C��public static int binarySearch(int[] a,int key)�����ֲ���
 */

public class ArraysDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {24,69,80,57,13};
		
		//A��public static String toString(int[] a)��������ת���ַ���
		System.out.println("����ǰ��"+Arrays.toString(arr));
		
		//B��public static void sort(int[] a)������
		Arrays.sort(arr);
		System.out.println("�����"+Arrays.toString(arr));
		
		//C��public static int binarySearch(int[] a,int key)�����ֲ���
		System.out.println("binarySearch��"+Arrays.binarySearch(arr, 57));
		
		
		int[] arr1 = {13,24,57,69,80};
		System.out.println("binarySearch1��"+Arrays.binarySearch(arr1, 69));
	}
}
