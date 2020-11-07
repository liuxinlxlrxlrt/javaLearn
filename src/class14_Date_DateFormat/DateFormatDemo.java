package class14_Date_DateFormat;
/*
 * Date---String(��ʽ��)
 * 		public final String format(Date date)
 * 
 * String---Date(����)
 * 
 * DateFormat:���Խ������ں��ַ����ĸ�ʽ���ͽ������������ڳ����࣬����ʹ�þ�������SimpleDateFormat
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 			SimpleDateFormat():Ĭ��ģʽ
 * 			public SimpleDateFormat(String pattern)������ģʽ
 * 					���ģʽ�ַ��������д�أ�
 * 					ͨ���鿴API�������ҵ��˶�Ӧ��ģʽ
 * 				�꣺y
 * 				�£�M
 * 				�գ�d
 * 				ʱ��H
 * 				�֣�m
 * 				�룺s
 * 				2014��12��12�� 12:12:12
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		// Date---String
		// �������ڶ���
		Date d = new Date();

		// ������ʽ������
		// Ĭ��ģʽ
//		SimpleDateFormat sdf = new SimpleDateFormat();
		// ����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);

		// String---Date(����)
		String str = "2018-08-08 12:12:12";
		// �ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ������ַ����ĸ�ʽƥ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
