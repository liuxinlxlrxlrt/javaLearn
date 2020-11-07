package class8;
/**
 * 这是针对数组进行操作的工具类
 * @author 刘鑫
 * @version V.10
 */

public class ArrayTool2 {
	//把构造方法私有，外界就不能创建对象了,将来这个类中的所有成员方法都是静态
	/**
	 * 这是私有构造
	 */
	private ArrayTool2() {}
	//遍历数组
	/**
	 * 这是遍历数组的方法，遍历的格式是：{元素1, 元素2, 元素3, ...}
	 * @param arr 这是要被遍历的数组
	 */
	public static void printArray1(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
	}
	/**
	 * 这是获取数组最大值的方法
	 * @param arr 这是要获取最大值的数组
	 * @return 返回数组中的最大值
	 */
	//获取最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		return max;
	}
	/**
	 * 这是获取数组最小值的方法
	 * @param arr 这是要获取最小值的数组
	 * @return 返回数组中的最小值
	 */
	//获取最小值
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
		return min;
	}
	//获取索引
	/**
	 * 这是获取元素在数组中第一次出现的索引，如果元素不存在，就返回-1
	 * @param arr 被查找的数组
	 * @param value 被查找的元素
	 * @return 返回元素在数组中的索引，如果不存在，返回-1
	 */
	public static int getIndex(int[] arr,int value) {
		int index =  -1;
		
		for(int x=0;x<arr.length;x++) {
			if(arr[x] == value) {
				index =x;
				break;
			}
		}
		return index;
	}
}
