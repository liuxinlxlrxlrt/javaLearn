package class4;

import java.util.Scanner;

/*
 * if���ĸ�ʽ3��
 *    if(��ϵ���ʽ1) {
 *		     �����1;
 *	   }else  if (��ϵ���ʽ2) {
 *		     �����2;
 *	   }
 *     ��
 *	    else {
 *		     �����n+1;
 *	   }
 *
 *   ִ������
 *�����жϹ�ϵ���ʽ1��������true����false
 *�����true��ִ�������1
 * �����false�ͼ����жϹ�ϵ���ʽ2��������true����false
 *�����true��ִ�������2
 *�����false�ͼ����жϹ�ϵ���ʽ����������true����false
 *��
 *���û���κι�ϵ���ʽΪtrue����ִ�������n+1��
 */


public class ChooseStructureDemo1ifFormat2Test3 {
	public static void main(String[] args) {
		//���󣺼���¼��һ���ɼ����ж�����ɼ��ĵȼ�
				/*
				 * 90-10 ����
				 * 80-90��
				 * 70-80��
				 * 60-70����
				 * 0-60������
				 */
				
				//��������¼�����
				Scanner sc = new Scanner(System.in);
				
				//¼������
				System.out.println("��������Ŀ��Գɼ�:");
				int score = sc.nextInt();
				
				if(score >=90 && score <=100) {
					System.out.println("����");
				}else if(score >=80 && score <90) {
					System.out.println("��");
				}else if(score >=70 && score <80) {
					System.out.println("��");
				} else if(score >=60 && score <70) {
					System.out.println("����");
				}else if(score >=0 && score <60) {
					System.out.println("������");
				}else {
					System.out.println("������ĳɼ�����");
				} 
				//����д�Ѿ��������ҵĻ���Ҫ�󣬵��ǿ��ܱ�����ʹ�õ�ʱ�򣬲��ᰴ����Ҫ������ݸ�����
			    //����һ������Ļ������Ե�ʱ��һ��Ҫ���������ļ������⣺
				//��ȷ�����ݡ��������ݡ��߽�����
				//�ղ�����д�ĳ���û�д���������ݣ�����������ݲ��Ǻܺã�Ҫ�Ľ�
				
				//��һ���жϸĽ�
				if(score <  0 || score >100) {
					System.out.println("������ĳɼ�����");
				}else if(score >=90 && score <=100) {
					System.out.println("����");
				}else if(score >=80 && score <90) {
					System.out.println("��");
				}else if(score >=70 && score <80) {
					System.out.println("��");
				} else if(score >=60 && score <70) {
					System.out.println("����");
				}else {
					System.out.println("������");
				}
	}
}
