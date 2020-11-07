package class12_String;
/*
 * String类的其他功能:
   1.替换功能
	String replace(char old,char new)
	String replace(String old,String new)
   2.去除字符串两端(前后)空格	
	String trim()
   3.按字典顺序(a-z)比较两个字符串(比大小)  
	int compareTo(String str)
	int compareToIgnoreCase(String str) 
 */

public class StringDemo9 {
	public static void main(String[] args) {
//	   1.替换功能
//		String replace(char old,char new)
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		System.out.println(s1);
		System.out.println(s2);
//		String replace(String old,String new)
		String s3 = s1.replace("owo", "ak47");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("--------------");
//	   2.去除字符串两端(前后)空格	
//		String trim()
		String s4 = " hello world ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");
		System.out.println("s5:" + s5 + "---");
//	   3.按字典顺序(a-z)比较两个字符串(比大小)  
//		int compareTo(String str)
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "hdllo";
		String s11 = "hfllo";
		// 第一个字母h-h=0，第2个字母比...最后一个字母比，都一样，返回0
		System.out.println(s6.compareTo(s7));// 0
		// 第一个字母相同，第二个字母不同，ASCII码的值相减e-d
		System.out.println(s6.compareTo(s10));// 1
		// 第一个字母相同，第二个字母不同，ASCII码的值相减(前面-后面)e-f
		System.out.println(s6.compareTo(s11));// -1
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16
//		int compareToIgnoreCase(String str) 
	}
}
