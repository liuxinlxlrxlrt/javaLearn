package class4;

import java.util.Scanner;

/*
 * if����ʽ2����ϰ��
 *    A����ȡ���������еĽϴ�ֵ
 *    B���ж�һ��������������ż���������
 */

public class ChooseStructureDemo1ifFormat2Test1 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		 
		//��ȡ������������ֵ
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		
		//����һ�������������ֵ
		int max;
		
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
        System.out.println("max:"+max);
        System.out.println("------------------------------");
        
        //�ж�һ����������������ż��
        System.out.println("��������Ҫ�жϵ�����:");
        int x = sc.nextInt();
        
        if(x%2 == 0) {
        	System.out.println(x+"�������ż��");
        }else {
        	System.out.println(x+"�����������");
        }
	}
}
