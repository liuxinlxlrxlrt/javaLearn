package class6;

/*
 * ��ά����:����Ԫ��Ϊһά�����һ������
 * 
 * ��ʽ:
 * 		��������[][] ������ = new ��������[m][n];
 * 
 * 		m:��ʾ�����ά�����ж��ٸ�һά����
 * 		n:��ʾÿһ��һά�����Ԫ���ж��ٸ�
 * 
 * 	ע�⣺
 * 		A:���¸�ʽҲ���Ա�ʾΪ��ά���飺
 * 			a.�������� ������[][] = new ��������[m][n];
 * 			b.��������[] ������[] = new ��������[m][n];
 * 		B:ע�����涨�������
 * 			int x;
 * 			int y;
 * 			int x,y;
 * 			
 * 			int[] x;
 * 			int[] y[];
 * 			int[] x,y[];
 */

public class Array2Demo01 {

	public static void main(String[] args) {
		//����һ����ά����
		int[][] arr = new int[3][2];
		//������һ����ά����arr
		//�����ά������3��һά�����Ԫ��
		//ÿһ��һά������2��Ԫ��
		//�����ά��������
		System.out.println(arr);//��ֵַ[[I@15db9742
		//�����ά����ĵ�һ��Ԫ��һά���������
		System.out.println(arr[0]);//��ֵַ[I@6d06d69c
		System.out.println(arr[1]);//��ֵַ[I@7852e922
		System.out.println(arr[2]);//��ֵַ[I@4e25154f
		//�����ά�����Ԫ��
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
	}
}
