package class6;
/*
 * �Ѹղŵ����ݸĽ�һ��:
 * 		A:�����ݸĽ�Ϊ����¼��
 * 		B:�Ѵ���Ľ�Ϊ����ʵ��
 * 
 * 		��һ�����ݵĲ��ԣ�
 * 		number:1234567
 * 		��һ����7654321
 * 		�ڶ�����2109876
 * 		��������6109872
 * 
 * ֪ʶ�㣺
 * 		����
 * 		��������
 * 		�����
 * 		����¼��
 * 		���
 * 		����
 * 		����
 */

import java.util.Scanner;

public class JiamiDemo06 {

	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������һ������
		System.out.println("������һ������(С��8λ):");
		int number = sc.nextInt();
		
		//д����ʫѡ��number���м���
		//����
		String result = jiaMi(number);
		System.out.println("���ܺ�Ľ����:"+result);
	}
	/*
	 * ����дһ���ܣ�������number����
	 * ������ȷ��
	 * 		����ֵ���ͣ�String��һ���ַ�����ƴ��
	 * 		�����б�int number
	 */
	public static String jiaMi(int number) {
			//��������
			int[] arr = new int[8];
			
			//��������
			int index = 0;
			
			//��number�е�������취�ŵ�������
			while(number>0) {//number=123456,number=12345,number=1234,number=123,number=12,number=1
				arr[index] = number%10;//arr[0]=6,arr[0]=5,arr[0]=4,arr[0]=3,arr[0]=2,arr[0]=1
				index++;//index=1,index=2,index=3,index=4,index=5,index=6
				number/=10;//number=12345,number=1234,number=123,number=12,number=1
			}
			//Ȼ��ÿһλ���ֶ�����5��Ȼ���10 ȡ������
			for(int x=0;x<index;x++) {
				arr[x] +=5;
				arr[x] %=10;
			}
			//��󽫵�һλ�����һλ���ֽ���
			int temp = arr[0];
			arr[0]=arr[index-1];
			arr[index-1] = temp;
			
			//�������Ԫ��ƴ�ӳ�һ���ַ�������
			//����һ���������ַ���
			String s = "";
			
			for(int x=0;x<index;x++) {
				 s += arr[x];
			}
			
			return s;
			
			
	}
}
