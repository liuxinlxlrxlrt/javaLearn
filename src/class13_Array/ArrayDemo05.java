package class13_Array;
/*
 *����ֵ��������(˳�����)
 */

public class ArrayDemo05 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		int index = getIndex(arr, 57);
		System.out.println("index��" + index);

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
