package class8;
/*
 *  �Ǿ�ֻ̬���������
 *  
 *  ��ͬһ�ļ����£��ඨ���������ļ��кͶ�����һ���ļ�����ʵ��һ����
 */

public class ArrayDemo {

	public static void main(String[] args) {
		//��������
		int[] arr = {28,55,37,46,19};
		//���󣬱�������
//		for(int x=0;x<arr.length;x++) {
//			if (x==arr.length-1) {
//				System.out.print(arr[x]);
//			}else {
//				System.out.print(arr[x]+", ");
//			}
//		}
		
		//������ж������Ҫ���б�������ô������ظ��Ⱦͺܸ�
		//��θĽ����÷����Ľ�
		//����
		//��̬��������
//		printArray(arr);
		
		//�Ǿ�̬��������
//		ArrayDemo ad = new ArrayDemo();
//		ad.printArray(arr);
		
		//����������ã�����������Ķ��󣬵���������Ĺ���
		//���������ڵĲ����Ǹ�������صģ���Ӧ�ð���Щ�����������������
		//����һ�����������
		//�������������֮��ĵ���
		//�ѹ��췽��˽�У����Ͳ��ܴ���������
//		ArrayTool at = new ArrayTool();
//		at.printArray(arr);
//		System.out.println("\t");//" "
		//�����Ľ�Ϊ��̬�󣬾Ϳ���ֱ��ͨ����������
		ArrayTool.printArray1(arr);
		
	}
//	public static void printArray(int[] arr) {
//		for(int x=0;x<arr.length;x++) {
//		if (x==arr.length-1) {
//			System.out.print(arr[x]);
//		}else {
//			System.out.print(arr[x]+", ");
//		}
//	   }
//	}
	
	//����÷������Ǿ�̬��
//	public void printArray(int[] arr) {
//		for (int x = 0; x < arr.length; x++) {
//			if (x == arr.length - 1) {
//				System.out.print(arr[x]);
//			} else {
//				System.out.print(arr[x] + ", ");
//			}
//		}
//	}
}
