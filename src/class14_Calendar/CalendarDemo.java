package class14_Calendar;
/*
 * Calendar����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� 
 * �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ����
 * 
 * public int get(int field)�����ظ��������ֶε�ֵ���������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա����������int���͡�
 */

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// �������ֶ����ɵ�ǰ���ں�ʱ���ʼ��
		Calendar rightNow = Calendar.getInstance();// �������

		// ��ȡ��
		int year = rightNow.get(Calendar.YEAR);
		// ��ȡ��
		int month = rightNow.get(Calendar.MONTH);
		// ��ȡ��
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + month + "��" + date + "��");
	}
}
/*
 * abstract class Person{ public static Person getPerson(){ return new
 * Student(); } }
 * 
 * class Student extends Person{
 * 
 * }
 */
