package class8;

public class ArrayTool {
	// �ѹ��췽��˽�У����Ͳ��ܴ���������,����������е����г�Ա�������Ǿ�̬
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
