package class5;
/*
 * �����һ�����飬������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ��
 * ����ڶ������飬������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ��
 * ������������飬�ѵ�һ������ĵ�ֵַ������(ע��һ��)��ͨ�����������������ȥ��Ԫ���ظ���ֵ��
 * ����ٴ������һ���������ƺ�Ԫ��
 */

public class ArrayDemo04 {
	public static void main(String[] args) {
		//�����һ������
		int[] arr1 = new int[3];
		arr1[0]=83;
		arr1[1]=33;
		arr1[2]=63;
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("--------");		
		
		//����ڶ�������
		int[] arr2 = new int[3];
		arr2[0]=22;
		arr2[1]=44;
		arr2[2]=88;
				
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("--------");	
		
		//�������������
		int[] arr3 = arr1;
		arr3[0]=100;
		arr3[1]=200;
				
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
	}
}
