package class14_Date_DateFormat;
/*
 * ��Ա����
* public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
* public void setTime(long time)������ʱ��
* 
* ��Date�õ�����ֵ
* 			setTime()
* ��һ������ֵת��ΪDate
* 			���췽����
* 			setTime(long time)
 */

import java.util.Date;

public class DateDemo02 {
	public static void main(String[] args) {
		// ��������
		Date d = new Date();

		// ��ȡʱ��
		long time = d.getTime();
		System.out.println(time);
		// System.out.println(System.currentTimeMillis());

		System.out.println("d��" + d);
		// ����ʱ��
		d.setTime(1000);
//		Date d2 =  new Date(time);
		System.out.println("d��" + d);
	}
}
