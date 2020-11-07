package class14_Date_DateFormat;
/*
 * Date����ʾ�ض���˲�䣬��ȷ������
 * 
 * ���췽����
 * 		Date()�����ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * 		Date(long date)�����ݸ����ĺ���ֵ�������ڶ���
 */

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// ��������
		Date d = new Date();
		System.out.println("d��" + d);

		// ��������
		long time = System.currentTimeMillis();
		Date d2 = new Date(time);
		System.out.println("d2��" + d2);

		// ��������
		// long time = System.currentTimeMillis();
		long time2 = 1000 * (60 * 60); // 1Сʱ��������-8+1=9:00��
		Date d3 = new Date(time2);
		System.out.println("d3��" + d3);
	}
}
