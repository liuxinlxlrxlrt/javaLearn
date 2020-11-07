package class13_Integer;
/*
 * ��:1����100������ݵĶ����ơ��˽��ơ�ʮ�����ƽ������
 * ����2���ж�һ�������Ƿ���Int��Χ�ڵ�
 * 		����Ҫ֪��int�ķ�Χ�Ƕ��2^31
 * 
 *Ϊ�˶Ի����������ͽ��и��������������Ĳ�����Java�����ÿһ�ֻ������������ṩ�˶�Ӧ�������ͣ���װ������
 *byte			byte
 *short			short
 *int			int
 *long			long
 *float			float
 *double		double
 *char			char
 *boolean		boolean
 *
 *���õĲ���֮һ�����ڻ��������������ַ���֮���ת����
 */

public class IntegerDemo {
	public static void main(String[] args) {
		//����Ҫ�Լ�д
		//public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		
		//public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		
		//public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));
		
		
		//public static final int MAX_VALUE
		//ֵΪ 2^31-1 �ĳ���������ʾ int �����ܹ���ʾ�����ֵ
		System.out.println(Integer.MAX_VALUE);
		
		//public static final int MIN_VALUE
		//ֵΪ -2^31 �ĳ���������ʾ int �����ܹ���ʾ����Сֵ
		System.out.println(Integer.MIN_VALUE);
	}
}
