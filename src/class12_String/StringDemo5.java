package class12_String;
/*
 * ������д���
 * 		�ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ��
 * 		�ַ�������ǳ�����ӣ����ȼӣ�Ȼ���ڳ������ң�����о�ֱ�ӷ��أ�����ʹ���
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1+s3);//false
		System.out.println(s3.equals(s1+s2));//true
		System.out.println(s3 =="hello"+"world");//false��������������ˣ�Ӧ��ture
		System.out.println(s3.equalsIgnoreCase("hello"+"world"));//true
	}
}
