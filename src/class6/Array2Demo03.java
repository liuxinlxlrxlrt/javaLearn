package class6;

/*
 * ��ʽ3��
 * 	������ʽ��
 * 		��������[][] ������ = new ��������[][]{{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};
 *	�򻯰��ʽ��
 *		��������[][] ������ = {{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};
 *		
 *	������
 *		int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
 *		int[][] arr =  {{1,2,3},{4,5},{6}};
 */

public class Array2Demo03 {
	public static void main(String[] args) {
		//��������
		int[][] arr =  {{1,2,3},{4,5},{6}};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println(arr[2][0]);
	}
}
