package class8;
/**
 * �������������в����Ĺ�����
 * @author ����
 * @version V.10
 */

public class ArrayTool2 {
	//�ѹ��췽��˽�У����Ͳ��ܴ���������,����������е����г�Ա�������Ǿ�̬
	/**
	 * ����˽�й���
	 */
	private ArrayTool2() {}
	//��������
	/**
	 * ���Ǳ�������ķ����������ĸ�ʽ�ǣ�{Ԫ��1, Ԫ��2, Ԫ��3, ...}
	 * @param arr ����Ҫ������������
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
	 * ���ǻ�ȡ�������ֵ�ķ���
	 * @param arr ����Ҫ��ȡ���ֵ������
	 * @return ���������е����ֵ
	 */
	//��ȡ���ֵ
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
	 * ���ǻ�ȡ������Сֵ�ķ���
	 * @param arr ����Ҫ��ȡ��Сֵ������
	 * @return ���������е���Сֵ
	 */
	//��ȡ��Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
		return min;
	}
	//��ȡ����
	/**
	 * ���ǻ�ȡԪ���������е�һ�γ��ֵ����������Ԫ�ز����ڣ��ͷ���-1
	 * @param arr �����ҵ�����
	 * @param value �����ҵ�Ԫ��
	 * @return ����Ԫ���������е���������������ڣ�����-1
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
