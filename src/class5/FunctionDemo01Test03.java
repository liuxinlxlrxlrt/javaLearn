package class5;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������е����ֵ
 */

public class FunctionDemo01Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int c = sc.nextInt();
		
		int max =getMax(a,b,c);
		System.out.println("���������е����ֵ�ǣ�"+max);
	}
	/*
	 * ���󣺷����������е����ֵ
	 * 
	 * ������ȷ
	 * 		����ֵ���ͣ�int
	 * 		�����б�int a, int b; int c
	 */
	
	public static int getMax (int a, int b, int c){
		//ifǶ��
		/*if(a>b) {
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else{
			if(b>c) {
				return b;
			}else {
				return c;
			}
		}*/
		
		//����Ԫ��
		/*if(a>b) {
			return (a>c?a:c);
		}else {
			return (b>c?b:c);
		}*/
		
		//�����Ľ�
		//return (a>b)?(a>c?a:c):(b>c?b:c);
		
		//�����Ľ�
		//�����飺return (a>b)?(a>c?a:c):(b>c?b:c);
		//д����һ��Ҫע���Ķ���ǿ
		
		int temp = ((a>b)?a:b);
		int max = ((temp>c)?temp:c);
		return max;
	}
}
