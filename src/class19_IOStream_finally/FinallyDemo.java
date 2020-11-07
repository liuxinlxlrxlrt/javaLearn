package class19_IOStream_finally;
/*
 * finally:��finally���Ƶ������һ����ִ��
 * ע�⣺�����ִ�е�finally֮ǰjvm�˳���,�Ͳ���ִ����
 * A����ʽ
 * 		try...catch...finally...
 * 
 * finally������
 * 		�����ͷ���Դ����IO�����������ݿ�����л����
 * 
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2014-11-20 23:15:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = null;
		try {
			//System.out.println(10/0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.exit(0);
		}finally {
			System.out.println("����Ĵ����ǿ���ִ�е�");
		}
		System.out.println(d);
	}
}
