package class14_BigInteger;
/*
 * BigInteger�������ó���Integer��Χ�ڵ����ݽ��м���
 * ���췽����
 * BigInteger(String val)
 */

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		// �⼸��������Ϊ�˳���In��Χ�ڣ�Integer�Ͳ����ٱ�ʾ�����Ծ͸�̸���ϼ�����
//		Integer i = new Integer(100);
//		System.out.println(i);
//		//System.out.println(Integer.MAX_VALUE);
//		Integer ii = new Integer("2147483647");
//		System.out.println(ii);
//		//NumberFormatException
//		Integer iii = new Integer("21474836478");
//		System.out.println(iii);

		// ͨ����������������
		BigInteger bi = new BigInteger("21474836478");
		System.out.println("bi��" + bi);
	}
}
