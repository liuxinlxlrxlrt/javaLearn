package Class13_StringBuffer;
/*
 * ���ַ�����ת
 */
import java.util.Scanner;

public class StringBufferTest3 {
	public static void main(String[] args) {
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String s = sc.nextLine();
		
		//��ʽ1�����ַ�����ƴ��
		String s1 = myReverse(s);
		System.out.println(s1);
		
		//��ʽ2����StringBuffer��reverse()����
		String s2 = myReverse2(s);
		System.out.println(s2);
	}
	//��StringBuffer��reverse()����
	public static String myReverse2(String s) {
//		StringBuffer sb = new StringBuffer();
//		sb.append(s);
		
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		sb.toString(); 
//		return sb.toString();
		
		//���װ�����
		return new StringBuffer(s).reverse().toString();
	}
	//���ַ�����ƴ��
		public static String myReverse(String s) {
		String result = "";
		
		char[] chs = s.toCharArray();
		for(int x=chs.length-1;x>=0;x--) {
			//char ch = chs[x];
			//result =+ch;
			result +=chs[x];
		}
		return result;
	}
}
