package class4;

import java.util.Scanner;

/*
 * ����¼���·ݵ�ֵ�������Ӧ�ļ���
 * ����3,4,5
 * �ģ�6,7,8
 * �9,10,10
 * ����12,1,2
 * 
 * ������
 *    A������¼���·ݵ�ֵ����������Ҫʹ��Scanner
 *    B:����Ӧ���ж�����·�����һ�����ڣ�������ж�����Ƕȣ�������if����ʽ3
 *    
 *  if����ʹ�ó�����
 *    A����Ա��ʽ ��һ��boolean���͵��ж�
 *    B:���һ����Χ���ж� 
 */

public class ChooseStructureDemo1ifFormatExercises02 {

	public static void main(String[] args) {
		//��������¼��
		Scanner  sc = new Scanner(System.in);
		//¼������		
		System.out.println("������һ���·ݣ�");
		int month = sc.nextInt();

		//�����ָ�ʽʵ�ּ���
		if(month <1 && month >12) {
			System.out.println("��������·�����");
		}else if(month == 1) {
			System.out.println("����");
		}else if(month == 2) {
			System.out.println("����");
		}else if(month == 3) {
			System.out.println("����");
		}else if(month == 4) {
			System.out.println("����");
		}else if(month == 5) {
			System.out.println("����");
		}else if(month == 6) {
			System.out.println("�ļ�");
		}else if(month == 7) {
			System.out.println("�ļ�");
		}else if(month == 8) {
			System.out.println("�ļ�");
		}else if(month == 9) {
			System.out.println("�＾");
		}else if(month == 10) {
			System.out.println("�＾");
		}else if(month == 11) {
			System.out.println("�＾");
		}else  {
			System.out.println("����");
		}
		System.out.println("-------------------------------");
		
		//�������ȷʵ���������ǵ�Ҫ�󣬵��Ǿ��ǿ������Ƚ��鷳
		//��ô�������ܲ��ܸĽ�һ���أ�
		//month == 3/4/5:����������Ǵ���
		//�����Ǳ���ÿһ������һ��boolean���ʽ
		//���ԣ����ǾͿ��Կ���ʹ���߼���������������������Ľ�
		if(month <1 && month >12) {
			System.out.println("��������·�����");
		}else if(month == 3 || month == 4 || month == 5) {
			System.out.println("����");
		}else if(month == 6 || month == 7 || month == 8) {
			System.out.println("�ļ�");
		}else if(month == 9 || month == 10 || month == 11) {
			System.out.println("�＾");
		}else {
			System.out.println("����");
		}
		System.out.println("-------------------------------");
		
		//���ʱ���������Ѿ�������
		//�����أ�������Ҫ��������һ���·ݣ��ж����ϰ��껹���°���
		//���ʱ�����ǵ��ж��������Ӿ���6��boolean���ʽ
		//���ǿ��ܻ��Ǹ��������
		//����ף���ʵ���ǻ��������һ�ָĽ�����
		//month == 3/4/5:
		//month >=3 && month<=5
		//�÷�ΧҲ�ǿ��ԸĽ���
		if(month <1 && month >12) {
			System.out.println("��������·�����");
		}else if(month >= 3 && month <= 5 ) {
			System.out.println("����");
		}else if(month >= 6 && month <= 8) {
			System.out.println("�ļ�");
		}else if(month >= 9 && month <= 11) {
			System.out.println("�＾");
		}else {
			System.out.println("����");
		}
	}
}
