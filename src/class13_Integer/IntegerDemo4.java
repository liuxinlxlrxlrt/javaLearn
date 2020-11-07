package class13_Integer;
/*
 * 1.���õĻ�������ת��
 *		public static String toBinaryString(int i)
 *		public static String toOctalString(int i)
 *		public static String toHexString(int i)
 *2.ʮ���Ƶ���������
 *		public static String toString(int i,int radix)
 *		��������ǿ������Ƶķ�Χ��2-36
 *		Ϊʲô�أ�1--9��a--z
 *3.�������Ƶ�ʮ����
 *		public static int parseInt(String s,int radix)
 */

public class IntegerDemo4 {
	public static void main(String[] args) {
		//ʮ���Ƶ������ơ��˽��ơ�16����
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println("--------------------");
		
		//ʮ���Ƶ���������
		System.out.println(Integer.toString(100,10));
		System.out.println(Integer.toString(100,2));
		System.out.println(Integer.toString(100,8));
		System.out.println(Integer.toString(100,16));
		System.out.println(Integer.toString(100,5));
		System.out.println(Integer.toString(100,7));
		System.out.println(Integer.toString(100,70));//100
		System.out.println(Integer.toString(100,-7));//100
		System.out.println(Integer.toString(100,1));//100
		System.out.println(Integer.toString(100,17));//5f
		System.out.println(Integer.toString(100,32));//34
		System.out.println(Integer.toString(100,37));//100
		System.out.println(Integer.toString(100,36));//2s
	
		//�������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100",10));
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("100",8));
		System.out.println(Integer.parseInt("100",16));
		System.out.println(Integer.parseInt("4f",16));
		System.out.println(Integer.parseInt("100",23));
		
		//NumberFormatException
		System.out.println(Integer.parseInt("123",2));
	}
}
