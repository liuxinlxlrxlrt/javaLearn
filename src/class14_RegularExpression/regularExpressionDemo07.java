package class14_RegularExpression;

/*
 * ��ȡ���ܣ���ȡ��������ַ������������ַ���ɵĵ���
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * 
 * ͨ������ģʽ�� matcher ������ģʽ����ƥ����������ƥ�����󣬿���ʹ����ִ�����ֲ�ͬ��ƥ������� 
 * 		A��matches �������Խ����������������ģʽƥ�䡣 
 * 		B��lookingAt ���Խ��������д�ͷ��ʼ���ģʽƥ�䡣 
 *		C��find ����ɨ�����������Բ������ģʽƥ�����һ�������С�
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressionDemo07 {
	public static void main(String[] args) {
		// �����ַ���
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";

		// ����
		String regex = "\\b\\w{3}\\b";

		// ��������ʽ�����ģʽ����
		Pattern p = Pattern.compile(regex);

		// ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);

		// ����ƥ���������matches����
		// ͨ��find�������ǲ�����û�������������Ӵ�
//		boolean flag = m.find();
//		System.out.println("flag��"+flag);
//		//��εõ�ֵ�أ�
//		//public String group()
//		String ss = m.group();
//		System.out.println("ss��"+ss);
//		
//		//����һ��
//		flag = m.find();
//		System.out.println("flag��"+flag);
//		String sss = m.group();
//		System.out.println("sss��"+sss);

		while (m.find()) {
			System.out.println(m.group());
		}

		// ע�⣺һ��Ҫfind(),Ȼ�����group()
		// IllegalStateException: No match found
//		String sss = m.group();
//		System.out.println("sss��"+sss);
	}
}
