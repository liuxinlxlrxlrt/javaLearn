package class5;
/*
 * �����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
 * 
 * ������
 * 		A:����һ�����飬���������Ԫ�ؽ��о�̬��ʼ��
 * 		B����������������һ��Ԫ����Ϊ�����һ��ȡ��һ������Ĭ�����������ֵ
 * 		C��Ȼ�����������Ԫ�أ����λ�ȡ�Ͳ�������бȽϣ�������������������С�����뿪
 * 		D��Ȼ����������汣��ľ������ֵ
 */
public class ArrayDemoTest02 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {34,98,10,25,67};
		
		//���ȡ�����е����ֵ
		/*
		//��������������һ��Ԫ����Ϊ������
		int max = arr[0];
		//Ȼ�����������Ԫ��
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		//�������ﱣ��ľ������ֵ
		System.out.println("max:"+max);
		*/
		
		//����������÷����Ľ�
		//����
		int max = getMax(arr);
		System.out.println("max:"+max);
		//���ȡ�����е���Сֵ
		
		int min = getMin(arr);
		System.out.println("min:"+min);

	}
	/*
	 * ���󣺻�ȡ�����е����ֵ
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�int[] arr
	 */
	public static int getMax(int[] arr) {
		//��������������һ��Ԫ����Ϊ������
		int max = arr[0];
		//Ȼ�����������Ԫ��
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		//�������ﱣ��ľ������ֵ
		return max;
	}
	
	public static int getMin(int[] arr) {
		//��������������һ��Ԫ����Ϊ������
		int min = arr[0];
		//Ȼ�����������Ԫ��
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<min) {
				min = arr[x];
			}
		}
		//�������ﱣ��ľ������ֵ
		return min;
	}
}
