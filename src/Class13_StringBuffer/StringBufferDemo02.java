package Class13_StringBuffer;
/*
 * ��ӹ���
 *public StringBuffer append(String str):���԰���������������ӵ��ַ������������棬�������ַ�������������
 *public StringBuffer insert(int offset,String str):�� ָ��λ�ð���������������ӵ��ַ������������棬�������ַ�������������
 */

public class StringBufferDemo02 {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// ���԰���������������ӵ��ַ������������棬�������ַ�������������
//			StringBuffer sb2 = sb.append("hello");
//			
//			System.out.println("sb:"+sb);//hello
//			System.out.println("sb2:"+sb2);//hello
//			System.out.println(sb==sb2);//true
//			
		// һ��һ�����������
		sb.append("hello");
//			sb.append(true);
//			sb.append(12);
//			sb.append(34.56);

		// ���ӱ��
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);
		// �����sb:hellohellotrue1234.56

		// public StringBuffer insert(int offset,String str):
		// ��ָ��λ�ð���������������ӵ��ַ������������棬�������ַ�������������
		// ��Ӳ��ᱻ�滻��
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
		// �����sb:helloworldhellotrue1234.56
	}
}
