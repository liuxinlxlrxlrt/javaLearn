package class13_Array;
/*
 * ע�⣺���������������������
 * ��Ϊ���鱾��������ģ�������������µĲ��Ҳ���ʹ�ö��ֲ���
 * ��Ȼ���Ѿ������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ������
 */

public class ArrayDemo03 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// ����ǰ
		System.out.println("����ǰ��");
		printAarry(arr);

		// ������
		// �����ҿ����жԸ�����Ҫ����������Ҫд�ɷ���
		bubbleSort(arr);
		System.out.println("�����");
		printAarry(arr);

		// �����
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);

	}

//ð�ݲ���
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

//��������
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

//���ֲ���
	public static int getIndex(int[] arr, int value) {
		// ���������������С����
		int max = arr.length - 1;
		int min = 0;

		// ������м�����
		int mid = (max + min) / 2;

		// ���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
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
