package class14_RegularExpression;
/*
 * ��ȡ����
 * 		Pattern��Matcher���ʹ��
 * 
 * 		ģʽ��ƥ�����Ļ���ʹ��˳��
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressionDemo06 {
	public static void main(String[] args) {
		// ģʽ��ƥ�����ĵ��͵���˳��
		// ��������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");

		// ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ���Ǳ�ƥ����ַ���
		Matcher m = p.matcher("aaaaab");// �ж�"aaaaab"�Ƿ����Ҫ��

		// ����ƥ���������matches����
		boolean b = m.matches();

		System.out.println("b��" + b);//b��true

		// ������жϹ��ܡ�����������жϣ����������е��鷳
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println("bb��" + bb);//bb��true
	}
}
