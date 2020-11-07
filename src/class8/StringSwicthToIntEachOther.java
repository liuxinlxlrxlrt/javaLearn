package class8;

public class StringSwicthToIntEachOther {
	public static void main(String[] args) {
		//将整数 int 转换成字串 String A. 有3种方法:
//		String s = String.valueOf(i);
//		String s = Integer.toString(i);
//		String s = "" + i;
		
		//方法一
		int i1 = 123;
		String str1 = String.valueOf(i1);
		System.out.println(str1);
		
		//方法二
		int i2 = 456;
		String str2 =""+i2;
		System.out.println(str2);
		
		//方法三
		int i3 = 789;
		String str3 = Integer.toString(i3);
		System.out.println(str3);
		
		//将字串 String 转换成整数 int有3个方法:
//		int i = Integer.parseInt([String]); 
//		i = Integer.parseInt([String],[int radix]);
//		int i = Integer.valueOf(my_str).intValue();

		

		//方法一
		String s1 = "123";
		int i01 = Integer.parseInt(s1);
		System.out.println(i01);
		//方法二

		//方法三
		String s3 = "789";
		int i03 = Integer.valueOf(str3);
		System.out.println(i03);
	}
}
