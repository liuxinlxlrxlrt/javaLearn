package class5;

/*��
 * �����������飬�ֱ��������������Ե���������Ԫ��ֵ
 * Ȼ���ÿ�������Ԫ�����¸�ֵ���ٴηֱ��������������Ե���������Ԫ��ֵ
 */

public class ArrayDemo03 {
	public static void main(String[] args) {
		//�����һ������
		int[] arr1 = new int[2];
		
		//����ڶ�������
		int[] arr2 = new int[2];
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println("--------------");
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println("--------------");
		
		//��Ԫ�����¸�ֵ
		arr1[1]=20;
		
		arr2[1]=30;
		arr2[0]=40;
		//�������Ԫ��ֵ
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println("--------------");
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
}
