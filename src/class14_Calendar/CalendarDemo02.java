package class14_Calendar;


/*
 * public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬���Ե�ǰ������������
 * public final void set(int year,int month,int date)�����õ�ǰ������������
 */

import java.util.Calendar;
public class CalendarDemo02 {
	public static void main(String[] args) {
		// ��ȡ��ǰ������ʱ��
		Calendar c = Calendar.getInstance();

		// ��ȡ��
		int year = c.get(Calendar.YEAR);
		// ��ȡ��
		int month = c.get(Calendar.MONTH);
		// ��ȡ��
		int date = c.get(Calendar.DATE);

		System.out.println(year + "��" + month + "��" + date + "��");

		// ����ǰ�Ľ���
		c.add(Calendar.YEAR, -3);
		// ��ȡ��
		int year3 = c.get(Calendar.YEAR);
		// ��ȡ��
		int month3 = c.get(Calendar.MONTH);
		// ��ȡ��
		int date3 = c.get(Calendar.DATE);

		System.out.println(year3 + "��" + month3 + "��" + date3 + "��");

		// 5����10��ǰ
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		// ��ȡ��
		int year5 = c.get(Calendar.YEAR);
		// ��ȡ��
		int month5 = c.get(Calendar.MONTH);
		// ��ȡ��
		int date5 = c.get(Calendar.DATE);

		System.out.println(year5 + "��" + month5 + "��" + date5 + "��");
		System.out.println("-------------");

		c.set(2011, 11, 11);
		// ��ȡ��
		int year11 = c.get(Calendar.YEAR);
		// ��ȡ��
		int month11 = c.get(Calendar.MONTH);
		// ��ȡ��
		int date11 = c.get(Calendar.DATE);

		System.out.println(year11 + "��" + month11 + "��" + date11 + "��");
	}
}
