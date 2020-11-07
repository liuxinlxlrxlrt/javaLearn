package Class13_StringBuffer;
/*�����⣺
 *1. String,StringBuffer,StringBuilder������
 *A��String�ǳ��Ȳ��ɱ�ģ�StringBuffer,StringBuilder�����ǿɱ��
 *B��StringBuffer��ͬ���ģ����ݰ�ȫ��Ч�ʵͣ�StringBuilder�ǲ�ͬ���ģ����ݲ���ȫ��Ч�ʸ�(���߳������)
 *
 *2.StringBuffer�����������
 *���߶����Կ�����һ��������װ����������
 *�����أ�StringBuffer���������տ��Կ�����һ���ַ�������
 *��������Է��õĶ������ݣ���������һ������
 *
 *3.������д�����
 *String��Ϊ��������
 *StringBuffer��Ϊ��������
 *
 *��ʽ������
 *		������������ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 *		���ò�������ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 *
 *ע�⣺
 *		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ����
 */

public class StringBufferDemo07 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1+"---"+s2);//hello---world
		//�ַ����ǳ���ֵ���ַ�����һ��������������ͣ�ֻ�ܵ����������Ϳ�
		//�õ���ֵ�������õĵ�ֵַ
		change(s1,s2);
		System.out.println(s1+"---"+s2);//hello---world
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1+"---"+sb2);//hello---world
		change(sb1,sb2);
		System.out.println(sb1+"---"+sb2);//hello---worldworld
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		//�������������Ҫ����ֵ
		sb2.append(sb1);
		
	}

	public static void change(String s1, String s2) {
		s1 =s2;
		s2=s1+s2;
	}
}
