package class13_Array;
/*
 * ��������֮ð������
 * 		����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
 */

public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		System.out.println("����ǰ��");
		printAarry(arr);
		
		/*
		//��һ�αȽ�
		//Ϊ�˷�ֹ����Խ��
		for(int x=0;x<arr.length-1-0;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		}
		System.out.println("��һ�αȽϣ�");
		printAarry(arr);
		
		//�ڶ��αȽ�
		//arr.length-1Ϊ�˷�ֹ����Խ��
		//arr.length-1-1��Ϊ�˼��ٱȽϵĴ���
		for(int x=0;x<arr.length-1-1;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		}
		System.out.println("�ڶ��αȽϣ�");
		printAarry(arr);
		
		//�����αȽ�
		//arr.length-1Ϊ�˷�ֹ����Խ��
		//arr.length-1-2��Ϊ�˼��ٱȽϵĴ���
		for(int x=0;x<arr.length-1-2;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		}
		System.out.println("�����αȽϣ�");
		printAarry(arr);
		
		//���ĴαȽ�
		//arr.length-1Ϊ�˷�ֹ����Խ��
		//arr.length-1-3��Ϊ�˼��ٱȽϵĴ���
		for(int x=0;x<arr.length-1-3;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		}
		System.out.println("���ĴαȽϣ�");
		printAarry(arr);
		
		//��Ȼ�����ˣ�����Ĵ�������������
		//����Ĵ����ظ���̫�ߣ�������ѭ���Ľ�
//		for(int y=0;y<4;y++) {
//		for(int x=0;x<arr.length-1-y;x++) {
//			if(arr[x]>arr[x+1]) {
//				int temp = arr[x];
//				arr[x]=arr[x+1];
//				arr[x+1]=temp;
//			}
//		  }
//		}
		
		
		//��������֪���ȽϵĴ��������鳤��-1�����ԸĽ����հ�����
		for(int y=0;y<arr.length-1;y++) {
		for(int x=0;x<arr.length-1-y;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		  }
		}
		System.out.println("ѭ���Ľ������");
		printAarry(arr);
		*/
		
		//�����ҿ����жԸ�����Ҫ����������Ҫд�ɷ���
		bubbleSort(arr);
		System.out.println("�����");
		printAarry(arr);
	}
	//����
	public static void bubbleSort(int[] arr) {
		for(int y=0;y<arr.length-1;y++) {
		for(int x=0;x<arr.length-1-y;x++) {
			if(arr[x]>arr[x+1]) {
				int temp = arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=temp;
			}
		  }
		}
	}
	//��������
	public static void printAarry(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.println("]");
	}
}
