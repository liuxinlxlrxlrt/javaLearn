package class5;

/*
 *  ���󣺼���¼���������ݣ������������еĽϴ�ֵ
 */

import java.util.Scanner;

public class FunctionDemo01Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		
		System.out.println("�ϴ�ֵ��:"+result);
	}
	/*���󣺼���¼���������ݣ������������еĽϴ�ֵ
	 * 
	 * ������ȷ��
	 * 		����ֵ���ͣ�int
	 * 		�����б�2��������int a,int b
	 */
     public static int getMax(int a,int b) {
    	 //if���
    	 /*
    	   if(a>b) {
    		 //System.out.println(a):�����
    		 return a;
    	 }else {
    		 return b;
    	 }*/
    	 
    	 //����Ԫ�Ľ�
    	 //int c =((a>b)?a:b);
    	 //return c;
    	 
    	 //����c���Ǻ����ʽ��
    	 return  ((a>b)?a:b);
     }
}
