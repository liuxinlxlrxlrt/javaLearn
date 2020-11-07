package class13_Array;
/*
 * ���ң�
 * 		�������ң�����Ԫ������(��ͷ��β)
 * 		���ֲ���(�۰����)������Ԫ������
 * 
 * ������
 * 		A�����������������С����
 * 		B��������м�����
 * 		C�����м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
 * 				��ȣ��ͷ��ص�ǰ���м�����
 * 				����ȣ�
 * 					��	�����
 * 					С	�ұ���
 * 		D�����¼����м�����
 * 					��	�����
 * 						max = mid-1;
 * 					С	�ұ���
 * 						max = mid+1;
 * 		E���ص�B
 */

public class ArrayDemo02 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {11,22,33,44,55,66,77};
		
		//д����ʵ��
		int index = getIndex(arr, 33);
		System.out.println("index:"+index);
		
		//�������Ԫ�ز����ڻ���ʲô�����أ�
		index = getIndex(arr, 25);
		System.out.println("index:"+index);

	}
	/*
	 * ������ȷ:
	 * ����ֵ���ͣ�int
	 * �����б���int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		//���������������С����
		int max = arr.length-1;
		int min = 0;
		
		//������м�����
		int mid = (max+min)/2;
		
		//���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while(arr[mid] != value) {
			if(arr[mid]>value) {
				max = mid-1;
			}else {
				min = mid +1;
			}
			if(min>max) {
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid;
	}
}