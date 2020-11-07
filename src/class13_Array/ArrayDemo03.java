package class13_Array;
/*
 * 注意：下面这种做法是有问题的
 * 因为数组本身是无序的，所以这种情况下的查找不能使用二分查找
 * 虽然你已经排序了，但是你排序的时候已经改变了我是原始的元素索引
 */

public class ArrayDemo03 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// 排序前
		System.out.println("排序前：");
		printAarry(arr);

		// 先排序
		// 由于我可能有对个数组要排序，所以我要写成方法
		bubbleSort(arr);
		System.out.println("排序后：");
		printAarry(arr);

		// 后查找
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);

	}

//冒泡查找
	public static void bubbleSort(int[] arr) {
		for (int y = 0; y < arr.length - 1; y++) {
			for (int x = 0; x < arr.length - 1 - y; x++) {
				if (arr[x] > arr[x + 1]) {
					int temp = arr[x];
					arr[x] = arr[x + 1];
					arr[x + 1] = temp;
				}
			}
		}
	}

//遍历功能
	public static void printAarry(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ",");
			}
		}
		System.out.println("]");
	}

//二分查找
	public static int getIndex(int[] arr, int value) {
		// 定义最大索引，最小索引
		int max = arr.length - 1;
		int min = 0;

		// 计算出中间索引
		int mid = (max + min) / 2;

		// 拿中间索引的值和要查找的值进行比较
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			if (min > max) {
				return -1;
			}
			mid = (max + min) / 2;
		}
		return mid;
	}
}
