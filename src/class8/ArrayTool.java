package class8;

public class ArrayTool {
	// 把构造方法私有，外界就不能创建对象了,将来这个类中的所有成员方法都是静态
	private ArrayTool() {
	}

	public void printArray(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
	}

	public static void printArray1(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
	}
}
