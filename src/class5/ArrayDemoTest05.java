package class5;
/*
 * ��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 * 
 * ������
 * 		A������һ�����飬����̬��ʼ��
 * 		B��дһ������ʵ�֣�
 * 			�������飬���λ�ȡ�������е�һ��Ԫ�أ�����֪�����ݽ��бȽ�
 * 			�����ȣ��ͷ��ص�ǰ������ֵ
 */

public class ArrayDemoTest05 {
	public static void main(String[] args) {
		//����һ�����飬����̬��ʼ��
		int[] arr = {200,250,38,888,444};
		
		//������Ҫ����250����������е�һ�γ��ֵ�����
		int index = getIndex(arr,250);
		System.out.println("250�������е�һ�γ��ֵ�����ֵ��:"+index);
		
		int index2 = getIndex2(arr,250);
		System.out.println("250�������е�һ�γ��ֵ�����ֵ��:"+index2);
		
		int index3 = getIndex2(arr,2500);
		System.out.println("250�������е�һ�γ��ֵ�����ֵ��:"+index3);
	}
	/*
	 * ���󣺲����ƶ������������е�һ�γ��ֵ�����
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr,int value
	 */
	
	public static int getIndex(int[] arr,int value) {
		//�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
			for(int x=0;x<arr.length;x++) {
				if(arr[x] == value) {
					//�����ȣ��ͷ��ص�ǰֵ������ֵ
					return x;
				}
			}
			//Ŀǰ�Ĵ�����һ��С����
			//���Ǽ�����Ҫ���ҵ������������в����ڣ��Ҳ��������ж�Ӧ�ķ����룿
			//���Ա���
			
			//ֻҪ���жϣ��Ϳ�����false,���Դ��ҪС��
			
			//����Ҳ������ݣ�����һ�㷵��һ���������ɣ����ҷ���-1
			return -1;
	}
	
	public static int getIndex2(int[] arr,int value) {
		//����һ������
		int index = -1;
		
		//�о��޸�����ֵ
		for(int x=0;x<arr.length;x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
	     }
		//����index
		return index;

      }
}
