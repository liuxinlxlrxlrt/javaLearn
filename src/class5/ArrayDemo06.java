package class5;

/*
 * �����������������С����:
 * 		A:ArrayIndexOutOfBoundsException
 * 			ԭ������ʲ��˲����ڵ�����
 * 
 * 		B:NullPointerException
 * 		 	ԭ�������Ѿ�����ָ����ڴ��ˣ����㻹��������ȥ����Ԫ����
 * 
 * 		���ã����Լ������еĳ���Exception��β�������ܽ�һ�£��Ժ������ͼ�¼����
 *			����ԭ�򣬽���ȵ�
 */

public class ArrayDemo06 {
	public static void main(String[] args) {
		//��������
		int[] arr = {1,2,3};
		
		//System.out.println(arr[3]);
		
		//�������͵ĳ������ճ���null
		arr = null;
		System.out.println(arr[0]);		
	}
}
