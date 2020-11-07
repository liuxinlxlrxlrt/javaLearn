package class12_String;
/*
 * 看程序写结果
 * 		字符串如果是变量相加，先开空间，在拼接
 * 		字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则就创建
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1+s3);//false
		System.out.println(s3.equals(s1+s2));//true
		System.out.println(s3 =="hello"+"world");//false，这个我们做错了，应该ture
		System.out.println(s3.equalsIgnoreCase("hello"+"world"));//true
	}
}
