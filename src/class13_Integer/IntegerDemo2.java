package class13_Integer;
/*
 * Integer�Ĺ��췽��
 * public Integer(int value)
 * public Integer(String s)
 * 		ע�⣺����ַ���������������ĸ���
 */

public class IntegerDemo2 {
	public static void main(String[] args) {
		//��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		//�����ӡ�ĵ�ֵַ��û����дtoString()
		//�����ӡ����100����дtoString()
		System.out.println("ii��"+ii);
		
		//��ʽ2
		String s = "100";

		Integer iii = new Integer(s);

		System.out.println("iii��"+iii);
		//NumberFormatException
		//Ҫ��ת��integer���͵İ�װ�����ͣ����뺬�����ֵģ�����û����ĸ
		//String s1 = "abc";
		//Integer iiii = new Integer(s1);
		//System.out.println("iiii��"+iiii);
	}
}
