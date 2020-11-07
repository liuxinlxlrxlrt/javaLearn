package class13_Array;
/*
 *数组值基本查找(顺序查找)
 */

public class ArrayDemo05 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		int index = getIndex(arr, 57);
		System.out.println("index：" + index);

	}

	public static int getIndex(int[] arr, int value) {
		for (int x = 0; x < arr.length - 1; x++) {
			if (arr[x] == value) {
				return x;
			}
		}
		return -1;
	}
}
