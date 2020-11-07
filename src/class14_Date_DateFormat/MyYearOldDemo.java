package class14_Date_DateFormat;
/*
 * ��һ��������������������?
 * 
 * ������
 * 		A����������������ո�����¼��
 * 		B���Ѹ��ַ���ת��Ϊһ������
 * 		C��ͨ��������ת��Ϊһ������ֵ
 * 		D����ȡ��ǰʱ��ĺ���ֵ
 * 		E����D-C�õ�һ������ֵ
 * 		F����E�ĺ���ֵ����λ��
 * 				/1000/60/60/24
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		// ��������������ո�����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ��������գ�");
		String line = sc.nextLine();

		// �Ѹ��ַ���ת��Ϊһ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// ͨ��������ת��Ϊһ������ֵ
		long myTime = d.getTime();

		// ��ȡ��ǰʱ��ĺ���ֵ
		long nowTime = System.currentTimeMillis();

		// ��D-C�õ�һ������ֵ
		long time = nowTime - myTime;

		// ��E�ĺ���ֵ����λ��
		long day = time / 1000 / 60 / 60 / 24;
		long year = time / 1000 / 60 / 60 / 24 / 365;

		System.out.println("������������磺" + day + "��");
		System.out.println("������������磺" + year + "��");
	}
}
